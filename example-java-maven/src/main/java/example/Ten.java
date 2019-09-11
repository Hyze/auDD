package example;

import java.security.SecureRandom;
import java.util.Arrays;


public class Ten {
	float a = 16777216.0f;
	float b = 1.0f;
	float c = a + b;

	double d = a + b;
	SecureRandom random = new SecureRandom();
	public boolean isOdd(int x) {
		return x % 2 == 1;
	}

	public String getSecureRandomCode(int length) {
		byte[] bytes = new byte[length];
		random.nextBytes(bytes);
		return Arrays.toString(bytes);
	}
}
