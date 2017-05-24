package Bolet17;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Xeometr�aTest {

	@Test
	public void testper�metroCadrado() {
		Xeometr�a operacions= new Xeometr�a();
		assertEquals(4,operacions.per�metroCadrado(1));
		assertEquals(0,operacions.per�metroCadrado(0));
		assertEquals(-4,operacions.per�metroCadrado(-1));
		assertEquals(20,operacions.per�metroCadrado(5));
		assertEquals(-20,operacions.per�metroCadrado(-5));
	}

	@Test
	public void testareaCadrado() {
		Xeometr�a operacions= new Xeometr�a();
		assertEquals(1,operacions.areaCadrado(1));
		assertEquals(0,operacions.areaCadrado(0));
		assertEquals(4,operacions.areaCadrado(2));
		assertEquals(9,operacions.areaCadrado(3));
		assertEquals(1,operacions.areaCadrado(-1));
		assertEquals(4,operacions.areaCadrado(-2));
		assertEquals(9,operacions.areaCadrado(-3));
	}
	@Test
	public void testteoremaPitagoras() {
		Xeometr�a operacions= new Xeometr�a();
		assertEquals(1.414,operacions.teoremaPitagoras(1,1), Math.sqrt(2));
		assertEquals(2,operacions.teoremaPitagoras(0,2), Math.sqrt(4));
		assertEquals(2,operacions.teoremaPitagoras(2,0), Math.sqrt(25));
		assertEquals(0,operacions.teoremaPitagoras(0,0), Math.sqrt(0));
		assertEquals(5,operacions.teoremaPitagoras(3,4), Math.sqrt(25));
		assertEquals(5,operacions.teoremaPitagoras(-3,4), Math.sqrt(25));
		assertEquals(5,operacions.teoremaPitagoras(3,-4), Math.sqrt(25));
		assertEquals(5,operacions.teoremaPitagoras(-3,-4), Math.sqrt(25));
	}
	@Test
	public void testteoremaPitagorasB() {
		Xeometr�a operacions= new Xeometr�a();

		assertEquals(0,operacions.teoremaPitagorasB(0,0), Math.sqrt(0));
		assertEquals(Double.NaN,operacions.teoremaPitagorasB(0,2), Math.sqrt(-4));
		assertEquals(2,operacions.teoremaPitagorasB(2,0), Math.sqrt(4));
		assertEquals(0,operacions.teoremaPitagorasB(1,1), Math.sqrt(0));
		assertEquals(Double.NaN,operacions.teoremaPitagorasB(3,4), Math.sqrt(-9));
		assertEquals(Double.NaN,operacions.teoremaPitagorasB(-3,4), Math.sqrt(-9));
		assertEquals(Double.NaN,operacions.teoremaPitagorasB(3,-4), Math.sqrt(-9));
		assertEquals(Double.NaN,operacions.teoremaPitagorasB(-3,-4), Math.sqrt(-9));
	
	}
}
