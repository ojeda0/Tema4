package ejerciciosClasePruebas.ejercicios.listas.actividad2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {

	// ATRIBUTOS
	private int numeroHabitacion;
	private String nombreCliente;
	private LocalDate fechaEntrada;
	private int noches;
	
	// CONSTRUCTOR
	public Reserva(int numeroHabitacion, String nombreCliente, String fechaEntrada, int noches) {
		
		this.numeroHabitacion = numeroHabitacion;
		this.nombreCliente = nombreCliente;
		this.fechaEntrada = LocalDate.parse(fechaEntrada, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.noches = noches;
		
	}
	
	// GETTERS Y SETTERS
	public int getNumeroHabitacion() {
		
		return this.numeroHabitacion;
		
	}
	
	public String getNombreCliente() {
		
		return this.nombreCliente;
		
	}
	
	public LocalDate getFechaEntrada() {
		
		return this.fechaEntrada;
		
	}
	
	public int getNoches() {
		
		return this.noches;
		
	}
	
	public void setNumeroHabitacion(int numeroHabitacion) {
		
		this.numeroHabitacion = numeroHabitacion;
		
	}
	
	public void setNombreCliente(String nombreCliente) {
		
		this.nombreCliente = nombreCliente;
		
	}
	
	public void setFechaEntrada(LocalDate fechaEntrada) {
		
		this.fechaEntrada = fechaEntrada;
		
	}
	
	public void setNoches(int noches) {
		
		this.noches = noches;
		
	}
	
	// MÉTODOS
	public double calcularPrecio(int precioPorNoche) {
		
		return this.noches * precioPorNoche;
		
	}
	
	public void mostrarInfo() {
		
		System.out.printf("Número de habitación: %d\n"
				+ "Nombre del cliente: %s\n"
				+ "Fecha de entrada: %s\n"
				+ "Número de noches: %d\n",this.numeroHabitacion, this.nombreCliente , this.fechaEntrada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), this.noches);
		
	}
	
}
