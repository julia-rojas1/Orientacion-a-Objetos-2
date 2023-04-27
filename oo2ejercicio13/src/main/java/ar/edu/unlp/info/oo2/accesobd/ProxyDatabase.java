package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class ProxyDatabase implements DatabaseAccess {
	private String contraseña;
	private boolean autenticado;
	private DatabaseRealAccess servicio;
	
	public ProxyDatabase(String contraseña) {
		this.contraseña = contraseña;
		this.autenticado = false;
		servicio = new DatabaseRealAccess();
	}
	
	public void iniciarSesión(String contraseña) {
		if (this.contraseña.equals(contraseña)) {
			autenticado = true;
		}
	}
	
	public Collection<String> getSearchResults(String queryString) {
		  if (autenticado) {
			  return servicio.getSearchResults(queryString);
		  }
		  return null;
	}
	
	public int insertNewRow(List<String> rowData) {
		if (autenticado) {
			return servicio.insertNewRow(rowData);
		}
		return 0;
	}
}
