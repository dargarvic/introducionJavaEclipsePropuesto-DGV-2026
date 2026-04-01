package ejercicios;

import java.util.Scanner;

public class Ejercicio032 {
	
	//COMPLETAR METODO
	public void contarParesArray() {
		Scanner scanner = new Scanner(System.in);
		int [] array_numeros = new int [5];
		
		System.out.println("Introduce 5 números:");
		for(int i = 0; i<5; i++) {
			int numero = scanner.nextInt();
			array_numeros[i] = numero;
		}
		
		int sumaPares = 0;
		for(int j=0; j<5; j++) {
			if(array_numeros[j] % 2 == 0) {
				sumaPares++;
        	}
		}
		
		System.out.print("Hay "+ sumaPares +" números pares.");
    }
	
    
    public static void main(String[] args) {
        Ejercicio032 ejercicio = new Ejercicio032();
        ejercicio.contarParesArray();
    }
    
}
