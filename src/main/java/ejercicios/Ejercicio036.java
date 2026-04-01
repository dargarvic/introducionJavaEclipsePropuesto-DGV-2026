package ejercicios;

import java.util.Scanner;

public class Ejercicio036 {
	
	//COMPLETAR METODO
	public void comprobarPalindromo() {
		Scanner scanner = new Scanner(System.in);
		int [] array_numeros = new int [5];
		
		System.out.println("Introduce 5 números:");
		for(int i = 0; i<5; i++) {
			int numero = scanner.nextInt();
			array_numeros[i] = numero;
		}
		
		for (int i = 0; i < 5 / 2; i++) {
	        if (array_numeros[i] != array_numeros[4 - i]) {
	            System.out.println("El array NO es palíndromo.");
	            return;
	        }
	    }

	    System.out.println("¡El array ES palíndromo!");
	    return;
	}
    
    public static void main(String[] args) {
        Ejercicio036 ejercicio = new Ejercicio036();
        ejercicio.comprobarPalindromo();
    }
    
}
