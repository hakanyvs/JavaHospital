package Project;

public class Ill extends Person {
	
	private int	yearofbirth;
	
	public Ill(String name, String TcNo,int yearofbirth) {
		super(name, TcNo);
		this.yearofbirth=yearofbirth;
	}
	
	public String getName() {
		
		return name;
	}

	public String getTcNo() {
		
		return TcNo;
	}
	
	public int getYearofbirth() {
		
		return yearofbirth;
	}
}