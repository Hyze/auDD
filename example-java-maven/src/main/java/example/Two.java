package example;

/**
 * 
 * @author Julien
 *
 */
public class Two {
	String message = "foo";
	static final String ERROR="ERREUR";
	static final String SUCCES="SUCCES";
	/**
	 * 
	 * @param one
	 *            classe One
	 * @return "ERREUR" ou "SUCCES"
	 */
	public String comp(One one) {	
	    //ici les string doivent etre en constante
		if (this.compareTo(one) == -1)
			return ERROR;
		return SUCCES;
	}

	private int compareTo(One one) {
		return message.compareTo(one.foo());
	}
	
	//il manquait le hashcode
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Two other = (Two) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} 
		else if (!message.equals(other.message))
			return false;
		return true;
	}
}
