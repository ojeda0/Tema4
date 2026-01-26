package ejerciciosClasePruebas.ejercicios.listas.actividad;

public class MainCarrito {

	public static void main(String[] args) {

		CarritoCompra carrito1 = new CarritoCompra();
		
		Producto producto1 = new Producto("Brick de leche", 5.00, 2);
		Producto producto2 = new Producto("Tomate", 2.00, 5);
		Producto producto3 = new Producto("Lechuga", 2.50, 3);
		Producto producto4 = new Producto("Brick de leche", 5.00, 1);
		
		carrito1.agregarProducto(producto1);
		carrito1.agregarProducto(producto2);
		carrito1.agregarProducto(producto3);
		carrito1.agregarProducto(producto4);
		
		carrito1.mostrarCarrito();
		
		
		// Preguntar a Vladi
		// System.out.println(carrito1.buscarProducto("Lechuga"));
		
		System.out.println("================================");
		
		carrito1.eliminarProductoPorNombre("Tomate");
		carrito1.mostrarCarrito();
		
		System.out.println(carrito1.calcularTotal());

	}

}
