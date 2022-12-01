package co.edu.unbosque.model;

import java.util.Random;

public class NumeroGenerado {

	private int x;
	
	public NumeroGenerado() {
		this.x = 0;
	}
	
	public String generarDigito() {
		int numero =(int) Math.floor(Math.random()*(4-1+1)+1);
		x = numero;
		return x +"";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	
	
	
}
