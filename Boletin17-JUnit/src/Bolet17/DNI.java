package Bolet17;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DNI {
	private char[] DniLetra = { 'A','B','C','D','E','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y',
			'Z'};
	
	public boolean eValido(String numeroLetra) {
	    boolean correcto = false;

	    Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
/* creo un patron que me saque 8 digitos y un caracter */
	    Matcher matcher = pattern.matcher(numeroLetra);
	    /* Creo el matcher como marcador del patrón */
	    if (matcher.matches()) {
	        String letra = matcher.group(2);
	        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
/*Vendría siendo el tipo de dato usado para sacar la letra */
	        int index = Integer.parseInt(matcher.group(1));

	        index = index % 23;

	        String reference = letras.substring(index, index + 1);
	        /* Con esto hago que pueda sacar una de las 23 letras*/
	        
	        if (reference.equalsIgnoreCase(letra)) {
	            correcto = true;
	        } 
	        else {
	            correcto = false;
	        }
	    } 
	    else {
	        correcto = false;
	    }
	    return correcto;
	}
	/* comparo el string reference con el string letra ignorando los casos de consideración */
	
	public boolean eValido (ArrayList<Integer> numeros, char letra){

}

	public int calculaLetra(String numero) {
		if (numero.length() != 8)
			return 0;
		int number = Integer.parseInt(numero);
		int modulo = number % 23;
		String Caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
	    char letra = Caracteres.charAt(modulo);
	    return letra; 
	}

	public int calculaLetra(ArrayList<Integer> numeros){

}
}