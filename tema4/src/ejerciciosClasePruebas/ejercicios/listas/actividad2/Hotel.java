package ejerciciosClasePruebas.ejercicios.listas.actividad2;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	// ATRIBUTOS
	private List<Reserva> reservas;
	
	// CONSTRUCTOR
	public Hotel() {
		
		this.reservas = new ArrayList<Reserva>();
		
	}
	
	// MÉTODOS
	public void nuevaReserva(Reserva r) {
		
		reservas.add(r);
		
	}
	
	public boolean cancelarReserva(int numeroHabitacion) {
		
		boolean cancelar = false;
		
		
		
		return cancelar;
		
	}
	
}
