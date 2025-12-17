package ejerciciosClasePruebas.ejercicios.arrays;

public class Diapositiva23 {

	public static void main(String[] args) {
		
		/*
		 * Diseñar la función: int maximo(int t[ ]), que devuelva 
		 * el máximo valor contenido en la tabla t.
		 */
		
		int[] tabla = {1,5,9,10,20,5,30,13};
		System.out.println(maximo(tabla));
		
	}
	
	public static int maximo(int[] t) {
		
		int numeroMaximo = t[0];
		
		for(int e : t) {
			
			if(e > numeroMaximo) {
				
				numeroMaximo = e;
				
			}
			
		}
		
		return numeroMaximo;
		
	}

}
