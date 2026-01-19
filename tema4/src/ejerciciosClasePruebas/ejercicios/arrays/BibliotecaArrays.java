package ejerciciosClasePruebas.ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

public class BibliotecaArrays {

	public static void main(String[] args) {
		
		int[] arrayPrueba = generaArrayInt(10, 1, 9);
		
		System.out.println("Array generado: " + Arrays.toString(arrayPrueba));
		System.out.println("Número mínimo del array: " + (minimoArrayInt(arrayPrueba)));
		System.out.println(("Número máximo del array: " + maximoArrayInt(arrayPrueba)));
		System.out.println(("Media del array: " + mediaArrayInt(arrayPrueba)));

	}
	
	// EJ 1
	
	public static int[] generaArrayInt (int n, int minimo, int maximo) {
		
		int[] arrayGenerado = new int[n];
		
		Random r1 = new Random();
		
		for(int i=0; i<=arrayGenerado.length-1; i++) {
			
			arrayGenerado[i] = r1.nextInt(minimo, maximo+1);
			
		}
		
		return arrayGenerado;
		
	}
	
	// EJ 2
	
	public static int minimoArrayInt (int[] tabla) {
		
		int numeroMinimo = tabla[0];
		
		for(int e : tabla) {
			
			if(e < numeroMinimo) {
				
				numeroMinimo = e;
				
			}
			
		}
		
		return numeroMinimo;
		
	}
	
	// EJ 3
	
	public static int maximoArrayInt (int[] tabla) {
		
		int numeroMaximo = tabla[0];
		
		for(int e : tabla) {
			
			if(e > numeroMaximo) {
				
				numeroMaximo = e;
				
			}
			
		}
		
		return numeroMaximo;
		
	}
	
	// EJ 4
	
	public static int mediaArrayInt (int[] tabla) {
		
		int sumaTotal = 0;
		
		for(int e : tabla) {
			
			sumaTotal += e;
			
		}
		
		return sumaTotal/tabla.length;
		
	}

}