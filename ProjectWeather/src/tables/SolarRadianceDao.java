package tables;

import java.sql.*;
import java.util.List;

public class SolarRadianceDao {
	List<SolarRadiance> solarRadianceData;
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	
	String url ="jdbc:postgresql://localhost/WeatherDatabase";
	String user = "selmaabbassi";
	String password = "****";
	
	public SolarRadiance getSolarRadiance(int key) throws ClassNotFoundException{
		SolarRadiance sr = null;
		try{
			Class.forName("com.postgresql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			rs = st.executeQuery("INSERT INTO");
			
			sr = new SolarRadiance(key);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sr;
	}
	
	
}
