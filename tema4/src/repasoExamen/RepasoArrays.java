package repasoExamen;

import java.util.Arrays;
import java.util.Random;

public class RepasoArrays {

	public static void main(String[] args) {
		
		//Declarar arrays
		int[] array2 = new int[5];
		array2[0] = 1;
		array2[1] = 3;
		array2[2] = 4;
		
		int[] array1 = {1,2,3,4,5};
		
		
		//Probando funciones
		int[] arrayPrueba = generaArrayInt(5, 0, 9);
		System.out.println(Arrays.toString(arrayPrueba));
		
		System.out.println(minimoArrayInt(arrayPrueba));
		
		System.out.println(maximoArrayInt(arrayPrueba));
		
		System.out.println(mediaArrayInt(arrayPrueba));
		
		System.out.println(estaEnArrayInt(arrayPrueba, 5));
		
		System.out.println(posicionEnArray(arrayPrueba, 5));
		
		System.out.println(Arrays.toString(volteaArrayInt(arrayPrueba)));
		
		System.out.println(Arrays.toString(desplazaUnoDerechaArrayInt(arrayPrueba)));
		
		System.out.println(Arrays.toString(desplazaUnoIzquierdaArrayInt(arrayPrueba)));
		
		System.out.println(calculaModaInt(arrayPrueba));
		
		System.out.println(Arrays.toString(calculaFibonacci(10)));
		
	}
	
	public static int[] generaArrayInt(int n, int minimo, int maximo) {
		
		int[] arrayGenerado = new int[n];
		Random r1 = new Random();
		
		for(int i=0; i<=arrayGenerado.length-1; i++) {
			
			arrayGenerado[i] = r1.nextInt(minimo, maximo+1);
			
		}
		
		return arrayGenerado;
		
	}
	
	public static int minimoArrayInt(int[] array) {
		
		int minimo = array[0];
		
		for(int e : array) {
			
			if(e < minimo) {
				
				minimo = e;
				
			}
			
		}
		
		return minimo;
		
	}
	
	public static int maximoArrayInt(int[] array) {
		
		int maximo = array[0];
		
		for(int e : array) {
			
			if(e > maximo) {
				
				maximo = e;
				
			}
			
		}
		
		return maximo;
		
	}
	
	public static double mediaArrayInt(int[] array) {
		
		double suma = 0.0;
		
		for(int e : array) {
			
			suma += e;
			
		}
		
		return suma/array.length;
		
	}
	
	public static boolean estaEnArrayInt(int[] array, int numero) {
		
		boolean esta = false;
		
		for(int e : array) {
			
			if(e == numero) {
				
				esta = true;
				
			}
			
		}
		
		return esta;
		
	}
	
	public static int posicionEnArray(int[] array, int numero) {
		
		int posicion = -1;
		
		for(int i=0; i<=array.length-1 && posicion == -1; i++) {
			
			if(array[i] == numero) {
				
				posicion = i;
				
			}
			
		}
		
		return posicion;
		
	}
	
	public static int[] volteaArrayInt(int[] array) {
		
		int[] arrayInvertido = new int[array.length];
		
		int posicionInvertida = 0;
		
		for(int i=array.length-1; i>=0; i--) {
			
			arrayInvertido[posicionInvertida] = array[i];
			
			posicionInvertida++;
			
		}
		
		return arrayInvertido;
		
	}
	
	public static int[] desplazaUnoDerechaArrayInt(int[] array) {
		
		int[] arrayModificado = new int[array.length];
		
		arrayModificado[0] = array[array.length-1];
		
		
		for(int i=0; i<array.length-1; i++) {
			
			arrayModificado[i + 1] = array[i];
			
		}
		
		return arrayModificado;
		
	}
	
	public static int[] desplazaUnoIzquierdaArrayInt(int[] array) {
		
		int[] arrayModificado = new int[array.length];
		
		arrayModificado[arrayModificado.length-1] = array[0];
		
		for(int i=0; i<array.length-1; i++) {
			
			arrayModificado[i] = array[i+1];
			
		}
		
		return arrayModificado;
		
	}
	
	// 18. Desarrollar la función calculaModaInt, que nos devuelve el valor que más se repite en un array de enteros. 
	// En caso de que varios valores se repitan las mismas veces, se devuelve el que encontremos primero. Ejemplos:
		// calculaModaInt({1,1,1,2,2,3}): 1
		// calculaModaInt({1,1,1,2,2,2,2,3}): 2
		// calculaModaInt({1,1,1,2,2,2,3}): 1
	
	public static int calculaModaInt(int[] array) {
		
		int moda = 0;
		
		int repeticionesMax = 0;
		
		for(int e : array) {
			
			int repeticiones = 0;
			
			for(int j : array) {
				
				if(e == j) {
					
					repeticiones++;
					
				}
				
			}
			
			if(repeticionesMax < repeticiones) {
				
				repeticionesMax = repeticiones;
				moda = e;
				
			}
			
		}
		
		return moda;
		
	}
	
	public static int[] calculaFibonacci(int n) {
		
		int[] fibonacci = new int[n];
		
		fibonacci[0] = 0;
		
		fibonacci[1] = 1;
		
		for(int i = 2; i < n; i++) {
			
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
			
		}
		
		return fibonacci;
		
	}
	
	
	
}
