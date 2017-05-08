package Bolet17;

import java.lang.Math;
public class Xeometría {
	public int perímetroCadrado(int lado){
		//Hacer Cadrado
	System.out.print("Perímetro cadrado :");
	return lado*4;
	}

	public	int areaCadrado(int lado){ 
		//Hacer Area Cadrado
		System.out.print("Area cadrado: " );
		return lado*lado;
	}
	public double teoremaPitagoras(int catetoA, int catetoB){
		double hipotenusaC;
		//Hacer teorema de Pitágoras
		System.out.print("teorema de Pitágoras para calcular hipotenusa :");
		return hipotenusaC=Math.sqrt((catetoA*catetoA)+(catetoB*catetoB));

	}
	public double teoremaPitagorasB(double hipotenusa, double catetoA){
		double catetoB;
		//Hacer teorema de Pitágoras
		System.out.print("teorema de Pitágoras para calcular cateto B :");
		return catetoB=Math.sqrt((hipotenusa*hipotenusa)-(catetoA*catetoA));
	}
}