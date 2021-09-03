package com.nandit.Scopes;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Scope;
import com.google.inject.Scopes;
import com.google.inject.Inject;
import com.google.inject.AbstractModule;




// Main Class
public class Singleton {
	
	private static final String SQUARE_REQ = "SQUARE";

	private static void sendRequest(String squareReq) {
		
		if(squareReq.equals(SQUARE_REQ)) {
			
//			DrawShape d = new DrawSquare();
			Injector injector = Guice.createInjector(new AppModule());
			SquareRequest req1 = injector.getInstance(SquareRequest.class);
			req1.makeRequest();
			
			
			SquareRequest req2 = injector.getInstance(SquareRequest.class);
			req2.makeRequest();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sendRequest(SQUARE_REQ);

	}
}




// Drawshape Interface
interface DrawShape {
	void draw();
}

// Drawsquare Class Implementation
//@javax.inject.Singleton
class DrawSquare implements DrawShape{
	Long size;
	
	@Inject
	public void setSize() {
		this.size = Math.round(Math.random()*100);
	}
	
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Square of Color of Size : "+size);
	}
}




// Request Class which is dependent on Drawshape 
class SquareRequest {
	DrawShape d;
	
	@Inject
	public SquareRequest(DrawShape d) {
		this.d = d;
	}
	
	public void makeRequest() {
		d.draw();
	}
	
	public DrawShape getDrawShape() {
		return this.d;
	}
}




// App module Implementation
class AppModule extends AbstractModule{
 
	@Override
	public void configure() {
		bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON);
//		bind(DrawShape.class).to(DrawSquare.class);
//		bind(DrawSquare.class).in(Scopes.SINGLETON);

	}
	
}

