package dao;

import java.sql.SQLException;

import vo.Articulo;
import vo.FacturaArticulo;

public class FacturaArticuloDao {
	
private Conexion con = null;
	
	public FacturaArticuloDao() {
		con = Conexion.getConexion();
	}
	
	public boolean insertar(FacturaArticulo fa) throws SQLException {
		String sql = "INSERT INTO factura_articulo (faar_id, faar_factura, faar_articulo, faar_cantidad) VALUES ('"+fa.getId()+"','"+fa.getFactura()+"','"+fa.getArticulo()+"','"+fa.getCantidad()+"')";
		try {
			con.insert(sql);
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public boolean eliminar(int id) throws SQLException {
		String sql="DELETE FROM factura_articulo WHERE faar_id='"+id+"'";
		
        try{
           con.eliminar(sql);
           return true;
            
        }catch(Exception e){
            return false;
        }
	}
	
	public boolean actualizar(FacturaArticulo fa) throws SQLException {
		String sql = "UPDATE factura_articulo SET faar_cantidad='"+fa.getCantidad()+"' WHERE faar_id="+fa.getId();
		
		try {
			con.insert(sql);
            return true;
		} catch (SQLException e) {
			e.printStackTrace();
            return false;
		}	
	}
}
