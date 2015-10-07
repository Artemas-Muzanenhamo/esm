package com.artemas.esm.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.artemas.esm.validation.ValidEmail;

public class Offer {
	
	private int id;
	
	//Here we can supply the validation params for our field.
	@Size(min=5, max=100, message="Name must be between 5 and 100 characters")
	private String name;
	
	@NotNull
	//@Pattern(regexp=".*\\@.*\\..*", message="This does not appear to be a valid email address.")
	@ValidEmail(message="This email is defo not valid !!")
	private String email;
	
	@Size(min=20, max=100, message="Name must be between 20 and 100 characters")
	private String text;
	
	//default constuctor.
	public Offer(){
		
	}
	
	//constructor to take in the name, email and text since the db auto increments the id, we wont need it here.
	public Offer(String name, String email, String text){
		this.name = name;
		this.email = email;
		this.text = text;
	}
	
	//constructor to take in the id, name, email and text since we will be updating a row, we need the id.
	public Offer(int id, String name, String email, String text){
		this.id = id;
		this.name = name;
		this.email = email;
		this.text = text;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "Offer [id=" + id + ", name=" + name + ", email=" + email
				+ ", text=" + text + "]";
	}
}
