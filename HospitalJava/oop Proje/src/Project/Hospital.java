package Project;

public class Hospital {
	
	public static void main(String[] args) throws NotfoundException {

		Doctor doctor1 = new Doctor("Hakan Yavas" , "12345678900" , 95);
		Doctor doctor2 = new Doctor("Engin Yavas" , "12345678911" , 82);
	
		Ill ill1 = new Ill("Yagmur Yavas","12345678922", 2007);
		Ill ill2 = new Ill("Selma Yavas", "12345678933", 1990); 
		Treatment treatment1 = new Treatment(ill1 , doctor1);
		Treatment treatment2 = new Treatment(ill2 , doctor2);
		treatment1.setDetails("Physiotheraphy");
		treatment2.setDetails("Implant");
		
		Informationsystem informationsystem = new Informationsystem();
		
		informationsystem.addIll(ill1);
		
		informationsystem.addIll(ill2);
		
		informationsystem.addIll(ill2); 

		informationsystem.addDoctor(doctor1);
		
		informationsystem.addDoctor(doctor2);
		
	//	informationsystem.addDoctor(doctor2); 
		
		informationsystem.addTreatment(ill1, doctor1);
		System.out.println("Treatment :" + treatment1.getDetails());
		
	//	informationsystem.addTreatment(ill2, doctor2);
	//	System.out.println("Treatment :" + treatment2.getDetails());
		
	//	informationsystem.findIll("12345678922");

	//	informationsystem.findIll("12345678933"); 
		
	//	informationsystem.findDoctor("12345678900");
		
	//	informationsystem.findDoctor("12345678911");
		
	}
	}