package Bolet17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DNI {
	public boolean eValido(String numeroLetra) {
	    boolean correcto = false;

	    Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");

	    Matcher matcher = pattern.matcher(numeroLetra);

	    if (matcher.matches()) {
	        String letra = matcher.group(2);
	        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

	        int index = Integer.parseInt(matcher.group(1));

	        index = index % 23;
	        String reference = letras.substring(index, index + 1);

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
	public int calculaLetra(string numero){

	}
	public boolean eValido (ArrayList<Integer> numeros, char letra){
}
	public int calculaLetra(ArrayList<Integer> numeros){
}
}