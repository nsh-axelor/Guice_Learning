package com.nandit.FieldInjection;

import javax.inject.Inject;

import com.google.inject.name.Named;

public class DrawSquare implements DrawShape{
	
	@Inject 
	@Named("color")
	String color;
	
	@Inject
	@Named("edge")
	Integer edge;
	
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Square of Color : "+this.color+" and edges : "+this.edge+" !");
	}
}
