package example;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Julien
 *
 */
public class Three {
	public String message = "foo";
	Logger log = Logger.getLogger("logger1");


	/**
	 * 
	 * @param two
	 * @return les messages concaténés
	 */
	public String concat(Two two) {
		StringBuilder str = new StringBuilder(); 
				str.append(message); 
				str.append(two.message); 
		return str.toString(); 
	}

	public String concat2(One one) {
		return message + one.foo();
	}

	public String concat3(One one, Two two) {
		StringBuilder str = new StringBuilder();
		str.append(message);
		str.append("_");
		str.append(one.foo());
		str.append("-"); 
		str.append(two.message);
		String res = str.toString(); 
		log.log(Level.INFO,res);
		return str.toString();
	}
	// duplication de code suppression de concat4
		
	
}
