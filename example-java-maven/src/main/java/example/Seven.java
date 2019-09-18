package example;

public class Seven extends Two {

	public String longString(int facteur) {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < facteur; i++) {
			res.append(message);
		}
		return res.toString();
	}

	@Override
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String getMessage(){
		return this.message;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seven other = (Seven) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} 
		else if (!message.equals(other.message))
			return false;
		return true;
	}

}
