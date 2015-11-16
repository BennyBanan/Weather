package fileimport;

import tables.SolarRadiance;

public class RadianceParser {
	String rp;
	public RadianceParser(String rp){
		this.rp =rp;
	}
	public SolarRadiance createDao(){
		String[] temp = rp.split(",");
		SolarRadiance sr = new SolarRadiance(temp[1]);
		sr.setDate(temp[0]);
		sr.setEnergy_tot1(temp[2]);
		sr.setEnergy_tot2(temp[3]);
		sr.setEnergy_tot3(temp[4]);
		sr.setEnergy_tot4(temp[5]);
		sr.setEnergy_tot5(temp[6]);
		sr.setEnergy_tot6(temp[7]);
		sr.setEnergy_tot7(temp[8]);
		sr.setPyr1Avg(temp[9]);
		sr.setPyr_2_avg(temp[10]);
		sr.setMinVolt(temp[11]);
		sr.setPotentialTemp(temp[12]);
		
		return sr;
		
	}

}
