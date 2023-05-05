package ConversorTemperatura;

import javax.swing.JOptionPane;


public class OperacionesTemp {
	
ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	public void ConvertirTemp(double valor) {
		
		String opcion = (JOptionPane.showInputDialog(null,
				"Elije la que temperatura quieres Convertir ",  "temperatura",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
						{"De Kelvin a Celsius", "De Kelvin a Fahrebheit", "De Fahrebheit a Celsius", "De Fahrebheit a Kelvin",
						"De Celsius a Kelvin", "De Celsius a Fahrebheit"}, 
						"Seleccion")).toString();
		
		switch (opcion) {
		case "De Kelvin a Celsius": {
			temperatura.KaC(valor);
			break;
		}}
		switch (opcion) {
		case "De Kelvin a Fahrebheit": {
			temperatura.KaF(valor);
			break;
		}}
		switch (opcion) {
		case "De Fahrebheit a Celsius": {
			temperatura.FaC(valor);
			break;
		}}
		switch (opcion) {
		case "De Fahrebheit a Kelvin": {
			temperatura.FaK(valor);
			break;
	}}
		switch (opcion) {
		case "De Celsius a Kelvin": {
			temperatura.CaK(valor);
			break;
	}}
		switch (opcion) {
		case "De Celsius a Fahrebheit": {
			temperatura.CaF(valor);
			break;
	}}


  }
}
