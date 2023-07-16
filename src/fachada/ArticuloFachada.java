package fachada;

import mediador.ArticuloMediador;
import vo.Articulo;

import java.sql.SQLException;
import java.util.List;

import dao.ArticuloDao;

public class ArticuloFachada {
	private ArticuloMediador articuloMediador;
	
	public ArticuloFachada() {
		ArticuloDao articuloDao = new ArticuloDao();
		articuloMediador = new ArticuloMediador(articuloDao);
	}
	
	public void crearArticulo (Articulo articulo) throws SQLException {
		articuloMediador.crearArticulo(articulo);
	}
	
	public List<Articulo> listadoArticulos() throws SQLException {
		return articuloMediador.listarArticulos();
	}
	
	public Articulo buscarArticulo(int id) throws SQLException {
		return articuloMediador.buscarArticulo(id);
	}
	
	public void editarArticulo(Articulo articulo) throws SQLException {
		articuloMediador.actualizarArticulo(articulo);
	}
	
	public void eliminarArticulo(int id) throws SQLException {
		articuloMediador.eliminarArticulo(id);
	}
}
