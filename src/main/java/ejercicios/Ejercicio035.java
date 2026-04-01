package ejercicios;

import java.util.Scanner;

public class Ejercicio035 {
	
	//COMPLETAR METODO
	public void calcularMediaArray() {
		Scanner scanner = new Scanner(System.in);
		int [] array_numeros = new int [5];
		int media;
		int suma = 0;
		
		System.out.println("Introduce 5 números:");
		for(int i = 0; i<5; i++) {
			int numero = scanner.nextInt();
			array_numeros[i] = numero;
		}
		
		
		for(int j=0; j<array_numeros.length; j++) {
			suma += array_numeros[j];
		}
		media = suma / array_numeros.length;
		
		System.out.println("La media es: "+ media);
    }
    
    public static void main(String[] args) {
        Ejercicio035 ejercicio = new Ejercicio035();
        ejercicio.calcularMediaArray();
    }
    
}
