package ejerciciosClasePruebas.ejercicios.listas.diapositiva45;

public class Main {

	public static void main(String[] args) {
		
		Grupo daw = new Grupo();

		daw.agregarAlumno(new Alumno("Laura Méndez", "12345678A", 8.5));
		daw.agregarAlumno(new Alumno("Carlos Soler", "87654321B", 6.2));
		daw.agregarAlumno(new Alumno("Sara Valero", "45678912C", 9.7));
		daw.agregarAlumno(new Alumno("Jorge Ruiz", "32165498D", 5.4));
		daw.agregarAlumno(new Alumno("Marta Ortiz", "78912345E", 7.9));
	
		daw.mostrarAlumnos();
		
	}

}
