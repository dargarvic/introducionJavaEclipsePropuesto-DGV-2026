package ejercicios;

public class Ejercicio010 {
	
	//COMPLETAR METODO
	public void mostrarFor() {
		System.out.println("FOR ");
        for (int contador = 1; contador < 101; contador++) {
        	System.out.println("FOR "+contador+" ");
        }
    }
	
	//COMPLETAR METODO
    public void mostrarWhile() {
        int contador2 = 1;
        System.out.println("WHILE ");
        while (contador2 < 101) {
        	System.out.println(contador2+" ");
        	contador2 ++;
        }
    }
    
  //COMPLETAR METODO
    public void mostrarDoWhile() {
        int contador3 = 1;
        System.out.println("DO-WHILE");
    	do {
    		System.out.println(contador3+" ");
    		contador3 ++;
        }while (contador3 < 101);
    }

    public static void main(String[] args) {
    	Ejercicio010 ejercicio010 = new Ejercicio010();
    	ejercicio010.mostrarFor();
    	ejercicio010.mostrarWhile();
    	ejercicio010.mostrarDoWhile();
    }
}
