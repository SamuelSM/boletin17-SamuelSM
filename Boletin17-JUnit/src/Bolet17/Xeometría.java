package Bolet17;

import java.lang.Math;
public class Xeometría {
	public int perímetroCadrado(int lado){
		//Hacer Cadrado
	System.out.println("Perímetro cadrado :");
	return lado*4;
	}

	public	int areaCadrado(int lado){ 
		//Hacer Area Cadrado
		System.out.println("Area cadrado: " );
		return lado*lado;
	}
	public double teoremaPitagoras(int catetoA, int catetoB){
		double hipotenusaC;
		//Hacer teorema de Pitágoras
		System.out.println("teorema de Pitágoras :");
		return hipotenusaC=Math.sqrt((catetoA*catetoA)+(catetoB*catetoB));

	}
}