package Bolet17;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DNI {
	private char[] DniLetra = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S',
			'T', 'V', 'W', 'X', 'Y', 'Z' };
	
	/**Co boolean comprobaremos que o String nos devolva un DNI
	 * 
	 * 
	 * @param numeroLetra
	 * @return true se hai DNI correcto, false para DNI falso
	 */
	
	public boolean eValido(String numeroLetra) {
		boolean correcto = false;

		Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
		/* creo un patron que me saque 8 digitos y un caracter */
		Matcher matcher = pattern.matcher(numeroLetra);
		/* Creo el matcher como marcador del patrón */
		if (matcher.matches()) {
			String letra = matcher.group(2);
			String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
			/* Vendría siendo el tipo de dato usado para sacar la letra */
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
	/* Comparo el string reference con el string letra ignorando los casos de consideración */

	/**Co boolean comprobaremos que o Arraylist nos devolva un DNI
	 * 
	 * 
	 * @param numeroLetra
	 * @return true se hai DNI correcto, false para DNI falso
	 */
	
	public boolean eValido(ArrayList<Integer> numeros, char letra) {
		if (numeros.size() == 8) {
			/* Aquí compruebo que el String tenga el tamaño correcto */
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
	/**Partindo de un String no que solo pasamos o número, sacaremos a letra que corresponde
	 * 
	 * 
	 * @param numero
	 * @return letra
	 */
	public int calculaLetra(String numero) {		

		if (numero.length() == 8) {
			for (int i = 0; i < numero.length(); i++)
				if (numero.charAt(i) < '0' || numero.charAt(i) > '9')
					return -1;
			/* Aquí compruebo que el String tenga la longitud correcta */
		} else
			return -1;
		
		int number = Integer.parseInt(numero);
		/* Transformo la cadena String y hago que devuelva un valor numérico */
		int letra = number % 23;
		/* Aquí fago o modulo*/
		return letra;
	}
	/**Partindo de un ArrayList no que solo pasamos o número, sacaremos a letra que corresponde
	 * 
	 * 
	 * @param numero
	 * @return letra
	 */
	public int calculaLetra(ArrayList<Integer> numeros) {
		int numero = 0;
		if (numeros.size() == 8) {
			/* Aquí compruebo que el String tenga el tamaño correcto */
			for (int i = 0; i < 8; i++)
				numero = numero + numeros.get(i);
			int letra = numero % 23;
			return letra;
			/* Aquí fago o modulo*/
		} else
			 return -1;  
	}
}