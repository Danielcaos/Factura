package vo;

public class FacturaArticulo {
	private int id;
	private int factura;
	private int articulo;
	private int cantidad;
	
	public FacturaArticulo() {
		
	}

	public FacturaArticulo(int id, int factura, int articulo, int cantidad) {
		super();
		this.id = id;
		this.factura = factura;
		this.articulo = articulo;
		this.cantidad = cantidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFactura() {
		return factura;
	}

	public void setFactura(int factura) {
		this.factura = factura;
	}

	public int getArticulo() {
		return articulo;
	}

	public void setArticulo(int articulo) {
		this.articulo = articulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "FacturaArticulo [id=" + id + ", factura=" + factura + ", articulo=" + articulo + ", cantidad="
				+ cantidad + "]";
	}
	
	
}
