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
import dao.RecenzieDAO;
import pojo.Recenzie;

@Controller
public class RecenzieController {
		@RequestMapping (value="recenzi.htm")
		public ModelAndView getRecenzi() throws SQLException {
			ModelMap model= new ModelMap();
			RecenzieDAO redao = new RecenzieDAO();
			ArrayList<Recenzie> recenzi = redao.getRecenzi();
			model.put("recenzi", recenzi);
			
					
			
			return new ModelAndView("recenzie/recenzi","model",model);
		}
		
		
		@RequestMapping (value="recenzi-detalii/{recenzieId}")
		public ModelAndView getRecenzieDetails (@PathVariable String recenzieId) throws SQLException {
		
			
			RecenzieDAO redao = new RecenzieDAO();
		Recenzie recenzie=redao.getRecenzieById(recenzieId);
			
		
		ModelMap model= new ModelMap();
		model.put("recenzie", recenzie);
			
			
		return new ModelAndView("recenzie/recenzi-detalii","model",model);
		
		}
		@RequestMapping (value="recenzieAdd.htm")
		public ModelAndView displayAddForm(Model model) {
			
			Recenzie re = new Recenzie();
			model.addAttribute("recenzieForm",re);
			
			return new ModelAndView("recenzie/add","model",model);
		}
		@RequestMapping (value="addRecenzie.htm",method=RequestMethod.POST)
		public ModelAndView addRecenzie(@ModelAttribute("recenzieForm") Recenzie recenzie,
				ModelMap model,
				BindingResult result) {
			
			try {
				RecenzieDAO redao=new RecenzieDAO();
		redao.createRecenzie(recenzie);
				}
			catch(Exception ex){
				ex.printStackTrace();
				}
			return new ModelAndView("redirect:/recenzi.htm");


			
		}
		@RequestMapping (value="editRecenzie/{recenzieId}")
		public ModelAndView displayEditForm(@PathVariable String recenzieId,Model model) throws SQLException {
			

			RecenzieDAO redao = new RecenzieDAO();
			Recenzie re=redao.getRecenzieById(recenzieId);
			model.addAttribute("recenzieForm",re);
			
			return new ModelAndView("recenzie/edit","model",model);
		}
		@RequestMapping (value="editRecenzie.htm",method=RequestMethod.POST)
		public ModelAndView editRecenzie(@ModelAttribute("recenzieForm") Recenzie recenzie,
				ModelMap model,
				BindingResult result) {
			
			try {
				RecenzieDAO redao=new RecenzieDAO();
				redao.updateRecenzie(recenzie);
				}
			catch(Exception ex){
				ex.printStackTrace();
				}
			return new ModelAndView("redirect:/recenzi.htm");


			
		}
		
		@RequestMapping (value="deleteRecenzie/{recenzieId}")
		public ModelAndView displayDeleteForm(@PathVariable String recenzieId,Model model) throws SQLException {
			

			RecenzieDAO redao = new RecenzieDAO();
			Recenzie re=redao.getRecenzieById(recenzieId);
			model.addAttribute("recenzieForm",re);
			
			return new ModelAndView("recenzie/delete","model",model);
		}
		@RequestMapping (value="deleteRecenzie.htm",method=RequestMethod.POST)
		public ModelAndView deleteRecenzie(@ModelAttribute("recenzieForm") Recenzie recenzie,
				ModelMap model,
				BindingResult result) {
			
			try {
				RecenzieDAO redao = new RecenzieDAO();
				redao.delete(recenzie);
				}
			catch(Exception ex){
				ex.printStackTrace();
				}
			return new ModelAndView("redirect:/recenzi.htm");

	}
	}
