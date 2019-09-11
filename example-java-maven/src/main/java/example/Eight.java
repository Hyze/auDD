package example;

public class Eight {
	public static final One foo = new One(); //this leve l'ambiguiter 

	public String concat(String str1, String str2) {
	
		StringBuilder foo2 = new StringBuilder("x"); //stringBUffer est synchronized
		foo2.append(str1).append("-").append(str2); //mieux vaut utliser stringBuilder 
		return foo2.toString();
	}
}
