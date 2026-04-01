package ejercicios;

import java.util.Scanner;

public class Ejercicio033 {
	
	//COMPLETAR METODO
	public void invertirArray() {
		Scanner scanner = new Scanner(System.in);
		int [] array_numeros = new int [5];
		int [] arrayInvertido = new int [5];
		
		System.out.println("Introduce 5 números:");
		for(int i = 0; i<5; i++) {
			int numeros = scanner.nextInt();
			array_numeros[i] = numeros;
		}
		
		System.out.print("Array original: ");
		for(int j = 0; j<5; j++) {
			System.out.print(array_numeros[j]+" ");
		}
		
		System.out.print("\nArray invertido: ");
		for(int j = 4; j>=0; j--) {
			System.out.print(array_numeros[j]+" ");
		}
		
    }
    
    public static void main(String[] args) {
        Ejercicio033 ejercicio = new Ejercicio033();
        ejercicio.invertirArray();
    }
    
}
