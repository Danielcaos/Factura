package dao;
import vo.Articulo;
import vo.Factura;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArticuloDao {
	
	private Conexion con = null;
	
	public ArticuloDao() {
		con = Conexion.getConexion();
	}
	
	public List<Articulo> listar() throws SQLException {
		List<Articulo> articulos = new ArrayList<>();
		
		String sql = "SELECT * FROM articulo";
		
		try {
			
			ResultSet res=con.query(sql);
			
			while (res.next()) {
                String nombre = res.getString("arti_nombre");
                Double valor = res.getDouble("arti_valor");
                int id = res.getInt("arti_id");

                Articulo articulo = new Articulo(id, nombre, valor);
                articulos.add(articulo);
			}
			res.close();
		}catch (SQLException e) {
            e.printStackTrace();
		}
		
		return articulos;
	}
	
	public boolean insertar(Articulo articulo) throws SQLException {
		String sql = "INSERT INTO articulo (arti_nombre, arti_valor, arti_id) VALUES ('"+articulo.getNombre()+"','"+articulo.getValor()+"','"+articulo.getId()+"')";
		try {
			con.insert(sql);
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public Articulo buscar(int id) throws SQLException {
		String sql = "SELECT * FROM articulo WHERE arti_id= "+"'"+id+"'";
        Articulo a = new Articulo();
        
        try {

            ResultSet ps = con.query(sql);

            if(ps.next()){
            	a.setNombre(ps.getString(1));
            	a.setValor(Double.parseDouble(ps.getString(2)));
                a.setId(Integer.parseInt(ps.getString(3)));
                }
            
        } catch(SQLException e) {
            e.printStackTrace();
        }


        return a;
	}
	
	public boolean actualizar(Articulo articulo) throws SQLException {
		String sql = "UPDATE articulo SET arti_nombre='"+articulo.getNombre()+"', arti_valor='"+ 
				articulo.getValor()+"', arti_id='"+articulo.getId()+"' WHERE arti_id="+articulo.getId();
		
		try {
			con.insert(sql);
            return true;
		} catch (SQLException e) {
			e.printStackTrace();
            return false;
		}	
	}
	
	public boolean eliminar(int id) throws SQLException {
		String sql="DELETE FROM articulo WHERE arti_id='"+id+"'";
		
        try{
           con.eliminar(sql);
           return true;
            
        }catch(Exception e){
            return false;
        }
	}
}
