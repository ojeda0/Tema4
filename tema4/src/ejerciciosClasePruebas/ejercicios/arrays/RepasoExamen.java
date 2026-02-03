package ejerciciosClasePruebas.ejercicios.arrays;

public class RepasoExamen {

	public static void main(String[] args) {
		
		int[] array1 = {1,1,1,2,2,3};
		int[] array2 = {1,1,1,2,2,2,2,3};
		int[] array3 = {5,4,5,3,2,1,5};
		
		System.out.printf("Moda del array: %d\n", calculaModaInt(array1));
		System.out.printf("Moda del array: %d\n", calculaModaInt(array2));
		System.out.printf("Moda del array: %d\n", calculaModaInt(array3));

	}
	
//	18. Desarrollar la función calculaModaInt, que nos devuelve el valor que más se repite en un array de enteros. 
//	En caso de que varios valores se repitan las mismas veces, se devuelve el que encontremos primero. Ejemplos:
	//	calculaModaInt({1,1,1,2,2,3}): 1
	//	calculaModaInt({1,1,1,2,2,2,2,3}): 2
	//	calculaModaInt({1,1,1,2,2,2,3}): 1
	
	public static int calculaModaInt(int[] array) {
		
		int moda = 0;
		int maximoRepetido = 0;
		
		for(int e : array) {
			
			int repeticiones = 0;
			
			for(int f : array) {
				
				if(e == f) {
					
					repeticiones++;
					
				}
				
			}
			
			if(repeticiones > maximoRepetido) {
				
				maximoRepetido = repeticiones;
				moda = e;
				
			}
			
		}
		
		return moda;
		
	}


}
