package ejercicios;

import java.util.Scanner;

public class Ejercicio034 {
	
	//COMPLETAR METODO
	public void buscarNumeroArray() {
		Scanner scanner = new Scanner(System.in);
		int [] array_numeros = new int [5];
		
		System.out.println("Introduce 5 números:");
		for(int i = 0; i<5; i++) {
			int numero = scanner.nextInt();
			array_numeros[i] = numero;
		}
		
		System.out.println("Qué elemento numero desea buscar?");
		int numeroBuscar = scanner.nextInt();
		
		boolean encontrado = false;
		for(int j=0; j< array_numeros.length; j++) {
			if(array_numeros[j] == numeroBuscar) {
				encontrado = true;
				break;
			}
		}
		
		if(encontrado) {
			System.out.println("¡El número " + numeroBuscar + " SÍ existe en el array!");
		}else {
			System.out.println("¡El número " + numeroBuscar + " NO existe en el array.");
		}
    }
    
    public static void main(String[] args) {
        Ejercicio034 ejercicio = new Ejercicio034();
        ejercicio.buscarNumeroArray();
    }
    
}
