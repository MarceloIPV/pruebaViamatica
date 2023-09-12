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
public class ControladorUsuario {
    //Validar usuario:
	public static String validarUsuario(String cadena) {
		//Validar que no contenga signos
		if (!controladores.isAlphaNumeric(cadena))
			return "El usuario no debe contener signos";
		//Al menos un número
		if (!controladores.containsDigit(cadena))
			return "El usuario debe tener al menos un número";
		//Al menos una letra mayúscula
		if (!controladores.containsUpperCase(cadena))
			return "El usuario debe tener Al menos una letra mayúscula";
		//Longitud mínima de 8 y máxima de 20 dígitos
		if (!controladores.lengthString(cadena, 8, 20))
			return "Longitud máxima de 20 dígitos y mínima de 8 dígitos";
		return "True";
	}
	
	//Validar Password
	public static String validarPassword(String cadena) {
		//Al menos 8 dígitos (Está arriba)
		if (!controladores.lengthString(cadena, 8, 50))
			return "La contraseña debe tener un mínimo de 8 y máximo 50 dígitos";
		//Al menos una letra mayúscula (Está arriba)
		if (!controladores.containsUpperCase(cadena))
			return "La contraseña debe contener letras mayúsculas";
		//No debe contener espacios
		if (!controladores.noSpaces(cadena))
			return "La contraseña tiene espacios";
		//Al menos un signo no alfanumérico
		if (controladores.isAlphaNumeric(cadena))
			return "La contraseña debe tener al menos un signo";
		return "True";
	}	
	
	//Validar Identificación
	public static String validarIdentificacion(String cadena) {
		//Debe tener 10 dígitos (Usar el método lengthString)
		if (!controladores.lengthString(cadena, 10, 10))
			return "La identificación debe tener 10 dígitos";
		//Sólo números
		if (!controladores.isOnlyNumeric(cadena))
			return "La identificación debe tener sólo números";
		//Validar que no tenga 4 veces seguidas un mismo número
		if (!controladores.noRepeats(cadena))
			return "La identificación no debe tener 4 veces un mismo número";
		return "True";
	}
	
	//Formato Mail
	public static String formatoMail(String nombres, String apellidos, char incremental) {
		int index_espacio = apellidos.indexOf(" ");
		String apellido1 = apellidos.substring(0, index_espacio);
		String apellido2 = apellidos.substring(index_espacio+1, index_espacio+2);
		String correo = nombres.substring(0, 1) + apellido1 + apellido2;
		correo = correo.toLowerCase();
		if (incremental != '0') {
			return correo + incremental;
		}
		return correo;
	}
}
