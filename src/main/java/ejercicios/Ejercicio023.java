package ejercicios;

import java.util.Scanner;

public class Ejercicio023 {
	
	//COMPLETAR METODO
	public void contarVocales() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();
        
        int vocales = contarVocalesEnFrase(frase);
        System.out.println("La frase tiene " + vocales + " vocales.");
        
        scanner.close();
    }
	//COMPLETAR METODO
    private int contarVocalesEnFrase(String frase) {
    	if (frase == null) {
    		return 0;
    	}
    	
    	frase = frase.toLowerCase();
    	int contador = 0;
    	
    	for (int i = 0; i < frase.length(); i++) {
    		char letra = frase.charAt(i);
    		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
    			contador ++;
    		}
    	}
    	
    	return contador;
    }
    

    public static void main(String[] args) {
        Ejercicio023 ejercicio = new Ejercicio023();
        ejercicio.contarVocales();
    }
}
