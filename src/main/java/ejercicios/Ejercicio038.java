package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio038 {
	// COMPLETAR METODO: Genera numero aleatorio 1-50
    public int generarNumeroSecreto() {
    	Random random = new Random();
    	return random.nextInt(50) + 1;
    }
    
    // COMPLETAR METODO: Compara intento con secreto y dice resultado
    public String comprobarIntento(int intento, int numeroSecreto) {
    	if(intento < numeroSecreto) {
    		return "¡Más alto!";
    	}else if(intento > numeroSecreto) {
    		return "¡Más bajo!";
    	}else {
    		return "¡CORRECTO! El número era: " + numeroSecreto;
    	}
    }

    // COMPLETAR METODO: Funcion principal que usa ambos modulos
    public void adivinarNumero() {
        Scanner scanner =new Scanner(System.in);
        int numeroSecreto = generarNumeroSecreto();
        int intento;
        boolean acertado = false;
        
        System.out.println("¡ADIVINA EL NÚMERO! (1-50)");
        
        do {
        	System.out.print("Tu intento: ");
        	intento = scanner.nextInt();
        	
        	String resultado = comprobarIntento(intento, numeroSecreto);
        	System.out.println(resultado);
        	
        	if(intento == numeroSecreto) {
        		acertado = true;
        	}
        }while (!acertado);
        
        scanner.close();
    }
    
    public static void main(String[] args) {
        Ejercicio038 ejercicio = new Ejercicio038();
        ejercicio.adivinarNumero();
    }
}
