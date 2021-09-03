package com.nandit.MethodInjection;

import javax.inject.Inject;

import com.google.inject.name.Named;

public class DrawSquare implements DrawShape{
	String color;
	Integer edge;
	

	


	@Inject
	public void setColor(@Named("color") String color) {
		this.color = color;
	}

	@Inject
	public void setEdge(@Named("edge") Integer edge) {
		this.edge = edge;
	}
	
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Square of Color "+this.color+" and edges : "+this.edge+" !");
	}
}
