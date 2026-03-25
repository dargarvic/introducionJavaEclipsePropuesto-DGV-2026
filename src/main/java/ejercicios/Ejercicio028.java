package ejercicios;

import java.util.Scanner;

public class Ejercicio028 {
	
	private double saldo = 1000.0;  // Saldo inicial
	
	//COMPLETAR METODO
    public void cajeroAutomatico() {
    	
    	int opcion;
    	java.util.Scanner scanner = new java.util.Scanner(System.in);
    	
    	do {
    		System.out.println("\n=== MENÚ CAJERO AUTOMÁTICO ===");
            System.out.println("Para consultar el saldo pulse 1");
            System.out.println("Para ingresar saldo 2");
            System.out.println("Para retirar saldo 3");
            System.out.println("Para salir seleccione 0");
            System.out.print("¿Que operacion desea realizar?");
        	
            opcion = scanner.nextInt();
            System.out.println("Saldo actual: " + saldo);
            
    		switch (opcion) {
    			case 1: 
    				consultarSaldo();
    				break;
    			case 2: 
    				ingresarDinero(scanner);
    				break;
    			case 3: 
    				retirarDinero(scanner);
    				break;
    			case 0: 
    				System.out.println("¡Hasta luego!");
    				break;
    			default: 
    				System.out.println("Opcion inválida");
    				break;
    		}
    			
    	}while(opcion != 0);
    	
    	return;
    }
    
    //COMPLETAR METODO
    private void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }
    
    //COMPLETAR METODO
    private void ingresarDinero(Scanner scanner) {
    	System.out.print("La cantidad a ingresar:");
        int ingreso = scanner.nextInt();
        
        saldo = saldo + ingreso;
        
    	System.out.println("Ingreso realizado. Nuevo saldo: " + saldo);
    }
    
    //COMPLETAR METODO
    private void retirarDinero(Scanner scanner) {
    	System.out.print("La cantidad a ingresar:");
        int retirada = scanner.nextInt();
        
        saldo = saldo - retirada;
        
    	System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
    }

    public static void main(String[] args) {
        Ejercicio028 ejercicio = new Ejercicio028();
        ejercicio.cajeroAutomatico();
    }
    
}
