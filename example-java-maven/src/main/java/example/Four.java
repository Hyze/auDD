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
<<<<<<< HEAD
		if(getMessage()==null){
			return true;
		}
=======
		if(this.getMessage()==null)
			return true;
>>>>>>> master
		return getMessage().isEmpty();
	}
}
