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
	private Calculatrice calculatriceInterface;
	List<Integer> tab = new ArrayList<Integer>();
	
	@Before
	public void init() {
		calculatriceInterface = new Calculatrice();
		
		tab.add(3);
		tab.add(6);
		tab.add(3);
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
		assertEquals(0.0, calculatriceInterface.moyenne(),0.0);
		calculatriceInterface.setTab(tab);
		assertEquals(4.0, calculatriceInterface.moyenne(),0.0);
	}

}
