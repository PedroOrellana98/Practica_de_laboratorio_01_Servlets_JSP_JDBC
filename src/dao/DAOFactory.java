package dao;

public abstract class DAOFactory {
	
protected static DAOFactory factory = new JDBCDAOFactory();
	
	public static DAOFactory getFactory() {
		return factory;
	}
	
	public void createTables() {
	}
	
	public abstract UsuarioDAO getUsuarioDAO();
	
	public abstract EmpresaDAO getEmpresaDAO();
	
	public abstract CategoriaDAO getCategoriaDAO();
	
	public abstract ProductoDAO getProductoDAO();
	
	public abstract RequerimientosDAO getRequerimientoDAO();
}
