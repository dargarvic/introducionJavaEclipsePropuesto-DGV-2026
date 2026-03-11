package ejercicios;

public class Ejercicio014 {
	//COMPLETAR METODO
	public long calcularFactorial(int n) {
        int factorial = n;
        int total_factorial = 1;
        if(n == 0) {
        	return 1;
        }
        if(n < 0) {
        	throw new IllegalArgumentException("El factorial no se puede calcular para números negativos");
        }
		for(int contador = n-1; contador > 1; contador --) {
        	factorial = factorial * contador;
        }
		return factorial;
    }

    public static void main(String[] args) {
    	Ejercicio014 ejercicio014 = new Ejercicio014();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        try {
            long factorial = ejercicio014.calcularFactorial(numero);
            System.out.println(numero + "! = " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
