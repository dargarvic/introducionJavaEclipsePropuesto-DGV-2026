package ejercicios;

import java.util.Scanner;

public class Ejercicio030 {
	
	//COMPLETAR METODO
	public void procesarNumeros() {
        
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		int [] array_numeros = new int [5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Introduce un numero");
			int numero = scanner.nextInt();
			
			array_numeros[i] = numero;
		}
		
		int mayor = 0;
		
		for(int j = 0; j < 5; j++) {
			if(array_numeros[j] > mayor) {
				mayor = array_numeros[j];
			}
		}
		
		System.out.print("El mayor número es: " + mayor);
		
    }
    
    public static void main(String[] args) {
    	Ejercicio030 ejercicio030 = new Ejercicio030();
    	ejercicio030.procesarNumeros();
    }
    
}
