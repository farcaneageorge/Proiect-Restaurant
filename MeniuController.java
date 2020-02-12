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
import dao.MeniuDAO;
import pojo.Meniu;


@Controller
public class MeniuController {
		@RequestMapping (value="meniuri.htm")
		public ModelAndView getMeniuri() throws SQLException {
			ModelMap model= new ModelMap();
			MeniuDAO mdao = new MeniuDAO();
			ArrayList<Meniu> meniuri =mdao.getMeniuri();
			model.put("meniuri", meniuri);
			
					
			
			return new ModelAndView("meniu/meniuri","model",model);
		}
		
		
		@RequestMapping (value="meniuri-detalii/{meniuId}")
	public ModelAndView getMeniuDetails (@PathVariable String meniuId) throws SQLException {
		
			
			MeniuDAO mdao = new MeniuDAO();
			Meniu meniu=mdao.getMeniuById(meniuId);
			
		
		ModelMap model= new ModelMap();
		model.put("meniu", meniu);
			
			
		return new ModelAndView("meniu/meniuri-detalii","model",model);		
		}
		@RequestMapping (value="meniuAdd.htm")
		public ModelAndView displayAddForm(Model model) {
			
			Meniu m = new Meniu();
			model.addAttribute("meniuForm",m);
			
			return new ModelAndView("meniu/add","model",model);
		}
		@RequestMapping (value="addMeniu.htm",method=RequestMethod.POST)
		public ModelAndView addMeniu(@ModelAttribute("meniuForm") Meniu meniu,
				ModelMap model,
				BindingResult result) {
			
			try {
				MeniuDAO mdao=new MeniuDAO();
		mdao.createMeniu(meniu);
				}
			catch(Exception ex){
				ex.printStackTrace();
				}
			return new ModelAndView("redirect:/meniuri.htm");


			
		}
		@RequestMapping (value="editMeniu/{meniuId}")
		public ModelAndView displayEditForm(@PathVariable String meniuId,Model model) throws SQLException {
			

			MeniuDAO mdao = new MeniuDAO();
			Meniu m=mdao.getMeniuById(meniuId);
			model.addAttribute("meniuForm",m);
			
			return new ModelAndView("meniu/edit","model",model);
		}
		@RequestMapping (value="editMeniu.htm",method=RequestMethod.POST)
		public ModelAndView editMeniu(@ModelAttribute("meniuForm") Meniu meniu,
				ModelMap model,
				BindingResult result) {
			
			try {
				MeniuDAO mdao=new MeniuDAO();
				mdao.updateMeniu(meniu);
				}
			catch(Exception ex){
				ex.printStackTrace();
				}
			return new ModelAndView("redirect:/meniuri.htm");


			
		}
		
		@RequestMapping (value="deleteMeniu/{meniuId}")
		public ModelAndView displayDeleteForm(@PathVariable String meniuId,Model model) throws SQLException {
			

			MeniuDAO mdao=new MeniuDAO();
			Meniu m=mdao.getMeniuById(meniuId);
			model.addAttribute("meniuForm",m);
			
			return new ModelAndView("meniu/delete","model",model);
		}
		@RequestMapping (value="deleteMeniu.htm",method=RequestMethod.POST)
		public ModelAndView deleteMeniu(@ModelAttribute("meniuForm") Meniu meniu,
				ModelMap model,
				BindingResult result) {
			
			try {
				MeniuDAO mdao = new MeniuDAO();
				mdao.delete(meniu);
				}
			catch(Exception ex){
				ex.printStackTrace();
				}
			return new ModelAndView("redirect:/meniuri.htm");

	}
	}
