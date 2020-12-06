package mysql.jdbc;

import java.util.List;

import dao.EmpresaDAO;
import modelo.Categoria;
import modelo.Empresa;
import modelo.ListaRequerimientos;
import modelo.Producto;
import modelo.Usuario;

public class JDBCEmpresaDAO extends JDBCGenericDAO<Empresa, String> implements EmpresaDAO{

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Empresa entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Empresa read(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Empresa entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Empresa entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Empresa> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscar(String correo, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> listarProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empresa buscarEmpresa() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ListaRequerimientos> listarProductos0() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> listarProductos1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empresa> listarProductos2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> buscarProductos0(String buscar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categoria> buscarProductos1(String buscar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarRequerimiento(String producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarProducto(String nombre, String producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nuevoProducto(String nombre, int categoria, int requerimiento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarProducto(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto leerMaximo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void elminiarProducto(String nombre) {
		// TODO Auto-generated method stub
		
	}


}
