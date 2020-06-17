/**
 * 
 */
package com.formation.calculatrices;

import java.util.ArrayList;
import java.util.List;

import com.formation.interfaces.CalculatriceInterface;

/**
 * @author mengbaka
 *
 */
public class Calculatrice implements CalculatriceInterface{
	
	private List<Integer> tab = new ArrayList<Integer>();
	
	public List<Integer> getTab() {
		return tab;
	}

	public void setTab(List<Integer> tab) {
		if (!tab.isEmpty()) {
			this.tab = tab;
		}
	}

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
	
	public double moyenne() {
		double moyenne = 0.0;
		
		if (!this.tab.isEmpty()) {
			for(int i = 0; i < this.tab.size(); i++) {
				moyenne += this.tab.get(i);
			}
			moyenne = moyenne/this.tab.size();
		}
		return moyenne;
		
	}

}
