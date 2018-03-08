import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FactoryDAO {
	
	public static AbstractDAO getDAO() {
		
		Properties prop = new Properties();
	    InputStream input = null;
	    
	    try {
	    	input = new FileInputStream("source/config.properties");
	    	// load a properties file
	    	prop.load(input);
	    	// get the database value
	    	String database = prop.getProperty("database");
	    	
	    	if (database.equals("1")) {
	    		return new Class01_DAO();
	    	}
	    	if (database.equals("2")) {
	    		return new Class02_DAO();
	    	}
	    	if (database.equals("3")) {
	    		return new Class03_DAO();
	    	}
	    } catch (IOException ex) {
	    	ex.printStackTrace();
	    	return null;
	    }
	    return null;
	}
}
