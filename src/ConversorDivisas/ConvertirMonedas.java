package ConversorDivisas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void UsdaEur (double valor) {
		double monedaEuro =  0.91 * valor;
		monedaEuro = (double)Math.round(monedaEuro * 10)/100;
		JOptionPane.showMessageDialog(null, "Tienes "+ monedaEuro+ " Euros");
	}

	public void UsdaCop (double valor) {
		double monedaCop =  4.710 * valor;
		monedaCop = (double)Math.round(monedaCop * 100)/100;
		JOptionPane.showMessageDialog(null, "Tienes "+ monedaCop+ " Pesos Colombianos");
	}
	
/*	public void UsdaUsd (double valor) {
		double monedaCop =   valor;
		monedaCop = (double)Math.round(monedaCop * 100)/100;
		JOptionPane.showConfirmDialog(null, "Tienes "+ monedaCop+ "USD");
	}*/

	
	public void EuraCop (double valor) {
		double monedaEuraCop =  5.186 * valor;
		monedaEuraCop = (double)Math.round(monedaEuraCop * 100)/100;
		JOptionPane.showMessageDialog(null, "Tienes "+ monedaEuraCop+ " Pesos Colombianos");
	}
	public void EuraUsd (double valor) {
		double monedaEuraUsd =  1.10 * valor;
		monedaEuraUsd = (double)Math.round(monedaEuraUsd * 100)/100;
		JOptionPane.showMessageDialog(null, "Tienes "+ monedaEuraUsd+ " Dolares");
	}
	
	
	public void CopaUsd (double valor) {
		double monedaCopaUsd =  0.00021 * valor;
		monedaCopaUsd = (double)Math.round(monedaCopaUsd * 100)/100;
		JOptionPane.showMessageDialog(null, "Tienes "+ monedaCopaUsd+ " Dolares");
	}
	
	public void CopaEur (double valor) {
		double monedaCopaEur =  0.00019  * valor;
		monedaCopaEur = (double)Math.round(monedaCopaEur * 100)/100;
		JOptionPane.showMessageDialog(null, "Tienes "+ monedaCopaEur+ " Euros");
	}
	
	
	
}
