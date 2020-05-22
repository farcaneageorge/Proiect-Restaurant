package org.fasttrackit;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class DespreNoiController {
	
	@RequestMapping(value="despreNoi.htm",method=RequestMethod.GET)
	public ModelAndView getDespreNoi() {
		ModelMap map = new ModelMap();
		map.put("name", "George");
		map.put("time", (new Date()).toString());
		
		return new ModelAndView("despreNoi","model",map);
		
	}


}
