package ejerciciosClasePruebas.ejercicios.listas.actividad;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {

	// Atributo
	private List<Producto> productos;
	
	// Constructor
	public CarritoCompra() {
		
		this.productos = new ArrayList<Producto>();
		
	}
	
	// Métodos
	public void agregarProducto(Producto p) {
		
		boolean existe = false;
		
		for(Producto producto : this.productos) {
			
			if(producto.getNombre().equalsIgnoreCase(p.getNombre()) && !existe) {
				
				int nuevaCantidad = producto.getCantidad() + p.getCantidad();
				producto.setCantidad(nuevaCantidad);
				existe = true;
				
			}
			
		}
		
		if(!existe) {
			
			this.productos.add(p);
			
		}
		
	}
	
	public boolean eliminarProductoPorNombre(String nombre) {
		
		boolean encontrado = false;
		Producto productoEliminar = null;
		
		for(Producto producto : this.productos) {
		
			if(producto.getNombre().equalsIgnoreCase(nombre) && !encontrado) {
				
				productoEliminar = producto;
				encontrado = true;
				
			}
			
		}
		
		if(encontrado) {
			
			this.productos.remove(productoEliminar);
			
		}
		
		return encontrado;
		
	}
	
	public Producto buscarProducto(String nombre) {
		
		Producto productoEncontrado = null;
		
		for(Producto producto : this.productos) {
			
			if(producto.getNombre().equalsIgnoreCase(nombre) && productoEncontrado == null) {
				
				productoEncontrado = producto;
				
			}
			
		}
		
		return productoEncontrado;
		
	}
	
	public double calcularTotal() {
		
		double total = 0.0;
		
		for(Producto producto : this.productos) {
			
			total += producto.calcularImporte();
			
		}
		
		return total;
		
	}
	
	public void mostrarCarrito() {
		
		for(Producto producto : this.productos) {
			
			System.out.printf("Producto: %s\n"
					+ "Cantidad: %d\n"
					+ "Precio unitario: %.2f\n"
					+ "Importe: %.2f\n", producto.getNombre(), producto.getCantidad(), producto.getPrecioUnitario(), producto.calcularImporte());
			
			System.out.println("-----------------------------------");
			
		}
		
	}
	
	public int contarProductosDistintos() {
		
		return this.productos.size();
		
	}
	
	public void ordenarPorNombre() {

		this.productos.sort((p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre()));
		
	}
	
	public void ordenarPorImporteDescendente() {
		
		this.productos.sort((p1, p2) -> Double.compare(p2.calcularImporte(), p1.calcularImporte()));
		
	}
	
}
