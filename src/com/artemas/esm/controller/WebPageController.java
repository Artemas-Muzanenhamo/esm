package com.artemas.esm.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebPageController {
	
	/*@RequestMapping("/")
	public ModelAndView showHome(){
		
		//created a MandV object with the view name as a param.
		ModelAndView mv = new ModelAndView("Home");
		
		
		Map<String, Object> model = mv.getModel();
		
		//add attributes to the model.
		model.put("name", "Boris");
		
		return mv;
	} */
	
	/**
	 * This method is another way to return the view provided
	 * the method passes the model as a param.
	 * Also you can add attributes as you could in the 
	 * ModelAndView method. 
	 * 
	 * @param model - model passed in to allow you to add attributes to the model.
	 * @return - the view specified as a String.
	 */
	@RequestMapping("/")
	public String showHome(Model model){
		
		model.addAttribute("name", "Artemas");
		
		return "Home";
	}

}
