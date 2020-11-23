package modelo;

import java.io.Serializable;

public class Categoria implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String idCategoria;
	private String nombre;
	
	public Categoria() {
		
	}
	
	public Categoria(String idCategoria, String nombre) {
		super();
		this.idCategoria = idCategoria;
		this.nombre = nombre;
	}

	public String getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
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
