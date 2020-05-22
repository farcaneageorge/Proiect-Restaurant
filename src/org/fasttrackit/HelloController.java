package org.fasttrackit;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import pojo.Rezervare;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.RezervareDAO;;

@Controller
public class HelloController {
	
	@RequestMapping(value="home.htm",method=RequestMethod.GET)
	public ModelAndView getHome() {
		ModelMap map = new ModelMap();
		map.put("name", "George");
		map.put("time", (new Date()).toString());
		
		return new ModelAndView("home","model",map);
		
	}


}
