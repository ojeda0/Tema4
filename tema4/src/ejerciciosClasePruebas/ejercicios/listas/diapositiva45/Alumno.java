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
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getNotaMedia() {
		return notaMedia;
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
