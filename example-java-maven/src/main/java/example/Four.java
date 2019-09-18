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
		if(this.getMessage()==null)
			return true;
		return getMessage().isEmpty();
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
