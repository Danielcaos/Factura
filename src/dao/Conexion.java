package dao;
import java.sql.*;

public class Conexion {
	private Connection con=null;
	private static Conexion db;
	private Statement statement;
	
	private String url= "jdbc:postgresql://localhost:5432/facturacion";
    private String driver = "org.postgresql.Driver";
    private String userName = "postgres";
    private String password = "123456";
    
    public Conexion() {
		try {
			Class.forName(driver);
			con = (Connection)DriverManager.getConnection(url,userName,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
    public static Conexion getConexion(){
		if ( db == null ) {
            db = new Conexion();
        }
		return db;
	}
 
	public void cerrarConexion(){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet query(String query) throws SQLException{
        statement = db.con.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }
		
	public int insert(String insertQuery) throws SQLException {
        statement = db.con.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;
 
    }
	
	public boolean eliminar(String insertQuery) throws SQLException {
        statement = db.con.createStatement();
        boolean result = statement.execute(insertQuery);
        return result;
	}
	
	
    
}
