package Menu;

import Objetos.*; 
import Operaciones.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import Conexion.*;

public class Main {

	public static void main(String[] args) { 
		String usuario;
		String contrasenia;
		int aukera;
		int intento;
		
		Conector C = new Conector();
		Scanner input = new Scanner(System.in);
		TodosMenus TM = new TodosMenus();
		OpUsuarios OpU = new OpUsuarios();
		OpHoteles OpH = new OpHoteles();
		OpHabitaciones OpHa = new OpHabitaciones();
		OpReservas OpR = new OpReservas();
		
		do {
			
			System.out.println("Escribe el usuario: \r\n");
			usuario = input.next();
			
			System.out.println("Escribe la contraseña: \r\n");
			contrasenia = input.next();
			
			try {
				PreparedStatement PS = 	C.getConexion().prepareStatement("SELECT * FROM Login WHERE usuario =? AND contrasenia =?");
				PS.setString(1,usuario);
				PS.setString(2,contrasenia);
				ResultSet RS = PS.executeQuery();
				
				if(RS.next()) {
					do {
						TM.MenuPrincipal();
					}
					while(aukera!=0) ;
				}
				else {
					
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		 while();
	}
}
