package vo;

import java.util.Date;

public class Factura {
	private int numero;
    private String cliente;
    private Date fecha;
    private double subtotal;
    private int iva;
    private double total;
    
    public Factura() {
    	
    }
    
	public Factura(String cliente, Date fecha, double subtotal, int iva, double total) {
		this.cliente = cliente;
		this.fecha = fecha;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
	}



	public Factura(int numero, String cliente, Date fecha, double subtotal, int iva, double total) {
		this.numero = numero;
		this.cliente = cliente;
		this.fecha = fecha;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", cliente=" + cliente + ", fecha=" + fecha + ", subtotal=" + subtotal
				+ ", iva=" + iva + ", total=" + total + "]";
	}
    
}
