package Objetos;

import java.util.Date;

public class Reservas {
	private int id;
	private int id_habitacion;
	private String dni;
	private Date desde;
	private Date hasta;
	
	public Reservas() {}
	
	public Reservas(int id, int id_habitaciones, String dni, Date desde, Date hasta) {
		this.id = id;
		this.id_habitacion = id_habitacion;
		this.dni = dni;
		this.desde = desde;
		this.hasta = hasta;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_habitacion() {
		return id_habitacion;
	}
	public void setId_habitacion(int id_habitacion) {
		this.id_habitacion = id_habitacion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getDesde() { 
		return desde;
	}
	public void setDesde(Date desde) { 
		this.desde = desde;
	}
	public Date getHasta() { 
		return hasta;
	}
	public void setHasta(Date hasta) { 
		this.hasta = hasta;
	}
	@Override
	public String toString() {
		return "Reservas [id=" + id + ", id_habitacion=" + id_habitacion + ", dni=" + dni + ", desde=" + desde
				+ ", hasta=" + hasta + "]";
	}
	
}
