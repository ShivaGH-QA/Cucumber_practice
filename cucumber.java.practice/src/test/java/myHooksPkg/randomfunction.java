package myHooksPkg;

import java.security.SecureRandom;
import java.util.Random;

public class randomfunction {
		private static final Random generator = new Random(); 
		static final String SOURCE = "0123456789" + "abcdefghijklmnopqrstuvwxyz"; 
		static SecureRandom secureRnd = new SecureRandom();
		 public static String randomString(int length)
		 { 
		 	 StringBuilder sb = new StringBuilder(length); 
		 	 for (int i = 0; i < length; i++)
		 		 sb.append(SOURCE.charAt(secureRnd.nextInt(SOURCE.length()))); 
		 	 return sb.toString(); 
		 	 
		 	System.out.println("5 random alphanumeric string with length 12"); 
			 String beta = randomString(10); 
			 System.out.println(beta);
			 
		 	 }
	}

