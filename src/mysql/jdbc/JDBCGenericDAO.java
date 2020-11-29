package mysql.jdbc;

import dao.GenericDAO;

public abstract class JDBCGenericDAO <T, ID> implements GenericDAO<T, ID> {
	
	protected ContextJDBC jdbc = ContextJDBC.getJDBC();
	protected ContextJDBC jdbc1 = ContextJDBC.getJDBC2();

}
