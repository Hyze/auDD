package example;

public class Four {
	String message;

	public String getMessage() {
		return message;
	}

	public void setString(String msg) {
		this.message = msg;
	}

	public boolean isMessageEmpty() {
		return getMessage().isEmpty();
	}
}
