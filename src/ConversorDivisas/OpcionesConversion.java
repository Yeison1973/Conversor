package ConversorDivisas;

import javax.swing.JOptionPane;

public class OpcionesConversion {

	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMoneda(double valor) {
		
		String opcion = (JOptionPane.showInputDialog(null,
				"Elije la moneda que deseas convertir tu dinero ",  "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
						{"De Dólar a Pesos", "De Dólar a Euro", "De Euro a Dólar", "De Euro a Pesos",
								"De Pesos a Dólar", "De Pesos a Euro"}, 
						"Seleccion")).toString();
		
		switch (opcion) {
		case "De Dólar a Euro": {
			monedas.UsdaEur(valor);
			break;
		}
		
		case "De Dólar a Pesos": {
			monedas.UsdaCop(valor);
			break;
		}
		
		case "De Euro a Pesos": {
			monedas.EuraCop(valor);
			break;
		}
		case "De Euro a Dólar": {
			monedas.EuraUsd(valor);
			break;
		}
		case "De Pesos a Dólar": {
			monedas.CopaUsd(valor);
			break;
		}
		case "De Pesos a Euro": {
			monedas.CopaEur(valor);
			break;
		}
	
		
		}
	}

	
}
