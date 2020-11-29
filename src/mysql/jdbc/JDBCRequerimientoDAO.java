package mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dao.RequerimientosDAO;
import modelo.ListaRequerimientos;
import modelo.Producto;
import modelo.Usuario;

public class JDBCRequerimientoDAO extends JDBCGenericDAO<ListaRequerimientos, String> implements RequerimientosDAO {

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(ListaRequerimientos entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ListaRequerimientos read(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(ListaRequerimientos entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ListaRequerimientos entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ListaRequerimientos> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscar(String correo, String clave) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Producto listarProductos(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListaRequerimientos listarRequisitos() {
		// TODO Auto-generated method stub
		return null;
	}

}
