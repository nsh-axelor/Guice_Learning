package com.nandit.OptionalInjection;



import com.google.inject.Inject;
import com.google.inject.name.Named;

public class DrawSquare implements DrawShape{
	
	String color = "Red";
	Integer edge = 4;
	
	@Inject(optional = true)
	public void setColor(@Named("color") String color) {
		this.color = color;
	}
	
	@Inject(optional=true)
	public void setEdge(@Named("edge") Integer edge) {
		this.edge = edge;
	}
	
	
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Square of Color : "+this.color+" and edges : "+this.edge+" !");
	}
}
