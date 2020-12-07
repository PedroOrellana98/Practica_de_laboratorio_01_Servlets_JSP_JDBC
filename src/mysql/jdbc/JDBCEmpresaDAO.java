package mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
	
	@Override
	public List<Empresa> listarPrincipal2() {
		
		List<Empresa> list = new ArrayList<Empresa>();
		ResultSet rs = conexionUno.query("SELECT * FROM Producto p, "
	    		+ "ListaRequerimientos lr, Usuario u, EMPRESA e, Categoria c "
	    		+ "WHERE  p.ListaRequerimientos_ID = lr.ID "
	    		+ "AND lr.Usuario_ID = u.ID "
	    		+ "AND u.Empresa_ID = e.ID "
	    		+ "AND c.ID = p.Categoria_ID");
	    try {
			while (rs.next()) {
				Empresa empresa = new Empresa(rs.getString("id"), rs.getString("e.nombre"));
				list.add(empresa);
			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUsuarioDAO:read): " + e.getMessage());
		}
		return list;
	}

	@Override
	public List<Producto> listarPrincipal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categoria> listarPrincipal1() {
		// TODO Auto-generated method stub
		return null;
	}
}
