package tables;

public class SolarRadiance {
	private int key;
	private String date;
	private double average;
	private double potentialTemp;
	private double minVolt;
	
	public SolarRadiance(int key){
		this.key = key;
	}

	public int getPrimaryKey(){
		return key;
	}
	
	public void setPrimaryKey(int key){
		this.key = key;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public double getPotentialTemp() {
		return potentialTemp;
	}

	public void setPotentialTemp(double potentialTemp) {
		this.potentialTemp = potentialTemp;
	}

	public double getMinVolt() {
		return minVolt;
	}

	public void setMinVolt(double minVolt) {
		this.minVolt = minVolt;
	}
	
	
}
