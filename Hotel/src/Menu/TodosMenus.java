package Menu;

public class TodosMenus {

	
	public void MenuPrincipal() {
		System.out.println("------MENU------\r\n" +
							"0. Salir\r\n" +
							"1. Gestionar Usuarios\r\n" +
							"2. Gestionar Hoteles\r\n" + 
							"3. Gestionar Habitaciones\r\n" +
							"4. Gestionar Reservas\r\n");
	}
	
	public void MenuUsuarios() {
		System.out.println("------Usuarios------\r\n" +
							"0. Salir\r\n" + 
							"1. Crear Usuarios\r\n" +
							"2. Eliminar Usuarios\r\n" +
							"3. Ver Usuarios\r\n");
	}
	
	public void MenuHoteles() {
		System.out.println("------Hoteles------\r\n" +
							"0. Salir\r\n" + 
							"1. Ver Hoteles\r\n" +
							"2. Eliminar Hotel\r\n" + 
							"3. Editar Hotel\r\n" + 
							"4. Crear Hotel");
	}
	
	public void MenuHabitaciones() {
		System.out.println("------Habitaciones------\r\n" + 
							"0. Salir\r\n" +
							"1. Ver Habitaciones\r\n"+ 
							"2. Crear Habitaciones\r\n" + 
							"3. Eliminar Habitaciones\r\n" +
							"4. Editar Habitaciones\r\n");
	}
	
	public void MenuReservas() {
		System.out.println("------Reservas------\r\n" +
							"1. Ver Reservas\r\n" + 
							"2. Eliminar Reservas\r\n" + 
							"3. Crear Reservas\r\n" +
							"4. Editar Reservas\r\n");
	}
}
