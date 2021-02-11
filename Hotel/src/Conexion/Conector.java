package Conexion;
import java.sql.*;

import Conexion.Configuracion;

public class Conector {
	
	protected Connection conexion;
	
	public Conector() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conexion = DriverManager.getConnection("jdbc.mysql://" + Configuracion.HOST + "/" + Configuracion.BBDD + "/" + Configuracion.USER + "/" + Configuracion.PASSWORD);
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
}
