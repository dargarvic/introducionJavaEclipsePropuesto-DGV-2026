package ejercicios;

import java.util.Scanner;

public class Ejercicio025 {
	
	//COMPLETAR METODO
	public int numerosPrimosHastaN() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        System.out.println("Números primos hasta " + numero + ":");
        for(int i = 1; i < numero; i++) {
        	if(esPrimo(i)) {
        		System.out.print(i + " ");
        	}        	
        }
        return numero;
    }
	
	//COMPLETAR METODO
	private boolean esPrimo(int n) {
		if (n <= 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Ejercicio025 ejercicio = new Ejercicio025();
        ejercicio.numerosPrimosHastaN();
    }
}
