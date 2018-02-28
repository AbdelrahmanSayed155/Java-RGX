/**
 * 
 */
package com.abdelrahman.RGX.Char;

import java.util.regex.Pattern;

/**
 * @author Abdelrahman Sayed
 *
 * Feb 27, 2018
 */
public class MaiinClassMetaChar {

	public static void main(String[] args) {
        // . any char
		//  \d  maen [0-9]
	    //  \D  any char excpected numbers
		//  \s  any space 
		//  \S  any char excpected spaces
		//  \w any string  [a-zA-Z 0-9]
		//  \W   mean [^\w]
		//  \b  boundry of word 
		//  \B  Not Boundry 
		
		System.out.println("\\d mean digits only ");
		boolean b = Pattern.matches("\\d", "abc");
		System.out.println(b);
		 b = Pattern.matches("\\d", "1");
		System.out.println(b);
		b = Pattern.matches("\\d", "452.54");
		System.out.println(b);
		System.out.println("\\D mean  no digits  ");
	     b = Pattern.matches("\\D", "452.54");
			System.out.println(b);
	     b = Pattern.matches("\\D", "452.54");
			System.out.println(b);
		 b = Pattern.matches("\\D", "A");
			System.out.println(b);
		
			System.out.println("\\s space ");
			 b = Pattern.matches("\\s", " ");
			System.out.println(b);
			 b = Pattern.matches("\\s", "1");
			System.out.println(b);
			b = Pattern.matches("\\s", "452.54");
			System.out.println(b);
			
			System.out.println("\\S nospace ");
			 b = Pattern.matches("\\S", "sfsrvevrve");
			System.out.println(b);
			 b = Pattern.matches("\\S", "1");
			System.out.println(b);
			b = Pattern.matches("\\S", "452.54");
			System.out.println(b);
			
			System.out.println("\\w word only ");
			 b = Pattern.matches("\\w", "s");
			System.out.println(b);
			 b = Pattern.matches("\\w", "1");
			System.out.println(b);
			b = Pattern.matches("\\w", "452.54");
			System.out.println(b);
		
			System.out.println("\\W no word ");
			 b = Pattern.matches("\\W", "sfsrvevrve");
			System.out.println(b);
			 b = Pattern.matches("\\W", "@");
			System.out.println(b);
			b = Pattern.matches("\\W", "452.54");
			System.out.println(b);
		
		
		
	}

}
