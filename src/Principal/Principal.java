package Principal;



import javax.swing.JOptionPane;

import ConversorDivisas.OpcionesConversion;
import ConversorTemperatura.OperacionesTemp;

public class Principal {
	


	public static void main(String[] args) {
		
		OpcionesConversion conversion = new OpcionesConversion();
		OperacionesTemp conversionT = new OperacionesTemp();
		
	while (true) {

		String opciones = JOptionPane.showInputDialog(null,"<html><p style= \"color:blue ; font:25px; background:gray ; \">Seleccione una Opcion de Conversion</p></html>","Menu", 
				JOptionPane.PLAIN_MESSAGE,
				null,new Object[] {"Conversor Monedas", "Conversor Temperatura"},"Elegir").toString();
		
		switch (opciones) {
		 case "Conversor Monedas": {
			String input= JOptionPane.showInputDialog(null,"Ingrese el Valor A Convertir");
			double valorRecibido =Double.parseDouble(input);
			conversion.ConvertirMoneda(valorRecibido);
			
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea Realizar Otra Conversion?");
				if (JOptionPane.OK_OPTION == respuesta) {
					System.out.println("");
				}else {
					JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO");
				}break;
		 }			
				
		 case "Conversor Temperatura": {
			 String input2 = JOptionPane.showInputDialog(null,"Ingrese la Temperatura a Convertir");
			 double valorRecibidoT = Double.parseDouble(input2);
			 conversionT.ConvertirTemp(valorRecibidoT);
			 
			 
			 int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea Realizar Otra Conversion?");
				if (JOptionPane.OK_OPTION == respuesta) {
					System.out.println("");
				}else {
					JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO");
				}break;
		 			
		 }
			}
	
		}
	}
		
	}	

	

