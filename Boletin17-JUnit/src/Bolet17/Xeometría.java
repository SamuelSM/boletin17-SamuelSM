package Bolet17;

import java.lang.Math;
public class Xeometr�a {
	public int per�metroCadrado(int lado){
		//Hacer Cadrado
	System.out.println("Per�metro cadrado :");
	return lado*4;
	}

	public	int areaCadrado(int lado){ 
		//Hacer Area Cadrado
		System.out.println("Area cadrado: " );
		return lado*lado;
	}
	public double teoremaPitagoras(int catetoA, int catetoB){
		double hipotenusaC;
		//Hacer teorema de Pit�goras
		System.out.println("teorema de Pit�goras :");
		return hipotenusaC=Math.sqrt((catetoA*catetoA)+(catetoB*catetoB));

	}
}