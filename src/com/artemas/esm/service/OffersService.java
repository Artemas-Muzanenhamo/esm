package com.artemas.esm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artemas.esm.dao.OffersDAO;
import com.artemas.esm.model.Offer;

@Service("offersService")
public class OffersService {
	
	private OffersDAO offersDao;
	
	@Autowired
	public void setOffersDao(OffersDAO offersDao){
		this.offersDao = offersDao;
	}
	
	public List<Offer> getCurrent(){
		//to get our list we need to use our DAO.
		
		return offersDao.getOffers();
	}
	
	/**
	 * Method call to the DAO to create the offer object 
	 * passed in.
	 * @param offer - object passed in from the Service 
	 * Layer.
	 */
	public void create(Offer offer) {
		offersDao.create(offer);
		
	}

	public void throwTestException() {
		offersDao.getOffer(9999);
		
	}
}
