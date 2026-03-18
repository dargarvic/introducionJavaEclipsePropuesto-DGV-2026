package ejercicios;

import java.util.Scanner;

public class Ejercicio024 {
	
	//COMPLETAR METODO
	public void calculadoraNotas() {
		Scanner scanner = new Scanner(System.in);
		int[] notas = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Introduce nota " + (i + 1) + ": ");
			notas[i] = scanner.nextInt();
		}
		
		int suma = 0;
		int max = notas[0];
		int min = notas[0];
		
		for (int nota : notas) {
			suma += nota;
			if (nota > max) max = nota;
			if (nota < min) min = nota;
		}
		
		int media =suma / 5;
		
		System.out.println("\n=== RESULTADOS ===");
		System.out.println("Media: " + media);
		System.out.println("Nota más alta: " + max);
		System.out.println("Nota más baja: " + min);
    	
		scanner.close();
    	
    }

    public static void main(String[] args) {
        Ejercicio024 ejercicio = new Ejercicio024();
        ejercicio.calculadoraNotas();
    }
}
