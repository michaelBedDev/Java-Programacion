package optionalEjercicio;

import java.util.Optional;

public class Menu {

	Data data;
	View view;
	
	public void menu(int input) {
		boolean exit = false;
		do{
			switch(input) {
			case 1 -> registrarUsuario() ;
			case 2 -> buscarUsuario(view.askNombreCompleto());
			case 3 -> actualizar(view.askNombreCompleto());
			case 4 -> eliminar(view.askNombreCompleto());
			case 5 -> exit = true;
			}
			
		} while (!exit);
	}
	
	
	public void registrarUsuario() {
		Usuario usuario = new Usuario();
		String nombre = view.askString("Introduce el nombre del usuario a añadir:");
		String apellido = view.askString("Introduce el apellido");
		usuario.setNombre(nombre);
		usuario.setApellido(apellido);
		usuario.setCorreoE(view.askString("introduce el email:"));
		
		String nombreCompleto = nombre+apellido;
		
		data.getUsuarios().put(nombreCompleto, usuario);
	}
	
	public void buscarUsuario(String nombreCompleto) {
	
		Optional<Usuario> usuarioOptional = Optional.ofNullable(data.getUsuarios().get(nombreCompleto));
		
		usuarioOptional.ifPresentOrElse(usuario -> view.sendMessage(nombreCompleto), () -> view.sendMessage("usuario no encontrado"));
	}
	
	
	public void actualizar(String nombreCompleto) {
		
		Optional<Usuario> usuarioOptional = Optional.ofNullable(data.getUsuarios().get(nombreCompleto));
		
		usuarioOptional.ifPresentOrElse(usuario -> usuario.setCorreoE(view.askString("introduce el nuevo email:")) , () -> view.sendMessage("usuario no encontrado"));
	}
	
	
	public void eliminar(String nombreCompleto) {
		
		Optional<Usuario> usuarioOptional = Optional.ofNullable(data.getUsuarios().get(nombreCompleto));
		
		usuarioOptional.ifPresentOrElse(usuario -> data.getUsuarios().remove(nombreCompleto), () -> view.sendMessage("usuario no encontrado"));
	}
}
