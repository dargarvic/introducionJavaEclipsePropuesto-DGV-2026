package ejercicios;

import java.util.Scanner;

public class Ejercicio037 {
	
	//COMPLETAR METODO
	public void contarRepeticiones() {
		Scanner scanner = new Scanner(System.in);
		int [] numeros = new int [5];
		
		System.out.println("Introduce 5 números:");
		for(int i = 0; i<5; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			int numero = scanner.nextInt();
			numeros[i] = numero;
		}
		
		for (int i=0; i<numeros.length; i++){
			boolean yaContado = false;
			
			for(int j=0; j<i; j++) {
				if(numeros[i] == numeros[j]) {
					yaContado =true;
					break;
				}
			}
			if(!yaContado) {
				int contador = 0;
				for(int k=0; k<numeros.length; k++) {
					if(numeros[k] == numeros[i]) {
						contador++;
					}
				}
				System.out.println(numeros[i] + " se repite " + contador + " vez/veces");
			}
		}
		
		scanner.close();
		
    }
    
    public static void main(String[] args) {
        Ejercicio037 ejercicio = new Ejercicio037();
        ejercicio.contarRepeticiones();
    }
}
