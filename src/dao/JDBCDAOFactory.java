package dao;

import mysql.jdbc.JDBCCategoriaDAO;
import mysql.jdbc.JDBCProductoDAO;
import mysql.jdbc.JDBCEmpresaDAO;
import mysql.jdbc.JDBCUsuarioDAO;
import mysql.jdbc.JDBCRequerimientoDAO;

public class JDBCDAOFactory extends DAOFactory {

	public void createTables() {
		this.getCategoriaDAO().createTable();
		this.getUsuarioDAO().createTable();
		this.getEmpresaDAO().createTable();
		this.getProductoDAO().createTable();
		this.getRequerimientoDAO().createTable();

	}
	
	@Override
	public UsuarioDAO getUsuarioDAO() {
		// TODO Auto-generated method stub
		return new JDBCUsuarioDAO();
	}

	@Override
	public EmpresaDAO getEmpresaDAO() {
		// TODO Auto-generated method stub
		return new JDBCEmpresaDAO();
	}

	@Override
	public CategoriaDAO getCategoriaDAO() {
		// TODO Auto-generated method stub
		return new JDBCCategoriaDAO();
	}

	@Override
	public ProductoDAO getProductoDAO() {
		// TODO Auto-generated method stub
		return new JDBCProductoDAO();
	}

	@Override
	public RequerimientosDAO getRequerimientoDAO() {
		// TODO Auto-generated method stub
		return new JDBCRequerimientoDAO();
	}
	
	

}
