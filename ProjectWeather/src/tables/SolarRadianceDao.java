package tables;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import fileimport.RadianceParser;
import fileimport.ReadFile;

public class SolarRadianceDao {
	String url ="jdbc:postgresql://localhost:5432/weather_test";
	String user = "postgres";
	String password = "hej";	
	List<SolarRadiance> solarRadianceData = new ArrayList<SolarRadiance>();
	List<String> testString = new ArrayList<String>();
	public SolarRadianceDao() throws IOException{
		ReadFile rf = new ReadFile("Files//wdata.dat");
		BufferedReader br = rf.getBufferedReader();
		br.readLine();
		br.readLine();
		br.readLine();
		br.readLine();
		String line;
		
		while((line =br.readLine())!=null){
			if(line.startsWith("\"")){
				String temp = line.replaceAll("\"", "'");
				testString.add(temp);
//				RadianceParser rp = new RadianceParser(line);
//				SolarRadiance temp = rp.createDao();
//				solarRadianceData.add(temp);
			}
	
		}
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.addAll(testString);
		testString.clear();
		testString.addAll(hs);


	}


	
	public void fillTable() throws ClassNotFoundException, BatchUpdateException{
		Connection con = null;
		Statement st = null;
		try{
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			
			for(int i=0; i<testString.size(); i++){
				
//				st.addBatch(("INSERT INTO loggerone(date_time,record_value,energy_tot1,energy_tot2,energy_tot3,energy_tot4,energy_tot5,energy_tot6,energy_tot7,pyr_1_avg,pyr_2_avg,batt_volt_min,Ptemp)"
//			+"VALUES("+solarRadianceData.get(i).getDate().replace("\"", "'")+","+solarRadianceData.get(i).getPrimaryKey()
//			+","+solarRadianceData.get(i).getEnergy_tot1()+","+
//			solarRadianceData.get(i).getEnergy_tot2()+","+
//			solarRadianceData.get(i).getEnergy_tot3()+","+
//			solarRadianceData.get(i).getEnergy_tot4()+","+
//			solarRadianceData.get(i).getEnergy_tot5()+","+
//			solarRadianceData.get(i).getEnergy_tot6()+","+
//			solarRadianceData.get(i).getEnergy_tot7()+","+
//			solarRadianceData.get(i).getPyr1Avg().replace("\"", "'")+","+
//			solarRadianceData.get(i).getPyr_2_avg().replace("\"", "'")+","+
//			solarRadianceData.get(i).getMinVolt()+","+
//			solarRadianceData.get(i).getPotentialTemp()+");"));
				
				st.addBatch("INSERT INTO loggerone(date_time,record_value,energy_tot1,energy_tot2,energy_tot3,energy_tot4,energy_tot5,energy_tot6,energy_tot7,pyr_1_avg,pyr_2_avg,batt_volt_min,Ptemp)"+
				"VALUES("+testString.get(i)+");");
			}
			st.executeBatch();
			con.close();
			st.close();
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			e.getNextException().printStackTrace();;
		}
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException, BatchUpdateException {
		SolarRadianceDao srd = new SolarRadianceDao();
		srd.fillTable();
	}
	
	
}
