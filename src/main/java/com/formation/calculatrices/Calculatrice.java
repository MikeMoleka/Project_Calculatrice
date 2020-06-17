/**
 * 
 */
package com.formation.calculatrices;

import java.util.List;

import com.formation.interfaces.CalculatriceInterface;

/**
 * @author mengbaka
 *
 */
public class Calculatrice implements CalculatriceInterface{
	
	public double division(double a, double b) {
		
		if (b > 0) {
			return a / b;
		}
		return 0;
	}
	
	public double addition(double a, double b) {
		return a + b;
	}
	
	public double multiplication(double a, double b) {
		return a * b;
	}
	
	public double moyenne(List<Integer> tab) {
		double moyenne = 0.0;
		
		if (!tab.isEmpty()) {
			for(int i = 0; i < tab.size(); i++) {
				moyenne += tab.get(i);
			}
			moyenne = moyenne/tab.size();
		}
		return moyenne;
		
	}

}
