package ejercicios;

import java.util.Scanner;

public class Ejercicio029 {
	
	//COMPLETAR METODO
	public void secuenciaFibonacci() {
        
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("¿Cuantas numeros de la serie de Fibonacci quieres calcular?");
		int MAX = scanner.nextInt();
		
		int primerNumero = 0;
		int segundoNumero = 1;
		int fibonacci;

		System.out.print("Secuencia Fibonacci (" + MAX + " términos):");
		
		System.out.print(primerNumero + " ");
		System.out.print(segundoNumero + " ");
		
		
		for (int i = 2; i < MAX; i++) {

			fibonacci = primerNumero + segundoNumero;
			System.out.print(fibonacci + " ");

			primerNumero = segundoNumero;
			segundoNumero = fibonacci;
		}
    }

    public static void main(String[] args) {
        Ejercicio029 ejercicio = new Ejercicio029();
        ejercicio.secuenciaFibonacci();
    }
}
