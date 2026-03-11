package ejercicios;

public class Ejercicio011 {
	
	//COMPLETAR METODO
	public void mostrarTabla(int numero) {
		System.out.println("Tabla del " + numero+":");
        for (int tabla = 1; tabla < 11; tabla++) {
        	System.out.println(numero + " x "+tabla +" = "+(tabla*numero));
        }
    }

    public static void main(String[] args) {
    	Ejercicio011 ejercicio011 = new Ejercicio011();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Introduce un número (1-10): ");
        int numero = scanner.nextInt();

        ejercicio011.mostrarTabla(numero);

        scanner.close();
    }
}
