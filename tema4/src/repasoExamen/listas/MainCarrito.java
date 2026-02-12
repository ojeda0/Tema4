package repasoExamen.listas;

public class MainCarrito {

	public static void main(String[] args) {
		
		CarritoCompra carrito1 = new CarritoCompra();
		
		Producto p1 = new Producto("Lechuga", 3.00, 2);
		Producto p2 = new Producto("Tomate", 5.00, 2);
		Producto p3 = new Producto("Lechuga", 3.00, 3);
		Producto p4 = new Producto("Leche", 8.00, 5);
		
		carrito1.agregarProducto(p1);
		carrito1.agregarProducto(p2);
		carrito1.agregarProducto(p3);
		carrito1.agregarProducto(p4);
		
		carrito1.mostrarCarrito();
		
		carrito1.buscarProducto("Lechuga").mostrarProducto();
		
		carrito1.eliminarProductoPorNombre("Leche");
		
		System.out.println("=====================================");
		
		carrito1.mostrarCarrito();
		
		System.out.println(carrito1.calcularTotal());

	}

}
