package  com.capgemini.electricityBillSystem.exception;;

public class NoSuchConnectionException extends Exception {
	private String message;
	public NoSuchConnectionException(String message) {
		super(message);
	}
}
