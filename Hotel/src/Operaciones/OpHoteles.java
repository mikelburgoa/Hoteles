package Operaciones;

import java.util.Scanner;

public class OpHoteles {
	
	public void verHoteles() {  
		Scanner input = new Scanner(System.in);
		int id;
		
		System.out.println("Escribe el ID del hotel para ver sus datos: \r\n");
		id  = input.nextInt();
		String sql = "SELECT * FROM `hoteles` WHERE `id` LIKE" + id;
		System.out.println(sql);
	}
	
	public void eliminarHoteles() {
		Scanner input = new Scanner(System.in);
		int id;
		
		System.out.println("Escribe el ID del hotel que quieras eliminar: \r\n");
		id = input.nextInt();
		String sql = "DELETE FROM `hoteles` WHERE `id` LIKE" + id;
		System.out.println(sql);
	}
	
	public void crearHoteles() {  
		Scanner input = new Scanner(System.in);
		int id;
		String cif;
		String nombre;
		String gerente;
		int estrellas;
		String compania;
		
		System.out.println("Escribe una id: \r\n");
		id = input.nextInt();
		
		System.out.println("Escibre un cif\r\n");
		cif = input.next();
		
		System.out.println("Escribe un nombre: \r\n");
		nombre = input.next();
		
		System.out.println("Escribe el nombre del gerente\r\n");
		gerente = input.next();
		
		System.out.println("Escibre las estrellas del hotel: \r\n");
		estrellas = input.nextInt();
		
		System.out.println("Escribe la compañia: \r\n");
		compania = input.next();
		
		String sql = "UPDATE `hoteles` SET `id`=[id],`cif`=[cif],`nombre`=[nombre],`gerente`=[gerente],`estrellas`=[estrellas],`compania`=[compania]";
		System.out.println(sql);
	}
	
	public void editarHoteles() {
		Scanner input = new Scanner(System.in);
		String eleccion;
		int id;
		String cif;
		String nombre;
		String gerente;
		int estrellas;
		String compania;
		
		System.out.println("¿Que quieres editar del hotel?\r\n");
		eleccion = input.next();
		
		if(eleccion=="id") {
			System.out.println("Escribe un ID nueva: \r\n");
			id = input.nextInt();
			
			String sql = "UPDATE `hoteles` SET `id`=[id],";
			System.out.println(sql);
		}
		
		if(eleccion=="cif") {
			System.out.println("Escribe un CIF nueva: \r\n");
			cif = input.next();
			
			String sql = "UPDATE `hoteles` SET `cif`=[cif],";
			System.out.println(sql);
		}
		
		if(eleccion=="nombre") {
			System.out.println("Escribe un Nombre nueva: \r\n");
			nombre = input.next();
			
			String sql = "UPDATE `hoteles` SET `nombre`=[nombre],";
			System.out.println(sql);
		}
		
		if(eleccion=="gerente") {
			System.out.println("Escribe un Gerente nueva: \r\n");
			gerente = input.next();
			
			String sql = "UPDATE `hoteles` SET `gerente`=[gerente],";
			System.out.println(sql);
		}
		
		if(eleccion=="estrellas") {
			System.out.println("Escribe un Estrellas nueva: \r\n");
			estrellas = input.nextInt();
			
			String sql = "UPDATE `hoteles` SET `estrellas`=[estrellas],";
			System.out.println(sql);
		}
		
		if(eleccion=="compania") {
			System.out.println("Escribe un Compania nueva: \r\n");
			compania = input.next();
			
			String sql = "UPDATE `hoteles` SET `compania`=[compania],";
			System.out.println(sql);
		}
	}
}
