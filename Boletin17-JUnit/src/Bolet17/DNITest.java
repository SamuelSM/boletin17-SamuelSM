package Bolet17;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;



public class DNITest {
	DNI tecleando = new DNI();

	@Test
	public void testEValido() {
		assertEquals(tecleando.eValido("12345078N"),true);
		assertEquals(tecleando.eValido("32345678H"),false);
		assertEquals(tecleando.eValido("22345678$"),false);
		assertEquals(tecleando.eValido("A2345378D"),false);
		assertEquals(tecleando.eValido("4289067811"),false);
		assertEquals(tecleando.eValido("543455681"),false);
		assertEquals(tecleando.eValido("6234567"),false);
	}
	
	@Test
	public void testEValidoArray() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(0,1);
		numeros.add(1,2);
		numeros.add(2,3);
		numeros.add(3,4);
		numeros.add(4,5);
		numeros.add(5,0);
		numeros.add(6,7);
		numeros.add(7,8);
		assertEquals(tecleando.eValido(numeros,'S'),true);
		numeros.remove(5); 
		numeros.add(5,6);
		assertEquals(tecleando.eValido(numeros,'S'),false);
		numeros.remove(5); 
		numeros.add(5,6);
		assertEquals(tecleando.eValido(numeros,'S'),false);
		numeros.add(8,9);
		assertEquals(tecleando.eValido(numeros,'S'),false);
	}

	@Test
	public void testCalculaLetraArray() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(0,1);
		numeros.add(1,2);
		numeros.add(2,3);
		numeros.add(3,4);
		numeros.add(4,5);
		numeros.add(5,0);
		numeros.add(6,7);
		numeros.add(7,8);
		assertEquals(tecleando.calculaLetra(numeros),12);
		numeros.remove(5); 
		numeros.add(5,6);
		assertEquals(tecleando.calculaLetra(numeros),-1);
		numeros.remove(5);
		numeros.add(5,0);
		numeros.add(8,9);
		assertEquals(tecleando.calculaLetra(numeros),-1);
	}
	
	@Test
	public void testcalculaLetra() {
		assertEquals(tecleando.calculaLetra("12345678"),14);
		assertEquals(tecleando.calculaLetra("W2345678"),-1);
		assertEquals(tecleando.calculaLetra("$2345678"),-1);
		assertEquals(tecleando.calculaLetra("123456781"),-1);
	}
}
