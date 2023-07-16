package mediador;

import java.sql.SQLException;
import java.util.List;

import dao.ArticuloDao;
import vo.Articulo;

public class ArticuloMediador {
	
	private ArticuloDao ad;
	
	public ArticuloMediador(ArticuloDao ad) {
		this.ad = ad;
	}
	
public boolean crearArticulo(Articulo a) throws SQLException {
		
		if(ad.insertar(a)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public Articulo buscarArticulo(int numero) throws SQLException {
		
		return ad.buscar(numero);
		
	}
	
	
	public List<Articulo> listarArticulos() throws SQLException{
		
		return ad.listar();
		
	}
	
	public boolean actualizarArticulo(Articulo a) throws SQLException {
		
		if(ad.actualizar(a)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean eliminarArticulo(int numero) throws SQLException{
		
		if(ad.eliminar(numero)) {
			return true;
		} else {
			return false;
		}
		
	}
}
