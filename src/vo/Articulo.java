package vo;

public class Articulo {
	
	private int id;
    private String nombre;
    private double valor;
    
    public Articulo() {
    	
    }
    
	public Articulo(String nombre, double valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public Articulo(int id, String nombre, double valor) {
		this.id = id;
		this.nombre = nombre;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Detalle [id=" + id + ", articulo=" + nombre + ", valor=" + valor + "]";
	}
    
}
