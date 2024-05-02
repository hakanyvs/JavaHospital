package Project;

public class Doctor extends Person {
	
	private int degree;
	
	public Doctor(String name, String TcNo, int degree) {
		super(name, TcNo);
		this.degree=degree;
	}

	public int getDegree() {
		
		return degree;
	}
	
	public String getName() {
		
		return name;
	}

	public String getTcNo() {
		
		return TcNo;
	}
}