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
	
	private List<Double> tab;
	private double division;
	private double addition;
	private double multiplication;
	
	public Calculatrice() {
		this.tab = new ArrayList<Double>();
	}
	
	public double getMultiplication() {
		return multiplication;
	}

	public void setMultiplication(double multiplication) {
		this.multiplication = multiplication;
	}

	public double getAddition() {
		return addition;
	}

	public void setAddition(double addition) {
		this.addition = addition;
	}

	public double getDivision() {
		return division;
	}

	public void setDivision(double division) {
		this.division = division;
	}

	public List<Double> getTab() {
		return tab;
	}

	public void setTab(List<Double> tab) {
		if (!tab.isEmpty()) {
			this.tab = tab;
		}
	}

	public void division(double a, double b) {
		
		if (b > 0) {
			this.setDivision(a / b);
		} else {
			this.setDivision(0);
		}
	}
	
	public void addition(double a, double b) {
		this.setAddition(a + b);
	}
	
	public void multiplication(double a, double b) {
		this.setMultiplication(a * b);
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
