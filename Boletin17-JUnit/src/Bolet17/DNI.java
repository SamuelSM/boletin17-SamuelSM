package Bolet17;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DNI {
	private char[] DniLetra = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S',
			'T', 'V', 'W', 'X', 'Y', 'Z' };

	public boolean eValido(String numeroLetra) {
		boolean correcto = false;

		Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
		/* creo un patron que me saque 8 digitos y un caracter */
		Matcher matcher = pattern.matcher(numeroLetra);
		/* Creo el matcher como marcador del patr�n */
		if (matcher.matches()) {
			String letra = matcher.group(2);
			String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
			/* Vendr�a siendo el tipo de dato usado para sacar la letra */
			int index = Integer.parseInt(matcher.group(1));

			index = index % 23;
			String reference = letras.substring(index, index + 1);
			/* Con esto hago que pueda sacar una de las 23 letras */
			if (reference.equalsIgnoreCase(letra)) {
				correcto = true;
			} else {
				correcto = false;
			}
		} else {
			correcto = false;
		}
		return correcto;
	}
	/* Comparo el string reference con el string letra ignorando los casos de consideraci�n */

	public boolean eValido(ArrayList<Integer> numeros, char letra) {
		if (numeros.size() == 8) {
			/* Aqu� compruebo que el String tenga el tama�o correcto */
			int modulo = calculaLetra(numeros);
			/* Declaro la variable modulo */
			if (DniLetra[modulo] == letra)
				return true;
			//Hago esto para validar la letra del dni
			else
				return false;
		} else
			return false;
	}

	public int calculaLetra(String numero) {
		if (numero.length() != 8)
			return 0;
		/* Aqu� compruebo que el String tenga la longitud correcta */
		int number = Integer.parseInt(numero);
		/* Transformo la cadena String y hago que devuelva un valor num�rico */
		int modulo = number % 23;
		/* Aqu� fago o modulo*/
		String Caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
		/*Declaro variable String cos Caracteres*/
		char letra = Caracteres.charAt(modulo);
		/* Declaro a letra e utilizo esta expresi�n para que me saque a letra*/
		return letra;
	}
	public int calculaLetra(ArrayList<Integer> numeros) {
		int numero = 0;
		if (numeros.size() == 8) {
			/* Aqu� compruebo que el String tenga el tama�o correcto */
			for (int i = 0; i < 8; i++)
				numero = numero + numeros.get(i);
			int modulo = numero % 23;
			return modulo;
		} else
			return -1;
	}
}