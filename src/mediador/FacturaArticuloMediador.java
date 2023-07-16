package mediador;

import java.sql.SQLException;

import dao.FacturaArticuloDao;
import vo.FacturaArticulo;

public class FacturaArticuloMediador {

	private FacturaArticuloDao fad;
	
	public FacturaArticuloMediador(FacturaArticuloDao fad) {
		this.fad = fad;
	}
	
public boolean crearRelacion(FacturaArticulo fa) throws SQLException {
		
		if(fad.insertar(fa)) {
			return true;
		} else {
			return false;
		}
		
	}

public boolean actualizarRelacion(FacturaArticulo fa) throws SQLException {
	
	if(fad.actualizar(fa)) {
		return true;
	} else {
		return false;
	}
	
}

public boolean eliminarRelacion(int id) throws SQLException{
	
	if(fad.eliminar(id)) {
		return true;
	} else {
		return false;
	}
	
}
}
