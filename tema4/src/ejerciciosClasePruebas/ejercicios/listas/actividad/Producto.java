package ejerciciosClasePruebas.ejercicios.listas.actividad;

public class Producto {

	// Atributos
	private String nombre;
	private double precioUnitario;
	private int cantidad;
	
	// Constructor
	public Producto (String nombre, double precioUnitario, int cantidad) {
		
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
		
	}
	
	// Getters y setters
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public double getPrecioUnitario() {
		
		return this.precioUnitario;
		
	}
	
	public int getCantidad() {
		
		return this.cantidad;
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public void setPrecioUnitario(double precioUnitario) {
		
		this.precioUnitario = precioUnitario;
		
	}
	
	public void setCantidad(int cantidad) {
		
		this.cantidad = cantidad;
		
	}
	
	// Métodos
	public double calcularImporte() {
		
		return this.precioUnitario * this.cantidad;
		
	}
	
}
