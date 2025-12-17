package ejerciciosClasePruebas.ejercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Diapositiva21 {

	public static void main(String[] args) {
		
		/*
		 * Introduce por teclado un número n; a continuación, solicita al usuario que teclee n números 
		 * y los introduzca en una tabla. Después debes recorrerla y realizar la media de los números positivos, 
		 * la media de los negativos y cuenta el número de ceros introducidos.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el tamaño de la tabla:");
		int tamano = sc.nextInt();
		
		int[] numeros = new int[tamano];
		
		for(int i=0; i<=numeros.length-1; i++) {
			
			System.out.printf("Introduce un número para la posición %d:\n", i);
			numeros[i] = sc.nextInt();
			
		}
		
		int contadorPositivos = 0;
		double sumaPositivos = 0;
		int contadorNegativos = 0;
		double sumaNegativos = 0;
		int contadorCeros = 0;
		
		for(int e : numeros) {
			
			if(e > 0) {
				
				contadorPositivos ++;
				sumaPositivos += e;
				
			}else if(e < 0) {
				
				contadorNegativos++;
				sumaNegativos += e;
				
			}else {
				
				contadorCeros++;
				
			}
			
		}
		
		System.out.printf("La tabla introducida ha sido: %s\n"
				+ "La media de los números positivos es de %.2f\n"
				+ "La media de los números negativos es de %.2f\n"
				+ "El número de ceros totales es de %d\n", Arrays.toString(numeros), sumaPositivos/contadorPositivos, sumaNegativos/contadorNegativos, contadorCeros);
		
		sc.close();
		
	}

}
