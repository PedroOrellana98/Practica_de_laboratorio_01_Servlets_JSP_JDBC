package modelo;

import java.io.Serializable;

public class ListaRequerimientos implements Serializable{

	private static final long serialVersionUID = 1L;
	private String idRequerimientos;
	private String estado;

	public ListaRequerimientos() {
		
	}
	
	public ListaRequerimientos(String idRequerimientos, String estado) {
		super();
		this.idRequerimientos = idRequerimientos;
		this.estado = estado;
	}

	public String getIdRequerimientos() {
		return idRequerimientos;
	}

	public void setIdRequerimientos(String idRequerimientos) {
		this.idRequerimientos = idRequerimientos;
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
