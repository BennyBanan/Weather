package tables;

public class SolarRadiance {
	private String key;
	private String date;
	private String potentialTemp;
	private String minVolt;
	private String energy_tot1;
	private String energy_tot2;
	private String energy_tot3;
	private String energy_tot4;
	private String energy_tot5;
	private String energy_tot6;
	private String energy_tot7;
	private String pyr_1_avg;
	private String pyr_2_avg;
	public SolarRadiance(String key){
		this.key = key;
	}

	public String getPrimaryKey(){
		return key;
	}
	
	public void setPrimaryKey(String key){
		this.key = key;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPyr1Avg() {
		return pyr_1_avg;
	}

	public void setPyr1Avg(String pyr1) {
		this.pyr_1_avg = pyr1;
	}

	public String getPotentialTemp() {
		return potentialTemp;
	}

	public void setPotentialTemp(String potentialTemp) {
		this.potentialTemp = potentialTemp;
	}

	public String getMinVolt() {
		return minVolt;
	}

	public void setMinVolt(String minVolt) {
		this.minVolt = minVolt;
	}

	public String getEnergy_tot1() {
		return energy_tot1;
	}

	public void setEnergy_tot1(String energy_tot1) {
		this.energy_tot1 = energy_tot1;
	}

	public String getEnergy_tot2() {
		return energy_tot2;
	}

	public void setEnergy_tot2(String energy_tot2) {
		this.energy_tot2 = energy_tot2;
	}

	public String getEnergy_tot3() {
		return energy_tot3;
	}

	public void setEnergy_tot3(String energy_tot3) {
		this.energy_tot3 = energy_tot3;
	}

	public String getEnergy_tot4() {
		return energy_tot4;
	}

	public void setEnergy_tot4(String energy_tot4) {
		this.energy_tot4 = energy_tot4;
	}

	public String getEnergy_tot5() {
		return energy_tot5;
	}

	public void setEnergy_tot5(String energy_tot5) {
		this.energy_tot5 = energy_tot5;
	}

	public String getEnergy_tot6() {
		return energy_tot6;
	}

	public void setEnergy_tot6(String energy_tot6) {
		this.energy_tot6 = energy_tot6;
	}

	public String getEnergy_tot7() {
		return energy_tot7;
	}

	public void setEnergy_tot7(String energy_tot7) {
		this.energy_tot7 = energy_tot7;
	}

	public String getPyr_2_avg() {
		return pyr_2_avg;
	}

	public void setPyr_2_avg(String pyr_2_avg) {
		this.pyr_2_avg = pyr_2_avg;
	}
	
	
}
