package Operaciones;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class OpReservas {
	
	public void verReservas() {
		Scanner input = new Scanner(System.in);
		int id;
		
		System.out.println("Escibre el id de la reserva que quieras ver: \r\n");
		id = input.nextInt();
		
		String sql = "SELECT * FROM `reservas` WHERE `id` LIKE" + id;
		System.out.println(sql);
	}
	
	public void eliminarReservas() {
		Scanner input = new Scanner(System.in);
		int id;
		
		System.out.println("Escribe el id de la reserva que quieras eliminar: \r\n");
		id = input.nextInt();
		
		String sql = "DELETE FROM `reservas` WHERE `id` LIKE" + id;
		System.out.println(sql);
	}
	
	public void crearReservas() {
		Scanner input = new Scanner(System.in);
		int id;
		int id_habitacion;
		String dni;
		LocalDate desde;
		LocalDate hasta;
		
		System.out.println("Escribe una ID: \r\n");
		id = input.nextInt();
		
		System.out.println("Escribe una ID para la habitacion: \r\n");
		id_habitacion = input.nextInt();
		
		System.out.println("Escribe un DNI: \r\n");
		dni = input.next();
		
		System.out.println("Escribe la fecha inicial: \r\n");
		desde = LocalDate.parse(input.next());
		
		System.out.println("Escribe la fecha final: \r\n");
		hasta = LocalDate.parse(input.next());
	}
	
	public void editarReservas() {
		Scanner input = new Scanner(System.in);
		String eleccion;
		int id;
		int id_habitacion;
		String dni;
		LocalDate desde;
		LocalDate hasta;
		
		System.out.println("¿Que quieres editar de la reserva?\r\n");
		eleccion = input.next();
		
		if(eleccion=="id") {
			System.out.println("Escribe una ID nueva: \r\n");
			id = input.nextInt();
			String sql = "UPDATE `reservas` SET `id`=[id]";
			System.out.println(sql);
		}
		
		if(eleccion=="id_habitacion") {
			System.out.println("Escribe una ID para la habitacion nueva: \r\n");
			id_habitacion = input.nextInt();
			String sql = "UPDATE `reservas` SET `id_habitacion`=[id_habitacion]";
			System.out.println(sql);
		}
		
		if(eleccion=="dni") {
			System.out.println("Escribe una DNI nuevo: \r\n");
			dni = input.next();
			String sql = "UPDATE `reservas` SET `dni`=[dni]";
			System.out.println(sql);
		}
		
		if(eleccion=="desde") {
			System.out.println("Escribe una fecha de inicio nueva: \r\n");
			desde = LocalDate.parse(input.next());
			String sql = "UPDATE `reservas` SET `desde`=[desde]";
			System.out.println(sql);
		}
		
		if(eleccion=="hasta") {
			System.out.println("Escribe una fecha final nueva: \r\n");
			hasta = LocalDate.parse(input.next());
			String sql = "UPDATE `reservas` SET `hasta`=[hasta]";
			System.out.println(sql);
		}
	}
	
	public boolean seSolapan(String fechainicio, String fechafinal, String fechainicio2, String fechafinal2) {
		return false;
	}
}
