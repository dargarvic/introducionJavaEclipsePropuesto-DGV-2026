package ejercicios;

import java.util.Scanner;

public class Ejercicio031 {
	
	//COMPLETAR METODO
	public void sumarElementosArray() {
		Scanner scanner = new Scanner(System.in);
		int [] array_numeros = new int [5];
		
		System.out.println("Introduce 5 números:");
		for(int i = 0; i<5; i++) {
			int numero = scanner.nextInt();
			array_numeros[i] = numero;
		}
		
		int suma = 0;
		for(int j = 0; j<5; j++) {
			suma += array_numeros[j];
		}
		System.out.print("La suma total es: " + suma);
    }
    
    public static void main(String[] args) {
        Ejercicio031 ejercicio = new Ejercicio031();
        ejercicio.sumarElementosArray();
    }
    
}
