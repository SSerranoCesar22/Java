package com.main;

import com.entities.HastaNunqui;
import com.entities.HolaMundo;

public class Main {

	public static void main(String[] args) {
		HolaMundo hi = new HolaMundo();
		HastaNunqui bye = new HastaNunqui();
		System.out.println(hi.saludar());
		System.out.println(bye.patada());
		//si hago el import individual de hola mundo solo puedo acceder a los metodes de hola mundo
		//si intento llamar hasta nunqui sin importarlo no se puede acceder a los metodos, se puede solucionar importando las clases 
	}
	
}
