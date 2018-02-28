package com.abdelrahman.RGX.Char;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClassRGXCharClass {

	public static void main(String[] args) {

		/// validation for char class
		// . mean any char
		System.out.println(".");
		Pattern pattern =  Pattern.compile(".m");
		Matcher matcher = pattern.matcher("hm");
		boolean b = matcher.matches();
		System.out.println(b);
		
		b = Pattern.compile(".g.").matcher("AgA").matches();
        System.out.println(b);
        
        b = Pattern.matches(".hh.", "dhhw");
        System.out.println(b);
        
        /// [abc] this mean that word char must be found in this group [abc] 
        System.out.println("[]");
        b = Pattern.matches("[abc]", "b");
        System.out.println(b);
        b = Pattern.matches("[abc]", "a");
        System.out.println(b);
        b = Pattern.matches("[abc]", "d");
        System.out.println(b);
        
        /// [^abc] this mean that word char must be out of this group [abc] 
        System.out.println("[^]");
        b = Pattern.matches("[^abc]", "d");
        System.out.println(b);
        b = Pattern.matches("[^abc]", "a");
        System.out.println(b);
        b = Pattern.matches("[^abc]", "n");
        System.out.println(b);
        
        /// [a-z] range
        System.out.println("[a-zA-Z]");
        b = Pattern.matches("[a-zA-Z]", "d");
        System.out.println(b);
        b = Pattern.matches("[a-zA-Z]", "a");
        System.out.println(b);
        b = Pattern.matches("[a-zA-Z]", "n");
        System.out.println(b);
        
        /// [^a-z] out of this range
        System.out.println("[^a-zA-Z]");
        b = Pattern.matches("[^a-zA-Z]", "d");
        System.out.println(b);
        b = Pattern.matches("[^a-zA-Z]", "a");
        System.out.println(b);
        b = Pattern.matches("[^a-zA-Z]", "2");
        System.out.println(b);
        /// [a-z&&[def]] in of this range must have d, e, f
        /// [a-z&&[^def]] in of this range must havn't d, e, f
        System.out.println("[a-zA-Z&&[def]]");
        b = Pattern.matches("[a-zA-Z&&[def]]", "d");
        System.out.println(b);
        b = Pattern.matches("[a-zA-Z&&[^def]]", "a");
        System.out.println(b);
        b = Pattern.matches("[a-zA-Z&&[^def]]", "e");
        System.out.println(b);
        b = Pattern.matches("[a-zA-Z&&[^x-y]]", "e");
        System.out.println(b);
        b = Pattern.matches("[a-zA-Z&&[^x-z]]", "y");
        System.out.println(b);
        
        
	}

}
