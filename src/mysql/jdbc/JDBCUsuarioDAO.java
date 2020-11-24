package mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dao.UsuarioDAO;
import modelo.Usuario;

public class JDBCUsuarioDAO extends JDBCGenericDAO<Usuario, String> implements UsuarioDAO{

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(Usuario usuario) {
		// TODO Auto-generated method stub
		conexionUno.update("INSERT Usuario VALUES (" + usuario.getIdUsuario() + ", " + usuario.getNombre() + ", '" 
		+ usuario.getApellido() + "', '" + usuario.getCorreo() + "', '" + usuario.getClave() + "', '" 
		+ usuario.getRol() + "')");
	}

	@Override
	public Usuario read(String id) {
		// TODO Auto-generated method stub
		Usuario user = null;
		ResultSet rs = conexionUno.query("SELECT * FROM Usuario WHERE id=" + id);
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
		conexionUno.update("UPDATE Usuario SET nombre = '" + usuario.getNombre() + "', apellido = '" + usuario.getClave()
		+ "', correo= " + usuario.getCorreo() + "', clave= " + usuario.getClave()+ "', rol= " + usuario.getRol() 
		+ " WHERE id = " + usuario.getIdUsuario());
	}

	@Override
	public void delete(Usuario usuario) {
		// TODO Auto-generated method stub
		conexionUno.update("DELETE FROM Usuario WHERE id = " + usuario.getIdUsuario());
	}

	@Override
	public List<Usuario> find() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public Usuario buscar(String correo, String clave) {
		// TODO Auto-generated method stub
		
		//System.out.println("Email: ------------- "+email.toString());
		int i=0;
		Usuario usuarioObject = null;
		ResultSet rs = conexionUno.query("SELECT * FROM Usuario WHERE  correo=" +  "'" + correo + "'" + "AND clave=" +  "'" + clave + "'" );
		try {
			if (rs != null && rs.next()) {
				i=1;
				usuarioObject = new Usuario (rs.getString("id"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("correo"), rs.getString("clave"), rs.getString("rol"));
			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUsuarioDAO:read): " + e.getMessage());
		}
		return usuarioObject;
	}
	

}
