package repasoExamen.listas;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {

	private List<Producto> productos;

	public CarritoCompra() {
		
		this.productos = new ArrayList<Producto>();
		
	}
	
	public void agregarProducto(Producto p) {
		
		boolean existe = false;
		
		for(Producto e : this.productos) {
			
			if(e.getNombre().equalsIgnoreCase(p.getNombre()) && !existe) {
				
				int nuevaCantidad = e.getCantidad() + p.getCantidad();
				e.setCantidad(nuevaCantidad);
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
		
		for(Producto e : this.productos) {
			
			if(e.getNombre().equalsIgnoreCase(nombre) && !encontrado) {
				
				productoEliminar = e;
				encontrado = true;
				
			}
			
		}
		
		if(encontrado) {
			
			this.productos.remove(productoEliminar);
			
		}
		
		return encontrado;
		
	}
	
	public Producto buscarProducto(String nombre) {
		
		Producto encontrado = null;
		
		for(Producto e : this.productos) {
			
			if(e.getNombre().equalsIgnoreCase(nombre) && encontrado == null) {
				
				encontrado = e;
				
			}
			
		}
		
		return encontrado;
		
	}
	
	public double calcularTotal() {
		
		double total = 0.0;
		
		for(Producto e : this.productos) {
			
			total += e.calcularImporte();
			
		}
		
		return total;
		
	}
	
	public void mostrarCarrito() {
		
		for(Producto e : this.productos) {
			
			System.out.printf("Producto: %s\n"
					+ "Cantidad: %d\n"
					+ "Precio unitario: %.2f\n"
					+ "Importe: %.2f\n", e.getNombre(), e.getCantidad(), e.getPrecioUnitario(), e.calcularImporte());
			
			System.out.println("----------------------------------------");
			
		}
		
	}
	
	public int contarProductosDistintos() {
		
		return this.productos.size();
		
	}
	
	
}
