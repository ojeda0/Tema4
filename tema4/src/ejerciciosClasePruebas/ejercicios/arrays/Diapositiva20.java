package ejerciciosClasePruebas.ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

public class Diapositiva20 {

	public static void main(String[] args) {
		
		/*
		 * Crear una tabla de longitud 10 que se inicializará con números aleatorios 
		 * comprendidos entre 1 y 100. Mostrar la suma de todos los números 
		 * aleatorios que se guardan en la tabla.
		 */
		
		int[] aleatorios = new int[10];
		
		Random r1 = new Random();
		
		int sumaAleatorios = 0;
		
		for(int i=0; i<=aleatorios.length-1; i++) {
			
			aleatorios[i] = r1.nextInt(1, 101);
			
			sumaAleatorios += aleatorios[i];
			
		}
		
		System.out.printf("El array generado es: %s\n"
				+ "La suma de estos números es %d\n", Arrays.toString(aleatorios), sumaAleatorios);
		
	}

}
