package Project;

public class Treatment {
	
	Ill i_1;
	Doctor dr_1;
	String details;
	
	public Treatment(Ill i_1, Doctor dr_1){
		this.i_1 = i_1;
		this.dr_1 = dr_1;
		
	}
	Ill getIll(){
		
		return i_1;
	}
	
	Doctor getDoctor(){
		
		return dr_1;
	}
	
	public String getDetails() {
		
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
}