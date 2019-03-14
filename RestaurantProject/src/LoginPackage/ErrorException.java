package LoginPackage;

public class ErrorException extends Exception {
private String message;	
	
	//-----constructor for this exception-----
	public ErrorException(String message){
		this.message=message;
	}
	
	//-----method for displaying message to user-----
	public String OutMessage(){	
		return message;
	}

}
