package ejerciciosClasePruebas.ejercicios.listas.diapositiva45;

public class Alumno {

	// ATRIBUTOS
	private String nombre;
	private String dni;
	private double notaMedia;
	
	// CONSTRUCTOR
	public Alumno(String nombre, String dni, double notaMedia) {
		
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia = notaMedia;
		
	}
	
	// MÉTODOS
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public double getNotaMedia() {
		return this.notaMedia;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	public void mostrar() {
		
		System.out.printf("Nombre: %s\n"
				+ "DNI: %s\n"
				+ "Nota: %.2f\n"
				+ "------------------------\n", this.nombre, this.dni, this.notaMedia);
		
	}
	
}
