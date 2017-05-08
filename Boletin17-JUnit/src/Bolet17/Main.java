package Bolet17;
import Bolet17.Xeometría;

public class Main {

	public static void main(String[] args) {
		Xeometría xeom = new Xeometría();
		int area= xeom.areaCadrado(4);
		System.out.println(" "+ area);
		int perímetro= xeom.perímetroCadrado(2);
		System.out.println(" "+ perímetro);
		double teoremaPitag= xeom.teoremaPitagoras(10,10);
		System.out.println(" "+ teoremaPitag);
		double teoremaPitagB= xeom.teoremaPitagorasB(11,10);
		System.out.println(" "+ teoremaPitagB);
	}
}
