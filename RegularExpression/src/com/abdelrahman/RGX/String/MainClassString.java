/**
 * 
 */
package com.abdelrahman.RGX.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Abdelrahman Sayed
 *
 * Feb 27, 2018
 */
public class MainClassString {
	public static void main(String[] args) {

		System.out.println("String oprations word ");
		boolean b = Pattern.matches("[a-zA-Z 0-9]{1,20}", "abdlerahman20Sayed");
		System.out.println(b);
		b = Pattern.matches("[a-zA-Z 0-9]{20}", "abdlerahman20Sayed");
		System.out.println(b);
		
		System.out.println("String oprations Password ");
		///?=. mean at least one char from that 
		///(?=\\S+$) mean prevent any space be last char 
		String PattertnPassword = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=])(?=\\S+$).{6,20}";
		String password="AAv125#eEE@@s";
		System.out.println("password is : "+password.matches(PattertnPassword));
		
		System.out.println("String oprations Email ");
		///?=. mean at least one char from that 
		///(?=\\S+$) mean prevent any space be last char 
		/// (.+)     mean any char 
		/// ^ befor pattern mean that pattern must start with this pattern 
		/// $  after patter mean that pattern must end with this pattern
		//String PattertnEmail = "^(.+)@(.+)$";
		String PattertnEmail ="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
		String email="eng.abdelrahmansayed.cs@gmail.com";
		System.out.println("Mail is : "+ email.matches(PattertnEmail));
		Pattern pattern = Pattern.compile(PattertnEmail);
		Matcher matcher = pattern.matcher(email);
		System.out.println("Mail is : "+ matcher.matches());
		
		/// Ip Validation
		
		String ipValidation = "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$";
		String ipString ="192.182.0.1";
		System.out.println("Ip Validate:"+ipString.matches(ipValidation));
	}

}
