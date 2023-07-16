package fachada;

import java.sql.SQLException;
import java.util.List;

import dao.FacturaDao;
import mediador.FacturaMediador;
import vo.Factura;

public class FacturaFachada {
	private FacturaMediador facturaMediador;
	
	public FacturaFachada() {
		FacturaDao facturaDao = new FacturaDao();
		facturaMediador = new FacturaMediador(facturaDao);
	}
	
	public void crearFactura(Factura factura) throws SQLException {
		facturaMediador.crearFactura(factura);
	}
	
	public List<Factura> listadoFacturas() throws SQLException {
        return facturaMediador.listarFacturas();
    }
	
	public Factura buscarFactura(int numero) throws SQLException {
		return facturaMediador.buscarFactura(numero);
	}
	
	public void editarFactura(Factura factura) throws SQLException {
		facturaMediador.actualizarFactura(factura);
	}
	
	public void borrarFactura(int numero) throws SQLException {
		facturaMediador.eliminarFactura(numero);
	}
}
