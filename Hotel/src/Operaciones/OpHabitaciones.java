package Operaciones;

import java.util.Scanner;

public class OpHabitaciones {
	
	public void verHabitaciones() { 
		Scanner input = new Scanner(System.in);
		int id;
		
		System.out.println("Escribe el ID de una habitacion para ver sus datos: \r\n");
		id = input.nextInt();
		
		String sql = "SELECT * FROM `habitaciones` WHERE `id` LIKE" + id; 
		System.out.println(sql);
	}
	
	public void crearHabitaciones() {  
		Scanner input = new Scanner(System.in);
		int id;
		int id_hotel;
		String numero;
		String descripcion;
		double precio;
		
		System.out.println("Escribe una id: \r\n");
		id = input.nextInt();
		
		System.out.println("Escribe un cif: \r\n");
		id_hotel = input.nextInt();
		
		System.out.println("Escribe un numero: \r\n");
		numero = input.next();
		
		System.out.println("Escribe una descripcion: \r\n");
		descripcion = input.next();
		
		System.out.println("Escribe un numero: \r\n");
		precio = input.nextDouble();
		
		String sql = "UPDATE `habitaciones` SET `id`=[id],`id_hotel`=[id_hotel],`numero`=[numero],`gerente`=[gerente],`descripcion`=[descripcion],`precio`=[precio]";
		System.out.println(sql);
		
	}
	
	public void eliminarHabitaciones() {
		Scanner input = new Scanner(System.in);
		int id;
		
		System.out.println("Escribe el ID de la habitacion que quieras ver: \r\n");
		id = input.nextInt();
		String sql = "DELETE FROM `habitaciones` WHERE `id` LIKE" + id;
		System.out.println(sql);
	}
	
	public void editarHabitaciones() { 
		Scanner input = new Scanner(System.in);
		String eleccion;
		int id;
		int id_hotel;
		String numero;
		String descripcion;
		double precio;
		
		System.out.println("¿Que quieres editar de la habitacion?\r\n");
		eleccion = input.next();
		
		if(eleccion=="id") {
			System.out.println("Escribe una ID nueva: \r\n");
			id = input.nextInt();
			String sql = "UPDATE `habitaciones` SET `id_hotel`=[id_hotel],";
			System.out.println(sql);
		}
		
		if(eleccion=="id_hotel") {
			System.out.println("Escribe un ID del hotel nueva: \r\n");
			id_hotel = input.nextInt();
			
			String sql = "UPDATE `habitaciones` SET `id_hotel`=[id_hotel],";
			System.out.println(sql);
		}
		
		if(eleccion=="numero") {
			System.out.println("Escribe un nuevo numero para la habitacion: \r\n");
			numero = input.next();
			
			String sql = "UPDATE `habitaciones` SET `numero`=[numero],";
			System.out.println(sql);
		}
		
		if(eleccion=="descripcion") {
			System.out.println("Escribe una descripcion nueva: \r\n");
			descripcion = input.next();
			
			String sql = "UPDATE `habitaciones` SET `descripcion`=[descripcion],";
			System.out.println(sql);
		}
		
		if(eleccion=="precio") {
			System.out.println("Escribe un precio nuevo para la habitacion: \r\n");
			precio = input.nextInt();
			
			String sql = "UPDATE `habitaciones` SET `precio`=[precio],";
			System.out.println(sql);
		}
	}
}
