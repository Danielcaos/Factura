package dao;
import vo.Factura;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class FacturaDao {

	private Conexion con = null;
	
	public FacturaDao() {
		con = Conexion.getConexion();
	}
	
	public boolean insertar(Factura factura) throws SQLException {
		String sql = "INSERT INTO factura (fact_numero, fact_nombrecliente, fact_fecha, fact_subtotal, fact_iva, fact_total) VALUES ('"
				+factura.getNumero()+"','"+factura.getCliente()+"','"+factura.getFecha()+"','"+factura.getSubtotal()+"','"+factura.getIva()+"','"+factura.getTotal()+"')";
		try {
			con.insert(sql);
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public Factura buscar(int numero) throws SQLException {
		String sql = "SELECT * FROM factura WHERE fact_numero= "+"'"+numero+"'";
        Factura f = new Factura();
        
        try {

            ResultSet ps = con.query(sql);

            if(ps.next()){
                f.setNumero(Integer.parseInt(ps.getString(1)));
                f.setCliente(ps.getString(2));
                f.setFecha(Date.valueOf(ps.getString(3)));
                f.setSubtotal(Double.parseDouble(ps.getString(4)));
                f.setIva(Integer.parseInt(ps.getString(5)));
                f.setTotal(Double.parseDouble(ps.getString(6)));
          
                }
            
        } catch(SQLException e) {
            e.printStackTrace();
        }


        return f;
	}
	
	public List<Factura> listar() throws SQLException {
		List<Factura> facturas = new ArrayList<>();
		
		String sql = "SELECT * FROM factura";
		
		try {
			
			ResultSet res=con.query(sql);
			
			while (res.next()) {
                int numero = res.getInt("fact_numero");
                String cliente = res.getString("fact_nombrecliente");
                Date fecha = res.getDate("fact_fecha");
                double subtotal = res.getDouble("fact_subtotal");
                int iva = res.getInt("fact_iva");
                double total = res.getDouble("fact_total");

                Factura factura = new Factura(numero, cliente, fecha, subtotal, iva, total);
                facturas.add(factura);
			}
			res.close();
		}catch (SQLException e) {
            e.printStackTrace();
		}
		
		return facturas;
	}
	
	public boolean actualizar(Factura factura) throws SQLException {
		String sql = "UPDATE factura SET fact_numero='" + factura.getNumero() + "', fact_nombrecliente='" + 
				factura.getCliente() + "', fact_fecha='" + factura.getFecha() + "', fact_subtotal='" + 
				factura.getSubtotal() + "', fact_iva='" + factura.getIva() + "', fact_total='" + factura.getTotal() + "' WHERE fact_numero="+factura.getNumero();
		
		try {
			con.insert(sql);
            return true;
		} catch (SQLException e) {
			e.printStackTrace();
            return false;
		}	
	}
	
	public boolean eliminar(int numero) throws SQLException {
		String sql="DELETE FROM factura WHERE fact_numero='"+numero+"'";
		
        try{
           con.eliminar(sql);
           return true;
            
        }catch(Exception e){
            return false;
        }
	}
	
}
