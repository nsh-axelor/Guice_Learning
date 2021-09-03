package com.nandit.SquareExample;

import javax.inject.Inject;

import com.google.inject.name.Named;

public class DrawSquare implements DrawShape{
	String color;
	Integer edge;
	
	@Inject
	public DrawSquare(@ColorValue String color,@Named("EdgeValue") Integer edge) {
		super();
		this.color = color;
		this.edge = edge;
	}
	
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Square of Color "+this.color+" and edges : "+this.edge+" !");
	}
}
