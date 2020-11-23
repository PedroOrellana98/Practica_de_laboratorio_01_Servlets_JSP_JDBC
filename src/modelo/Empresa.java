package modelo;

import java.io.Serializable;

public class Empresa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String idEmpresa;
	private String nombre;
	
	public Empresa() {
		
	}
	
	public Empresa(String idEmpresa, String nombre){
		super();
		this.idEmpresa = idEmpresa;
		this.nombre = nombre;
	}
	
	public String getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
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
