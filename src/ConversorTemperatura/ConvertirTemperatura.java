package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {

	public void KaC (double valor) {
		double operacion = valor - 273.15;
		operacion = (double)Math.round(operacion * 100)/100;
		JOptionPane.showMessageDialog(null, "La temperatura es  "+ operacion+ " Grados" );
	}
	
	public void KaF (double valor) {
		double operacion = ((9*(valor - 273.15))/5)+32;
		operacion = (double)Math.round(operacion * 100)/100;
		JOptionPane.showMessageDialog(null, "La temperatura es  "+ operacion + " Grados" );
	}
	
	public void FaC (double valor) {
		double operacion = ((5*(valor-32))/9);
		operacion = (double)Math.round(operacion * 100)/100;
		JOptionPane.showMessageDialog(null, "La temperatura es  "+ operacion+ " Grados" );
	}
	
	public void FaK (double valor) {
		double operacion = ((5*(valor-32))/9) + 273.15;
		operacion = (double)Math.round(operacion * 100)/100;
		JOptionPane.showMessageDialog(null, "La temperatura  es  "+ operacion+ " Grados" );
	}
	
	public void CaK (double valor) {
		double operacion = valor+273.15;
		operacion = (double)Math.round(operacion * 100)/100;
		JOptionPane.showMessageDialog(null, "La temperatura es  "+ operacion+ " Grados" );
	}
	
	public void CaF (double valor) {
		double operacion = ((9*valor)/5)+32;
		operacion = (double)Math.round(operacion * 100)/100;
		JOptionPane.showMessageDialog(null, "La temperatura es  "+ operacion+ " Grados" );
	}
}
