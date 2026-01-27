package ejerciciosClasePruebas.ejercicios.listas.diapositiva45;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

	// ATRIBUTOS
	private List<Alumno> alumnos;
	
	// CONSTRUCTOR
	public Grupo() {
		
		this.alumnos = new ArrayList<Alumno>();
		
	}
	
	// MÉTODOS
	public List<Alumno> getAlumnos() {
		return this.alumnos;
	}
	
	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	public void agregarAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}
	
	public boolean eliminarAlumnoPorDNI(String dni) {
		Alumno eliminar = null;
		boolean encontrado = false;
		
		for(int i=0; i<=alumnos.size()-1 && !encontrado; i++) {
			
			if(alumnos.get(i).getDni().equalsIgnoreCase(dni)) {
				
				eliminar = alumnos.get(i);
				encontrado = true;
				
			}
			
		}
		
		if(encontrado) {
			this.alumnos.remove(eliminar);
		}
		
		return encontrado;
		
	}
	
	public Alumno buscarPorDNI(String dni) {
		
		Alumno buscar = null;
		
		for(Alumno a : this.alumnos) {
			
			if(a.getDni().equalsIgnoreCase(dni)) {
				
				buscar = a;
				
			}
			
		}
		
		return buscar;
		
	}
	
	public List<Alumno> alumnosAprobados() {
		
		List<Alumno> aprobados = new ArrayList<>();
		
		for(Alumno a : this.alumnos) {
			
			if(a.getNotaMedia() >= 5.0) {
				
				aprobados.add(a);
				
			}
			
		}
		
		return aprobados;
		
	}
	
	public double notaMediaGrupo() {
		
		double mediaGrupo = 0.0;
		
		for(Alumno a : this.alumnos) {
			
			mediaGrupo += a.getNotaMedia();
			
		}
		
		return mediaGrupo/this.alumnos.size();
		
	}
	
	public int contarAlumnos() {
		
		return this.alumnos.size();
		
	}
	
	public void mostrarAlumnos() {
		
		for(Alumno a : this.alumnos) {
			
			a.mostrar();
			
		}
		
	}
	
}