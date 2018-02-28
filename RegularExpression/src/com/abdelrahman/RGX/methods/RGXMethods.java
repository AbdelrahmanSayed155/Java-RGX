/**
 * 
 */
package com.abdelrahman.RGX.methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Abdelrahman Sayed
 *
 * Feb 27, 2018
 */
public class RGXMethods {
	public static void main(String[] args) {
		/// by that can count number can count number of pattern match
		System.out.println(" ------Search by RGX by pattern------");
		String text= "my name my address my cat my proc";
		String patternString ="my";
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(text);
		System.out.println("{"+text+"}");
		while(matcher.find()){
			System.out.println("word:"+patternString+" found in "+ matcher.start());
			System.out.println("match:"+ matcher.group());
		}
		/// replacement can executed by RGX
		String texr2 = "mohamed sayod , ahmed sayid ";
		String patternString2 ="say.*? ";
		Pattern pattern2 = Pattern.compile(patternString2);
		Matcher matcher2 = pattern2.matcher(texr2);
		System.out.println("text :"+matcher2.replaceAll("sayed "));
		
		/// datePattern
		                    //moth/dat/year
		String datePattern ="^(0[1-9]|1[012])/(0[1-9]|[1-2][0-9]|3[01])/(19|20)\\d\\d$";
		String date = "07/24/2014";//"M7/24/2014";
		System.out.println("date valid "+date.matches(datePattern));
		
		/// datePattern in iraq
		
		String phonePattern ="^[1-9]\\d{2}-\\d{3}-\\d{3}$";
		String phone = "211-254-547";//"M7/24/2014";
		System.out.println("phone valid "+phone.matches(phonePattern));
		
		
		
	}
}
