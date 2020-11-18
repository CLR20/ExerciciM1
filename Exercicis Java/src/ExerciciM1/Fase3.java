package ExerciciM1;

public class Fase3 {
	public static void main(String[] args) {
		final int any_inici = 1948;
		int calcul_traspas = 4;
		int any_naixement = 1981;
		for (int any_valor=any_inici; any_valor <= any_naixement; any_valor=any_valor+calcul_traspas) {
			System.out.println(any_valor);		
		}
		
		int es_any_traspas = any_naixement % calcul_traspas;
		String cert = " és un any de traspàs.";
		String fals = " no és un any de traspàs.";
		if (es_any_traspas == 0) {
		System.out.println(any_naixement + cert);}
		else { 
		System.out.println(any_naixement + fals);	
	}
	}
}
