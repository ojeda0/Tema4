package ejerciciosClasePruebas.ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

public class BibliotecaArrays {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(generaArrayInt(10, 1, 9)));

	}
	
	public static int[] generaArrayInt (int n, int minimo, int maximo) {
		
		int[] arrayGenerado = new int[n];
		
		Random r1 = new Random();
		
		for(int i=0; i<=arrayGenerado.length-1; i++) {
			
			arrayGenerado[i] = r1.nextInt(minimo, maximo+1);
			
		}
		
		return arrayGenerado;
		
	}
	
	public static int maximoArrayInt (int[] tabla) {
		
		int numeroMaximo = tabla[0];
		
		for(int e : tabla) {
			
			if(e > numeroMaximo) {
				
				numeroMaximo = e;
				
			}
			
		}
		
		return numeroMaximo;
		
	}

}