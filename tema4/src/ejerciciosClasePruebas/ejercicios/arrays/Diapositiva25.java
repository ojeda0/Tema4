package ejerciciosClasePruebas.ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

public class Diapositiva25 {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(rellenaPares(10, 20)));

	}
	
	public static int[] rellenaPares(int tamano, int fin) {
		
		int[] tablaOrdenada = new int[tamano];
		
		Random r1 = new Random();
		
		for(int i=0; i < tablaOrdenada.length; i++) {
			
			do {
				
				tablaOrdenada[i] = r1.nextInt(2, fin+1);
				
			}while(tablaOrdenada[i]%2 != 0);
				
		}
		
		Arrays.sort(tablaOrdenada);
		
		return tablaOrdenada;
		
	}

}
