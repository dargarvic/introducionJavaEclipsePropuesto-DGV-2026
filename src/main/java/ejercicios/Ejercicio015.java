package ejercicios;

import java.util.Scanner;

public class Ejercicio015 {
	
	//COMPLETAR METODO
	public void mostrarMultiplosTres(int n) {
		if (n < 3) {
			System.out.println("No debe mostrar múltiplos si N < 3");
			return;
		}
		System.out.println("Múltiplos de 3 hasta " + n);
		for (int contador = 1; contador < n+1; contador++) {
			if (contador % 3 == 0) {
				System.out.print(contador + " ");
			}
		}
    }

    public static void main(String[] args) {
    	Ejercicio015 ejercicio015 = new Ejercicio015();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número N: ");
        int n = scanner.nextInt();
        
        if (n < 1) {
            System.out.println("Introduce un número positivo.");
        } else {
        	ejercicio015.mostrarMultiplosTres(n);
        }
        
        scanner.close();
    }
}
