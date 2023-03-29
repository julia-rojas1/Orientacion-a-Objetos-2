package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<Usuario> usuarios;
	
	public Twitter() {
		usuarios = new ArrayList<>();
	}
	
	public boolean agregarUsuario(Usuario usuario) {
		//No se puede repetir nombre
		long nRepe = usuarios.stream()
				.filter(u -> u.nombreRepe(usuario))
				.count();
		
		if (nRepe == 0) {
			usuarios.add(usuario);
			//return "Usuario agregado";
			return true;
		}
		
		//return "Ya existe un usuario con ese nombre";
		return false;
	}
	
	public boolean eliminarUsuario(Usuario usuario) {
		if (usuarios.contains(usuario)) {
			usuario.heSidoEliminado();
			usuarios.remove(usuario);
			//return "Usuario eliminado";
			return true;
		}
		//return "Usuario inexistente";
		return false;
	}
}
