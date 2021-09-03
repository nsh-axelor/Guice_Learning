package com.nandit.SquareExample;

import com.google.inject.Guice;
import com.google.inject.Injector;


public class Main {
	
	private static final String SQUARE_REQ = "SQUARE";

	private static void sendRequest(String squareReq) {
		
		if(squareReq.equals(SQUARE_REQ)) {
			
//			DrawShape d = new DrawSquare();
			Injector injector = Guice.createInjector(new AppModule());
			SquareRequest req1 = injector.getInstance(SquareRequest.class);
			req1.makeRequest();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sendRequest(SQUARE_REQ);

	}

}
