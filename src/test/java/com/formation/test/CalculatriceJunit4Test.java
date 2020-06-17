/**
 * 
 */
package com.formation.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.formation.calculatrices.Calculatrice;
import com.formation.interfaces.CalculatriceInterface;

/**
 * @author mengbaka
 *
 */
public class CalculatriceJunit4Test {
	private CalculatriceInterface calculatriceInterface;
	
	@Before
	public void init() {
		calculatriceInterface = new Calculatrice();
	}
	
	@Test
	public void division() {
		assertEquals(0.5, calculatriceInterface.division(1, 2), 0.0);
		assertEquals(0.0, calculatriceInterface.division(1, 0), 0.0);
		assertEquals(0.0, calculatriceInterface.division(1, -2), 0.0);
	}
	
	@Test
	public void addition() {
		assertEquals(15.0, calculatriceInterface.addition(7.0, 8.0), 0.0);
	}
	
	@Test
	public void multiplication() {
		assertEquals(42.0, calculatriceInterface.multiplication(6.0, 7.0), 0.0);
	}
	
	@Test
	public void moyenne() {
		List<Integer> tab1 = new ArrayList<Integer>();
		List<Integer> tab2 = new ArrayList<Integer>();
		
		tab1.add(3);
		tab1.add(6);
		tab1.add(3);
		
		assertEquals(4.0, calculatriceInterface.moyenne(tab1),0.0);
		assertEquals(0.0, calculatriceInterface.moyenne(tab2),0.0);
	}

}
