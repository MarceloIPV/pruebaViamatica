/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.controladores;

/**
 *
 * @author marce
 */
public class controladores {
    
    //Metodo Controlador Alfanumérico
        public static boolean isAlphaNumeric(String cadena) {
                    for (int i = 0; i < cadena.length(); i++) {
                            char caracter = cadena.charAt(i);
                            if (!Character.isLetterOrDigit(caracter))
                                    return false;
                    }
                    return true;
        }
	
        //Metodo Controlador Digitos
	public static boolean containsDigit(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			if (Character.isDigit(caracter))
				return true;
		}
		return false;
	}
	
        //Metodo Controlador Mayusculas
	public static boolean containsUpperCase(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			if (Character.isUpperCase(caracter))
				return true;
		}
		return false;
	}
	
        //Metodo Longitud de String
	public static boolean lengthString(String cadena, int min, int max) {
		if (cadena.length() >= min && cadena.length() <= max)
			return true;
		return false;
	}
	
        //Metodo Controlador Sin Espacios
	public static boolean noSpaces(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			if (caracter == ' ')
				return false;
		}
		return true;
	}
	
        //Metodo Controlador Solo Numeros
	public static boolean isOnlyNumeric(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			if (!Character.isDigit(caracter))
				return false;
		}
		return true;
	}
	
        //Metodo Controlador No repetidos
	public static boolean noRepeats(String cadena) {
		for (int i = 0; i < cadena.length() - 3; i++) {
			if (cadena.charAt(i) == cadena.charAt(i + 1)
					&& cadena.charAt(i) == cadena.charAt(i + 2)
					&& cadena.charAt(i) == cadena.charAt(i + 3))
				return false;
		}
		return true;
	}
}
