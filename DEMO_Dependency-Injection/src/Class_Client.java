
public class Class_Client {
	AbstractDAO abstractDAO;
	
	public Class_Client() {
		abstractDAO = FactoryDAO.getDAO();
	}
	
	public AbstractDAO getDAO() {
		return abstractDAO;
	}
	
	public void setDAO(AbstractDAO abstractDAO) {
		this.abstractDAO = abstractDAO;
	}
	
	public void execute() {
		abstractDAO.insert();
		abstractDAO.update();
		abstractDAO.delete();
	}
}
