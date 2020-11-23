package modelo;

import java.io.Serializable;

public class Producto implements Serializable{

	private static final long serialVersionUID = 1L;
	private String idProducto;
	private String nombre;
	
	public Producto() {
		
	}
	
	public Producto(String idProducto, String nombre) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
