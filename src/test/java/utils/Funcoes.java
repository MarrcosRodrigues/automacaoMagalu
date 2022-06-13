package utils;

public class Funcoes {
	
	public static Double removeCifraoDevolveDouble(String texto) {
		texto = texto.replace("R$ ", "");
		return Double.parseDouble(texto);
	}

}
