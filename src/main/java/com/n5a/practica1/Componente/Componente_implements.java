package com.n5a.practica1.Componente;

import java.util.Scanner;


public class Componente_implements implements Componente_Dependencia{

	@Override
	public String leer_teclado() {
		System.out.println("por favor ingresa tu nombre:");
		Scanner leer=new Scanner (System.in);
		return leer.nextLine();
	}

	@Override
	public void salida_mensaje(String mensaje) {
		System.out.println(mensaje);
		
	}
	
}
