package Project;

import java.io.IOException;

public class NotfoundException extends IOException {
	
	public NotfoundException() {
		
		 super("Person not found...");
	}
}