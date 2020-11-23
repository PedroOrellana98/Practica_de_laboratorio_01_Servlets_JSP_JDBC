package modelo;

import java.io.Serializable;

public class ListaRequerimientos implements Serializable{

	private static final long serialVersionUID = 1L;
	private String idRequerimientos;
	private String nombre;
	private String estado;
	
	public ListaRequerimientos() {
		
	}
	
	public ListaRequerimientos(String idRequerimientos, String nombre, String estado) {
		super();
		this.idRequerimientos = idRequerimientos;
		this.nombre = nombre;
		this.estado = estado;
	}

	public String getIdRequerimientos() {
		return idRequerimientos;
	}

	public void setIdRequerimientos(String idRequerimientos) {
		this.idRequerimientos = idRequerimientos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
