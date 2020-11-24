package mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import dao.ProductoDAO;
import modelo.Categoria;
import modelo.Producto;

public class JDBCProductoDAO extends JDBCGenericDAO<Producto, String> implements ProductoDAO {
	
	@Override
	public void createTable() {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(Producto producto) {
		// TODO Auto-generated method stub
		conexionDos.update("INSERT Producto VALUES (" + producto.getIdProducto() + ", " + producto.getNombre() + ")");
	}

	@Override
	public Producto read(String id) {
		// TODO Auto-generated method stub
		Producto producto = null;
		ResultSet rsProduct = conexionUno.query("SELECT * FROM Producto WHERE id=" + id);
		try {
			if (rsProduct != null && rsProduct.next()) {
				producto = new Producto(rsProduct.getString("id"), rsProduct.getString("nombre"));
				ResultSet rsCategoria = conexionDos
						.query("SELECT * FROM Categoria WHERE id=" + rsProduct.getString("categoria_id"));
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
				ResultSet rsCategoria = conexionDos.query("SELECT * FROM Categoria WHERE id=" + rsProduct.getInt("categoria_id"));
				list.add(producto);
			}

		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCProductDAO:find): " + e.getMessage());
		}

		return list;
	}

}
