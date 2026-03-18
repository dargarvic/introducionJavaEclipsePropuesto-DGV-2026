package ejercicios;

import java.util.Scanner;

public class Ejercicio022 {
	public void mostrarMenu() {
	Scanner scanner = new Scanner(System.in);
	int opcion;
	
	do {
		System.out.println("\n=== MENÚ CALCULADORA ===");
        System.out.println("Para sumar seleccione 1");
        System.out.println("Para restar seleccione 2");
        System.out.println("Para multiplicar seleccione 3");
        System.out.println("Para dividir seleccione 4");
        System.out.println("Para salir seleccione 0");
        System.out.print("¿Que operacion desea realizar?");
    	
        opcion = scanner.nextInt();
        
		switch (opcion) {
			case 1: 
				procesarSuma(scanner);
				break;
			case 2: 
				procesarResta(scanner);
				break;
			case 3: procesarMultiplicacion(scanner);
				break;
			case 4: procesarDivision(scanner);
				break;
			case 0: 
				System.out.println("¡Hasta luego!");
				break;
			default: 
				System.out.println("Opcion invalida");
				break;
		}
		//scanner.nextLine();
		//System.out.print("Presione ENTER para continuar...");
		//scanner.nextLine();
			
	} while(opcion != 0);
	
	scanner.close();
	
	}
        
	//COMPLETAR METODO
    private void procesarSuma(Scanner scanner) {
    	System.out.print("Primer numero: ");
    	double a = scanner.nextDouble();
    	System.out.print("Primer segundo: ");
    	double b = scanner.nextDouble();
    	System.out.println("Resultado: " + (a + b));
    }
    
    //COMPLETAR METODO
    private void procesarResta(Scanner scanner) {
    	System.out.print("Primer numero: ");
    	double a = scanner.nextDouble();
    	System.out.print("Primer segundo: ");
    	double b = scanner.nextDouble();
    	System.out.println("Resultado: " + (a - b));
    }
    
    //COMPLETAR METODO
    private void procesarMultiplicacion(Scanner scanner) {
    	System.out.print("Primer numero: ");
    	double a = scanner.nextDouble();
    	System.out.print("Primer segundo: ");
    	double b = scanner.nextDouble();
    	System.out.println("Resultado: " + (a * b));
    }
    
    //COMPLETAR METODO
    private void procesarDivision(Scanner scanner) {
    	System.out.print("Primer numero: ");
    	double a = scanner.nextDouble();
    	System.out.print("Primer segundo: ");
    	double b = scanner.nextDouble();
    	System.out.println("Resultado: " + (a / b));
    }
    
    public static void main(String[] args) {
        Ejercicio022 ejercicio = new Ejercicio022();
        ejercicio.mostrarMenu();
    }
}
