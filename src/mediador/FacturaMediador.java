package mediador;
import java.sql.SQLException;
import java.util.List;

import dao.FacturaDao;
import vo.Factura;
import dao.ArticuloDao;
import vo.Articulo;

public class FacturaMediador {
	
	private FacturaDao fd;
	
	public FacturaMediador() {
		fd = new FacturaDao();
	}
	
	public boolean crearFactura(Factura f) throws SQLException {
		
		if(fd.insertar(f)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public Factura buscarFactura(int numero) throws SQLException {
		
		return fd.buscar(numero);
		
	}
	
	
	public List<Factura> listarFacturas() throws SQLException{
		
		return fd.listar();
		
	}
	
	public boolean actualizarFactura(Factura f) throws SQLException {
		
		if(fd.actualizar(f)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean eliminarFactura(int numero) throws SQLException{
		
		if(fd.eliminar(numero)) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
