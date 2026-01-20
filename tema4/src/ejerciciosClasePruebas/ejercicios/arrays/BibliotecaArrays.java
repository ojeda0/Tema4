package ejerciciosClasePruebas.ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BibliotecaArrays {

	public static void main(String[] args) {
		
		int[] arrayPrueba = generaArrayInt(10, 1, 9);
		
		System.out.println("Array generado: " + Arrays.toString(arrayPrueba));
		System.out.println("Número mínimo del array: " + (minimoArrayInt(arrayPrueba)));
		System.out.println(("Número máximo del array: " + maximoArrayInt(arrayPrueba)));
		System.out.println(("Media del array: " + mediaArrayInt(arrayPrueba)));
		
		System.out.println("¿Está el número indicado en el array? " + estaEnArrayInt(arrayPrueba, 5));
		System.out.println("Posición del número indicado en el array: " + posicionEnArray(arrayPrueba, 5));
		System.out.println("Array original: " + Arrays.toString(arrayPrueba));
		volteaArrayInt(arrayPrueba);
		System.out.println("Array volteado: " + Arrays.toString(arrayPrueba));
		
		diagramaTemperatura();

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
	
	public static double mediaArrayInt (int[] tabla) {
		
		double sumaTotal = 0.0;
		
		for(int e : tabla) {
			
			sumaTotal += e;
			
		}
		
		return sumaTotal/tabla.length;
		
	}
	
	// EJ 5
	
	public static boolean estaEnArrayInt (int[] tabla, int numero) {
		
		boolean estaEnArray = false;
		
		for(int e : tabla) {
			
			if(e == numero) {
				
				estaEnArray = true;
				
			}
			
		}
		
		return estaEnArray;
		
	}
	
	// EJ 6
	
	public static int posicionEnArray (int[] tabla, int numero) {
		
		int posicion = -1;
		
		for(int i=0; i<=tabla.length-1 && posicion == -1; i++) {
			
			if(tabla[i] == numero) {
				
				posicion = i;
				
			}
			
		}
		
		return posicion;
		
	}
	
	// EJ 7
	
	public static void volteaArrayInt(int[] tabla) {
		
		int[] copiaArray = Arrays.copyOf(tabla, tabla.length);
		
		int posicionOriginal = 0;
	
		for(int i=copiaArray.length-1; i>=0; i--) {
			
			tabla[posicionOriginal] = copiaArray[i];
			
			posicionOriginal++;
			
		}
		
	}
	
	/* EJ 13 Realiza un programa que pida la temperatura que ha hecho en 
	cada mes de un determinado año y que muestre a continuación un diagrama de barras horizontales con esos datos. 
	Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.*/

	public static void diagramaTemperatura() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] temperaturas = new int[12];
		
		for(int i=0; i<temperaturas.length; i++) {
			
			System.out.print("Introduce la temperatura del mes " + (i+1) + ": ");
			temperaturas[i] = sc.nextInt();
			
		}
		
		for(int i=0; i<temperaturas.length; i++) {
			
			System.out.print("Mes " + (i+1) + ": ");
			
			for(int j=0; j<temperaturas[i]; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println(" " + temperaturas[i] + "ºC");
			
		}
		
		sc.close();
		
	}
	

}