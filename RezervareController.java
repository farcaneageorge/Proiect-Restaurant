package org.fasttrackit;

import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import dao.RezervareDAO;
import pojo.Rezervare;

@Controller
public class RezervareController {
		@RequestMapping (value="rezervari.htm")
		public ModelAndView getRezervari() throws SQLException {
			ModelMap model= new ModelMap();
			RezervareDAO rdao = new RezervareDAO();
			ArrayList<Rezervare> rezervari =rdao.getRezervari();
			model.put("rezervari", rezervari);
			
					
			
			return new ModelAndView("rezervare/rezervari","model",model);
		}
		
		
		@RequestMapping (value="rezervari-detalii/{rezervareId}")
		public ModelAndView getRezervareDetails (@PathVariable String rezervareId) throws SQLException {
		
			
			RezervareDAO rdao = new RezervareDAO();
		Rezervare rezervare=rdao.getRezervareById(rezervareId);
			
		
		ModelMap model= new ModelMap();
		model.put("rezervare", rezervare);
			
			
		return new ModelAndView("rezervare/rezervari-detalii","model",model);
		
		}
		@RequestMapping (value="rezervareAdd.htm")
		public ModelAndView displayAddForm(Model model) {
			
			Rezervare r = new Rezervare();
			model.addAttribute("rezervareForm",r);
			
			return new ModelAndView("rezervare/add","model",model);
		}
		@RequestMapping (value="addRezervare.htm",method=RequestMethod.POST)
		public ModelAndView addRezervare(@ModelAttribute("rezervareForm") Rezervare rezervare,
				ModelMap model,
				BindingResult result) {
			
			try {
				RezervareDAO rdao=new RezervareDAO();
		rdao.createRezervare(rezervare);
				}
			catch(Exception ex){
				ex.printStackTrace();
				}
			return new ModelAndView("redirect:/rezervari.htm");


			
		}
		@RequestMapping (value="editRezervare/{rezervareId}")
		public ModelAndView displayEditForm(@PathVariable String rezervareId,Model model) throws SQLException {
			

			RezervareDAO rdao = new RezervareDAO();
			Rezervare r=rdao.getRezervareById(rezervareId);
			model.addAttribute("rezervareForm",r);
			
			return new ModelAndView("rezervare/edit","model",model);
		}
		
		@RequestMapping (value="editRezervare.htm",method=RequestMethod.POST)
		public ModelAndView editRezervare(@ModelAttribute("rezervareForm") Rezervare rezervare,
				ModelMap model,
				BindingResult result) {
			
			try {
				RezervareDAO rdao=new RezervareDAO();
				rdao.updateRezervare(rezervare);
				}
			catch(Exception ex){
				ex.printStackTrace();
				}
			return new ModelAndView("redirect:/rezervari.htm");


			
		}
		
		@RequestMapping (value="deleteRezervare/{rezervareId}")
		public ModelAndView displayDeleteForm(@PathVariable String rezervareId,Model model) throws SQLException {
			

			RezervareDAO rdao = new RezervareDAO();
			Rezervare r=rdao.getRezervareById(rezervareId);
			model.addAttribute("rezervareForm",r);
			
			return new ModelAndView("rezervare/delete","model",model);
		}
		@RequestMapping (value="deleteRezervare.htm",method=RequestMethod.POST)
		public ModelAndView deleteRezervare(@ModelAttribute("rezervareForm") Rezervare rezervare,
				ModelMap model,
				BindingResult result) {
			
			try {
				RezervareDAO rdao = new RezervareDAO();
				rdao.delete(rezervare);
				}
			catch(Exception ex){
				ex.printStackTrace();
				}
			return new ModelAndView("redirect:/rezervari.htm");

	}
	}
