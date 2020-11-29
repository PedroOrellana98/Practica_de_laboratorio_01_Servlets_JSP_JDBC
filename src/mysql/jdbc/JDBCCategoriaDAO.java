package mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.CategoriaDAO;
import modelo.Categoria;
import modelo.ListaRequerimientos;
import modelo.Producto;
import modelo.Usuario;

public class JDBCCategoriaDAO extends JDBCGenericDAO<Categoria, String> implements CategoriaDAO{
	
	@Override
	public void createTable() {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(Categoria categoria) {
		// TODO Auto-generated method stub
		jdbc.update("INSERT categoria VALUES (" + categoria.getIdCategoria() + ", '" + categoria.getNombre() + "')");
	}

	@Override
	public Categoria read(String id) {
		// TODO Auto-generated method stub
		Categoria categoria = null;
		ResultSet rs = jdbc.query("SELECT * FROM categoria WHERE id=" + id);
		try {
			if (rs != null && rs.next()) {
				categoria = new Categoria(rs.getString("id"), rs.getString("nombre"));
			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCCategoryDAO:read): " + e.getMessage());
		}

		return categoria;
	}

	@Override
	public void update(Categoria categoria) {
		// TODO Auto-generated method stub
		jdbc.update("UPDATE Categoria SET NOMBRE = '" + categoria.getNombre() + "' WHERE id = " + categoria.getIdCategoria());
	}

	@Override
	public void delete(Categoria categoria) {
		// TODO Auto-generated method stub
		jdbc.update("DELETE FROM Categoria WHERE id = " + categoria.getIdCategoria());
	}

	@Override
	public List<Categoria> find() {
		// TODO Auto-generated method stub
		List<Categoria> list = new ArrayList<Categoria>();
		ResultSet rs = jdbc.query("SELECT * FROM Categoria");
		try {
			while (rs.next()) {
				list.add(new Categoria(rs.getString("id"), rs.getString("nombre")));
			} }catch (SQLException e) {
				System.out.println(">>>WARNING (JDBCCategoryDAO:find): " + e.getMessage());
			}
			return list;
	}

	@Override
	public Usuario buscar(String correo, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListaRequerimientos listarRequisitos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto listarProductos(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
