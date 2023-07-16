package fachada;

import java.sql.SQLException;

import dao.FacturaArticuloDao;
import mediador.FacturaArticuloMediador;
import vo.FacturaArticulo;

public class FacturaArticuloFachada {
	private FacturaArticuloMediador facturaArticuloMediador;
	
	public FacturaArticuloFachada() {
		FacturaArticuloDao facturaArticuloDao = new FacturaArticuloDao();
		facturaArticuloMediador = new FacturaArticuloMediador(facturaArticuloDao);
	}
	
	public void crearRelacion(FacturaArticulo facturaArticulo) throws SQLException {
		facturaArticuloMediador.crearRelacion(facturaArticulo);
	}
	
	public void editarRelacion(FacturaArticulo facturaArticulo) throws SQLException {
		facturaArticuloMediador.actualizarRelacion(facturaArticulo);
	}
	
	public void borrarRelacion(int id) throws SQLException {
		facturaArticuloMediador.eliminarRelacion(id);
	}
}
