package Project;

public abstract class Person {

	String name;
	String TcNo;

	public Person(String name, String TcNo){
		
		this.name=name;
		this.TcNo=TcNo;
	}
	
	public abstract String getName() ;
	
	public abstract String getTcNo() ;

}