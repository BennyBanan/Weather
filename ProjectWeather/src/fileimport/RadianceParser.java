package fileimport;

public class RadianceParser {
	String rp;
	public RadianceParser(String rp){
		this.rp =rp;
	}
	public void createDao(){
		String s;
	}
	public static void main(String[] args) {
		String d = "\"2014-07-07 14:10:00\",0,0,0,0,0,0,0,0.01,0,\"NAN\",12.05,318.1712";
//		RadianceParser rd = new RadianceParser(d);
		String[] a = d.split(",");				
		System.out.println(a[12]);
	}
}
