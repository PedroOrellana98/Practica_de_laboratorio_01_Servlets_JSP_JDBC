package mysql.jdbc;

import java.util.List;

import dao.UsuarioDAO;
import modelo.Usuario;

public class JDBCUsuarioDAO extends JDBCGenericDAO<Usuario, String> implements UsuarioDAO{

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		conexionUno.update("DROP TABLE IF EXISTS Usuario");
		conexionUno.update("CREATE TABLE Usuario (" + "ID INT NOT NULL, " + "NOMBRE VARCHAR(100) NOT NULL, "
				+ "APELLIDO VARCHAR(100) NOT NULL, CORREO VARCHAR(200) NOT NULL, CLAVE VARCHAR(50) NOT NULL,"
				+ "ROL VARCHAR(1) NOT NULL, PRIMARY KEY (ID))");
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
		return null;
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
	
	

}
