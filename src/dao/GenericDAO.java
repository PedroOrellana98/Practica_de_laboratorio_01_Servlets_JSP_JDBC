package dao;

import java.util.List;

import modelo.Categoria;
import modelo.Empresa;
import modelo.ListaRequerimientos;
import modelo.Producto;
import modelo.Usuario;

public interface GenericDAO<T, ID> {

	public void createTable();

	public void create(T entity);

	public T read(ID id);

	public void update(T entity);

	public void delete(T entity);

	public List<T> find();
	
	Usuario buscar(String correo, String clave);

	List<Producto> listarProductos();

	Empresa buscarEmpresa();
	
	List<ListaRequerimientos> listarProductos0();
	
	List<Producto> listarProductos1();
	
	List<Empresa> listarProductos2();
	
	List<Producto> buscarProductos0(String buscar);
	
	List<Categoria> buscarProductos1(String buscar);

	void actualizarRequerimiento(String producto);

	void actualizarProducto(String nombre, String producto);

	void nuevoProducto(String nombre, int categoria, int requerimiento);

	void eliminarProducto(int id);

	Producto leerMaximo();

	void elminiarProducto(String nombre);

}
