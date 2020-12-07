package mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ProductoDAO;
import modelo.Categoria;
import modelo.Empresa;
import modelo.ListaRequerimientos;
import modelo.Producto;
import modelo.Usuario;

public class JDBCProductoDAO extends JDBCGenericDAO<Producto, String> implements ProductoDAO {
	
	private static int id;
	@Override
	public void createTable() {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(Producto producto) {
		// TODO Auto-generated method stub
		conexionDos.update("INSERT INTO Producto VALUES (" + producto.getIdProducto() + ", " + producto.getNombre() + ")");
	}

	@Override
	public Producto read(String id) {
		// TODO Auto-generated method stub
		Producto producto = null;
		ResultSet rsProduct = conexionUno.query("SELECT * FROM Producto WHERE id=" + id);
		try {
			if (rsProduct != null && rsProduct.next()) {
				producto = new Producto(rsProduct.getString("id"), rsProduct.getString("nombre"));
				//ResultSet rsCategoria = conexionDos
						//.query("SELECT * FROM Categoria WHERE id=" + rsProduct.getString("categoria_id"));
			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCProductDAO:read): " + e.getMessage());
		}
		if (producto == null) {
			return null;
		}
		return producto;
	}
	
	@Override
	public void nuevoProducto(String nombre, int categoria, int requerimiento) {
		id++;	
		conexionUno.update("INSERT INTO Producto VALUES(" + id +", '" + nombre.toUpperCase() + "', " + categoria + ", " + requerimiento + ");");
	}
	
	@Override
	public Producto leerMaximo() {
		// TODO Auto-generated method stub
		Producto producto = null;
		ResultSet rsProduct = conexionUno.query("SELECT MAX(id) AS max_id FROM Producto;");
		id = 0;
		try {
			if (rsProduct != null && rsProduct.next()) {
				id = rsProduct.getInt("max_id");
				System.out.println("Este es el id= " + id);
				producto = new Producto(String.valueOf(id), rsProduct.getString("nombre"));
			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCProductDAO:read): " + e.getMessage());
		}
		return producto;
	}
	
	@Override
	public void elminiarProducto(String nombre) {
		
		String idEmpresa = JDBCUsuarioDAO.idEmpresa;
		
		conexionUno.update("DELETE p FROM ListaRequerimientos lr,"
				+ "Usuario u, Empresa e, Producto p, Categoria c "
				+ "WHERE lr.Usuario_ID = u.ID "
				+ "AND lr.ID = p.ListaRequerimientos_ID "
				+ "AND e.ID = u.Empresa_ID "
				+ "AND p.Categoria_ID = c.ID "
				+ "AND e.ID = " + idEmpresa
				+ " AND p.nombre = " + "'" + nombre + "';");
	}
	
	@Override
	public void eliminarProducto(int id) {
				
		conexionUno.update("DELETE FROM Producto WHERE ID = " + id + ";");
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		conexionUno.update("UPDATE Product SET nombre = " + producto.getNombre() + "' WHERE id = " + producto.getIdProducto());
	}

	@Override
	public void delete(Producto producto) {
		// TODO Auto-generated method stub
		conexionUno.update("DELETE FROM Producto WHERE id = " + producto.getIdProducto());
	}

	@Override
	public List<Producto> find() {
		// TODO Auto-generated method stub
		List<Producto> list = new ArrayList<Producto>();
		ResultSet rsProduct = conexionUno.query("SELECT * FROM Producto");
		try {
			while (rsProduct.next()) {
				Producto producto = new Producto(rsProduct.getString("id"), rsProduct.getString("nombre"));
				//ResultSet rsCategoria = conexionDos.query("SELECT * FROM Categoria WHERE id=" + rsProduct.getInt("categoria_id"));
				list.add(producto);
			}

		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCProductDAO:find): " + e.getMessage());
		}

		return list;
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
	public List<Producto> listarPrincipal() {
		
		List<Producto> list = new ArrayList<Producto>();
	    ResultSet rs = conexionUno.query("SELECT * FROM Producto p, "
	    		+ "ListaRequerimientos lr, Usuario u, EMPRESA e, Categoria c "
	    		+ "WHERE  p.ListaRequerimientos_ID = lr.ID "
	    		+ "AND lr.Usuario_ID = u.ID "
	    		+ "AND u.Empresa_ID = e.ID "
	    		+ "AND c.ID = p.Categoria_ID");
	    try {
			while (rs.next()) {
				Producto producto = new Producto(rs.getString("id"), rs.getString("p.nombre"));
				list.add(producto);
			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUsuarioDAO:read): " + e.getMessage());
		}
		return list;
	}

	@Override
	public List<Categoria> listarPrincipal1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empresa> listarPrincipal2() {
		// TODO Auto-generated method stub
		return null;
	}

}
