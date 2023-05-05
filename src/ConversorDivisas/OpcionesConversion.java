package ConversorDivisas;

import javax.swing.JOptionPane;

public class OpcionesConversion {

	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMoneda(double valor) {
		
		String opcion = (JOptionPane.showInputDialog(null,
				"Elije la moneda que deseas convertir tu dinero ",  "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
						{"De D�lar a Pesos", "De D�lar a Euro", "De Euro a D�lar", "De Euro a Pesos",
								"De Pesos a D�lar", "De Pesos a Euro"}, 
						"Seleccion")).toString();
		
		switch (opcion) {
		case "De D�lar a Euro": {
			monedas.UsdaEur(valor);
			break;
		}
		
		case "De D�lar a Pesos": {
			monedas.UsdaCop(valor);
			break;
		}
		
		case "De Euro a Pesos": {
			monedas.EuraCop(valor);
			break;
		}
		case "De Euro a D�lar": {
			monedas.EuraUsd(valor);
			break;
		}
		case "De Pesos a D�lar": {
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
