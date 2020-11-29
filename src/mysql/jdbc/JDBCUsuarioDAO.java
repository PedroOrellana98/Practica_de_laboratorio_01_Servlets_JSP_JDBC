package mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.UsuarioDAO;
import modelo.Empresa;
import modelo.ListaRequerimientos;
import modelo.Producto;
import modelo.Usuario;

public class JDBCUsuarioDAO extends JDBCGenericDAO<Usuario, String> implements UsuarioDAO{

	private static String nuevoCorreo;
	private static String nuevoClave;
	private static String id;
	private static String idEmpresa;
	@Override
	public void createTable() {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(Usuario usuario) {
		// TODO Auto-generated method stub
		conexionUno.update("INSERT usuario VALUES (" + usuario.getIdUsuario() + ", " + usuario.getNombre() + ", '" 
		+ usuario.getApellido() + "', '" + usuario.getCorreo() + "', '" + usuario.getClave() + "', '" 
		+ usuario.getRol() + "')");
	}

	@Override
	public Usuario read(String id) {
		// TODO Auto-generated method stub
		System.out.println("Entro a la base de datos");
		Usuario user = null;
		ResultSet rs = conexionUno.query("SELECT * FROM usuario WHERE id=" + id);
		try {
			if (rs != null && rs.next()) {
				user = new Usuario(rs.getString("id"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("correo"), rs.getString("clave"), rs.getString("rol"));
			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUserDAO:read): " + e.getMessage());
		}
		return user;
		
	}

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub
		conexionUno.update("UPDATE usuario SET nombre = '" + usuario.getNombre() + "', apellido = '" + usuario.getClave()
		+ "', correo= " + usuario.getCorreo() + "', clave= " + usuario.getClave()+ "', rol= " + usuario.getRol() 
		+ " WHERE id = " + usuario.getIdUsuario());
	}

	@Override
	public void delete(Usuario usuario) {
		// TODO Auto-generated method stub
		conexionUno.update("DELETE FROM usuario WHERE id = " + usuario.getIdUsuario());
	}

	@Override
	public List<Usuario> find() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public Empresa buscarEmpresa() {
		// TODO Auto-generated method stub
		Empresa empresaObject = null;
		ResultSet rs = conexionUno.query("Select e.ID from empresa e, usuario u "
				+ "where e.ID = u.Empresa_ID "
				+ "AND u.ID = " + id);
		try {
			if (rs != null && rs.next()) {
				idEmpresa = rs.getString("id");
				empresaObject = new Empresa(rs.getString("id"), rs.getString("nombre"));
			}	
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUsuarioDAO:read): " + e.getMessage());
		}
		return empresaObject;
	}
	
	@Override
	public Usuario buscar(String correo, String clave) {
		// TODO Auto-generated method stub
		Usuario usuarioObject = null;
		ResultSet rs = conexionUno.query("SELECT * FROM usuario WHERE correo=" +  "'" + correo + "'" + "AND clave=" +  "'" + clave + "'" );
		nuevoCorreo = correo;
		nuevoClave = clave;
		try {
			if (rs != null && rs.next()) {
				id = rs.getString("id");
				usuarioObject = new Usuario (id, rs.getString("nombre"), rs.getString("apellido"), rs.getString("correo"), rs.getString("clave"), rs.getString("rol"));
			}	
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUsuarioDAO:read): " + e.getMessage());
		}
		return usuarioObject;
	}
	
	@Override
	public List<Producto> listarProductos() {
		// TODO Auto-generated method stub
		List<Producto> list = new ArrayList<Producto>();
	    ResultSet rs = conexionUno.query("SELECT * FROM Producto p, "
	    		+ "ListaRequerimientos lr, Usuario u, EMPRESA e "
	    		+ "WHERE  p.ListaRequerimientos_ID = lr.ID "
	    		+ "AND lr.Usuario_ID = u.ID "
	    		+ "AND u.Empresa_ID = e.ID "
	    		+ "AND e.ID =" + idEmpresa);
	    try {
			while (rs.next()) {
				System.out.println("Entro en el while");
				Producto producto = new Producto(rs.getString("id"), rs.getString("nombre"));
				System.out.println("IDs DE PRODUCTO:" + rs.getString("id") + ", NOMBRE DE PRODUCTO: " + rs.getString("nombre"));
				list.add(producto);
			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUsuarioDAO:read): " + e.getMessage());
		}
		return list;
	}
	
	@Override
	public ListaRequerimientos listarRequisitos() {
		// TODO Auto-generated method stub
		
		ListaRequerimientos lrObject = null;
		ResultSet rs = conexionUno.query("SELECT * FROM ListaRequerimientos lr, Usuario u WHERE lr.Usuario_ID = u.ID AND u.correo = "
				+ "" +  "'" + nuevoCorreo +  "'" +  " AND u.clave= " +  "'" + nuevoClave +  "'" );
		
		try {
			if (rs != null && rs.next()) {
				lrObject = new ListaRequerimientos(rs.getString("id"), rs.getString("estado"));
			}
			
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUsuarioDAO:read): " + e.getMessage());
		}
		return lrObject;
	}
	

}
