package ejercicios;

import java.util.Scanner;


public class Ejercicio001 {
	//COMPLETAR METODO
	public double suma(double d, double e) {
        return d + e;
    }
	//COMPLETAR METODO
    public double resta(double d, double e) {
        return d - e;
    }
    //COMPLETAR METODO
    public double multiplicacion(double d, double e) {
        return d * e;
    }
    //COMPLETAR METODO
    public double division(double d, double e) {
        
    	if(e == 0)
    		throw new ArithmeticException();
    	else
    		return d / e;
    }

    //COMPLETAR METODO
    public void mostrarTodasOperaciones(double num1, double num2) {
        System.out.println("La suma es igual a " + suma(num1, num2));
        System.out.println("La resta es igual a " + resta(num1, num2));
        System.out.println("La multiplicacion es igual a " + multiplicacion(num1, num2));
        System.out.println("La division es igual a " + division(num1, num2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio001 calculadora = new Ejercicio001();
        
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        
        // Muestra TODAS las operaciones
        calculadora.mostrarTodasOperaciones(num1, num2);
        
        scanner.close();
    }
}

	