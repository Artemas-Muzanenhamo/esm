package com.artemas.esm.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.artemas.esm.model.Offer;
import com.artemas.esm.service.OffersService;

@Controller
public class WebPageController {
	
	private OffersService offersService;
	
	@Autowired
	public void setOffersService(OffersService offersService){
		this.offersService = offersService;
	}
	
	//this request will handle GET request not POST requests...
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String showTest(Model model, @RequestParam("id") String id){
		
		System.out.println("ID is " + id);
		return "Home";
	}
	
	/**
	 * This method is another way to return the view provided
	 * the method passes the model as a param.
	 * Also you can add attributes as you could in the 
	 * ModelAndView method. 
	 * 
	 * @param model - model passed in to allow you to add attributes to the model.
	 * @return - the view specified as a String.
	 */
	@RequestMapping("/offers")
	public String showOffers(Model model){
		
		List<Offer> offers = offersService.getCurrent();
		
		model.addAttribute("offers", offers);
		
		return "offers"; //need offers.jsp
	}
	
	@RequestMapping("/createoffer")
	public String createOffer(Model model){
		
		model.addAttribute("offer", new Offer());
		return "createoffer"; //need createoffer.jsp
	}
	
	@RequestMapping(value="/docreate", method=RequestMethod.POST)// set in the form tag in the jsp.
	public String doCreate(Model model, @Valid Offer offer, BindingResult result){
		
		//check if the result passed in has errors...
		if(result.hasErrors()){
			return "createoffer"; // if validation fails.... return createoffer.
		}
		return "offercreated"; //need createoffer.jsp
	}

}
