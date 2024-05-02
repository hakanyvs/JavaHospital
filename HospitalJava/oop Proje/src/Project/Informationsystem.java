package Project;

import java.util.ArrayList;

public class Informationsystem {
	
	ArrayList<Doctor> doctorList = new ArrayList<>();
	ArrayList<Ill> illList = new ArrayList<>();
	ArrayList<Treatment> treatmentList = new ArrayList<>();
	
	boolean addIll(Ill i_2){
		
		boolean control = false;
		
		for(Ill i_1: illList){
			
			if (i_1 == i_2){
				control = true;
			}
	}
		if(control==true){
			System.out.println("Ill already registered");
			
			return false;	
			
	}
		else {
			illList.add(i_2);
			System.out.println("Added a ill, name :" + i_2.name);
			System.out.println("TcNo :" + i_2.TcNo);
			System.out.println("yearofbirth :" + i_2.getYearofbirth());
			
			return true;	
		}
	}
	
	boolean addDoctor(Doctor dr_2){
		
		boolean control1 = false;
		
		for (Doctor dr_1: doctorList){
			if (dr_1 == dr_2){
				control1 = true;	
	}
		}
		if (control1 == true){
			System.out.println("Doctor already registered");
			
			return false;
		}
		else {
			doctorList.add(dr_2);
			System.out.println("Added a doctor, name :" + dr_2.name );
			System.out.println("TcNo :" + dr_2.TcNo );
			System.out.println("Degree :" + dr_2.getDegree());
			
			return true;
		}
	}
	
	void addTreatment(Ill i_3,Doctor dr_3) throws NotfoundException{
		
		boolean control3 = false;
		
		boolean control4 = false;
		
		for(Ill i_1: illList){
			
			if(i_1 == i_3){
				control3 = true; 
			}
		}
		for (Doctor dr_1: doctorList){
			
			if(dr_1 == dr_3){
				control4 = true;
			}
	}
		if(control3 == true && control4 == true){
			Treatment treatment1 = new Treatment(i_3 , dr_3);
			System.out.println("Ill :" + i_3.name);
			System.out.println("Doctor :" + dr_3.name);
			treatmentList.add(treatment1);
	
		}
		else {
		throw new	NotfoundException();
		}
	}
	Ill findIll(String Tcno) throws NotfoundException {
		boolean control5 = false;
	
	Ill i_4=null;
	
	for(Ill i_1 : illList){
		
		if(Tcno.equals(i_1.TcNo)){
			
			control5 = true ;
			i_4 = i_1;
		}
	}
			if (control5 == true){
				System.out.println("Your Ill:" + i_4.name);
				return i_4;
	}
	else {
	throw new	NotfoundException();
	}
}
	Doctor findDoctor (String Tcno) throws NotfoundException {
		
		boolean control6 = false;
		
		Doctor dr_4 = null;
		
		for(Doctor dr_1 : doctorList){
			
			if(Tcno.equals(dr_1.TcNo)){
				
				control6 = true ;
				dr_4 = dr_1;
			}
		}
			if (control6 == true){
				System.out.println("Your Doctor:" + dr_4.name);
	
				return dr_4;
		}
		else {
		throw new	NotfoundException();
		}
	}
}