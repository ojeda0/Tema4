package repasoExamen.listas;

public class Producto {

	//ATRIBUTOS
	private String nombre;
	private double precioUnitario;
	private int cantidad;
	
	//CONSTRUCTOR
	public Producto(String nombre, double precioUnitario, int cantidad) {
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
	}
	
	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double calcularImporte() {
		
		return this.precioUnitario * this.cantidad;
		
	}
	
	public void mostrarProducto() {
		
		System.out.printf("Producto: %s\n", this.getNombre());
		
	}
	
}
