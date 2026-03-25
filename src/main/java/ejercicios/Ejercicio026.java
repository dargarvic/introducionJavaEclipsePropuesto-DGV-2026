package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio026 {
	
	//COMPLETAR METODO
	public void gestorUsuarios() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String nombre;
		int cantidad_introducidos = 0;
		String mas_corto = null;
		String mas_largo = null;
        
        do {
        	System.out.print("Introduce un nombres:");
	        nombre = scanner.nextLine();
        	
	    	if(nombre.equals("fin") && mas_corto == null && mas_largo == null) {
	        	System.out.print("No se introdujeron nombres.");
	        	return;
	        }
	    	
	    	cantidad_introducidos++;
	    	if(mas_largo == null) {
	    		mas_largo = nombre;
	    	}
	    	if(mas_corto == null) {
	    		mas_corto = nombre;
	    	}
	    	
	    	if (nombre.length() < mas_corto.length()) {
	    		mas_corto = nombre;
	    	}
	    	if (nombre.length() > mas_largo.length()) {
	    		mas_largo = nombre;
	    	}
        	
        }while(!nombre.equals("fin"));
        
        System.out.println("Cantidad de nombres: " + (cantidad_introducidos - 1));
        System.out.println("El nombre mas largo es: " + mas_largo);
        System.out.println("El nombre mas corto es: " + mas_corto);
    }

    public static void main(String[] args) {
        Ejercicio026 ejercicio = new Ejercicio026();
        ejercicio.gestorUsuarios();
    }
}
