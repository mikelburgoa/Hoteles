package Operaciones;

import java.util.Scanner;

public class OpUsuarios {
	
	public void crearUsuarios() { 
		Scanner input = new Scanner(System.in);
		String dni;
		String nombre;
		String apellidos;
		String direccion;
		String localidad;
		
		System.out.println("Escribe el DNI: \r\n");
		dni = input.next();
		
		System.out.println("Escribe el nombre: \r\n");
		nombre = input.next();
		
		System.out.println("Escibre el apellido: \r\n");
		apellidos = input.next();
		
		System.out.println("Escribe la direccion: \r\n");
		direccion = input.next();
		
		System.out.println("Escribe la localidad: \r\n");
		localidad = input.next();
		
		String sql = "UPDATE `clientes` SET `dni`=[dni],`nombre`=[nombre],`apellidos`=[apellidos],`direccion`=[direccion],`localidad`=[localidad]";
		System.out.println(sql);
	}
	
	public void eliminarUsuarios() {
		Scanner input = new Scanner(System.in);
		String dni;
		
		System.out.println("Escribe el DNI del usuario que quieras eliminar: \r\n");
		dni = input.next();
		
		String sql = "DELETE FROM `clientes` WHERE `dni` LIKE" + dni;
		System.out.println(sql);
	}
	
	public void verUsuarios() {
		Scanner input = new Scanner(System.in);
		String dni;
		
		System.out.println("Escribe el DNI para ver al usuario: \r\n");
		dni = input.next();
		
		String sql = "SELECT * FROM `clientes` WHERE `dni`" + dni;
		System.out.println(sql);
	}
}
