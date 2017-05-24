package Bolet17;

import java.lang.Math;

public class Xeometría {
	/**Obtendo o valor do lado calcular o perimetro do cadrado
	 * 
	 * @param lado 
	 * @return perimetro
	 */
	
	public int perímetroCadrado(int lado){
		//Hacer Cadrado
	return lado*4;
	}
	
	/**Obtendo o valor do lado calcular a area do cadrado
	 * 
	 * @param lado 
	 * @return area
	 */
	
	public	int areaCadrado(int lado){ 
		//Hacer Area Cadrado
		return lado*lado;
	}
	
	/**Obtendo os valores de dous catetos calcular a hipotenusa
	 * 
	 * @param catetoA 
	 * @param catetoB 
	 * @return hipotenusa 
	 */
	
	public double teoremaPitagoras(int catetoA, int catetoB){
		double hipotenusaC;
		//Hacer teorema de Pitágoras
		return hipotenusaC=Math.sqrt((catetoA*catetoA)+(catetoB*catetoB));

	}
	
	/**Ca hipotenusa e co catetoA calcular o catetoB
	 * 
	 * @param hipotenusa 
	 * @param catetoA 
	 * @return catetoB
	 */
	
	public double teoremaPitagorasB(double hipotenusa, double catetoA){
		double catetoB;
		//Hacer teorema de Pitágoras
		return catetoB=Math.sqrt((hipotenusa*hipotenusa)-(catetoA*catetoA));
	}
}