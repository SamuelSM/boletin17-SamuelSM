package Bolet17;
import Bolet17.Xeometr�a;

public class Main {

	public static void main(String[] args) {
		Xeometr�a xeom = new Xeometr�a();
		int area= xeom.areaCadrado(4);
		System.out.println(" "+ area);
		int per�metro= xeom.per�metroCadrado(2);
		System.out.println(" "+ per�metro);
		double teoremaPitag= xeom.teoremaPitagoras(10,10);
		System.out.println(" "+ teoremaPitag);
		double teoremaPitagB= xeom.teoremaPitagorasB(11,10);
		System.out.println(" "+ teoremaPitagB);
	}
}
