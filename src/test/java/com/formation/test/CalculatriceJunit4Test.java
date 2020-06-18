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

/**
 * @author mengbaka
 *
 */
public class CalculatriceJunit4Test {
	private Calculatrice calculatriceInterface;
	List<Double> tab = new ArrayList<Double>();
	
	@Before
	public void init() {
		calculatriceInterface = new Calculatrice();
		
		tab.add(3.0);
		tab.add(6.0);
		tab.add(3.0);
	}
	
	@Test
	public void division() {
		
		calculatriceInterface.division(1, 2);
		assertEquals(0.5, calculatriceInterface.getDivision(), 0.0);
		calculatriceInterface.division(1, 0);
		assertEquals(0.0, calculatriceInterface.getDivision(), 0.0);
		calculatriceInterface.division(1, -2);
		assertEquals(0.0, calculatriceInterface.getDivision(), 0.0);
	}
	
	@Test
	public void addition() {
		calculatriceInterface.addition(7.0, 8.0);
		assertEquals(15.0, calculatriceInterface.getAddition(), 0.0);
	}
	
	@Test
	public void multiplication() {
		calculatriceInterface.multiplication(6.0, 7.0);
		assertEquals(42.0, calculatriceInterface.getMultiplication(), 0.0);
	}
	
	@Test
	public void moyenne() {
		assertEquals(0.0, calculatriceInterface.moyenne(),0.0);
		calculatriceInterface.setTab(tab);
		assertEquals(4.0, calculatriceInterface.moyenne(),0.0);
	}

}
