package example;

public class Four {
	public String message;

	public String getMessage() {
		return message;
	}

	public void setString(String msg) {
		this.message = msg;
	}

	public boolean isMessageEmpty() {
		if(getMessage()==null){
			return true;
		}
		return getMessage().isEmpty();
	}
}
