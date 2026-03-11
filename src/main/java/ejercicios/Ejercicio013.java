package ejercicios;

public class Ejercicio013 {
	
	//COMPLETAR METODO
	public void mostrarPrimeros20Pares() {
        int contador = 0;
        int numero = 0;
        System.out.print("Los primeros veinte números pares:");
        
        while(contador < 21) {
        	if(numero % 2 == 0) {
        		System.out.println(numero+" ");
        		contador++;
        	}
        	numero++;
        }
    }

    public static void main(String[] args) {
    	Ejercicio013 ejercicio013 = new Ejercicio013();
    	ejercicio013.mostrarPrimeros20Pares();
    }
}
