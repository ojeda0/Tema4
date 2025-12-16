package ejerciciosClasePruebas.ejercicios.arrays;

import java.util.Arrays;

public class Diapositiva17 {

	public static void main(String[] args) {
		
		double[] sueldos = new double[5];
		
		Arrays.fill(sueldos, 1234.56);
		
		System.out.println(Arrays.toString(sueldos));
		
		for(int i=0; i<=sueldos.length-1; i++) {
			
			sueldos[i] = sueldos[i] * 1.2;
			
		}
		
		System.out.println(Arrays.toString(sueldos));
		
		//Mostrar elementos de array sin toString, con foreach o for extendido
		
		for(double e : sueldos) {
			
			System.out.print(e + ", ");
			
		}
		
	}

}
