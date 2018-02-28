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
public class MainClassQuanifier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       ////  ?  char must be one 
      System.out.println("?");
      boolean b = Pattern.matches("[abc]?", "a");
      System.out.println(b);
      b = Pattern.matches("[abc]?", "a");
      System.out.println(b);
      b = Pattern.matches("[abc]?", "aa");
      System.out.println(b);
      b = Pattern.matches("[abc]?", "dd");
      System.out.println(b);
      b = Pattern.matches("[abc]?", "c");
      System.out.println(b);
      /// +  recive charcters into range but must at least on che 
      System.out.println("+");
      b = Pattern.matches("[abc]+", "a");
      System.out.println(b);
      b = Pattern.matches("[abc]+", "aa");
      System.out.println(b);
      b = Pattern.matches("[abc]+", "dd");
      System.out.println(b);
      b = Pattern.matches("[abc]+", "caaaac");
      System.out.println(b);
      /// * as - but accept null
      System.out.println("*");
      b = Pattern.matches("[abc]*", "");
      System.out.println(b);
      b = Pattern.matches("[abc]*", "aa");
      System.out.println(b);
      b = Pattern.matches("[abc]*", "dd");
      System.out.println(b);
      b = Pattern.matches("[abc]*", "caaaac");
      System.out.println(b);
    /// {} specify number
      System.out.println("{number}");
      b = Pattern.matches("k{3}", "kkk");
      System.out.println(b);
      b = Pattern.matches("ee{7}", "eef");
      System.out.println(b);
      b = Pattern.matches("rrr{1}", "rrr");
      System.out.println(b);
      /// {minimun , maximum} specify number
      System.out.println("{min,max}");
      b = Pattern.matches("k{3,5}", "kkk");
      System.out.println(b);
      b = Pattern.matches("ee{2,7}", "eef");
      System.out.println(b);
      b = Pattern.matches("rrr{1,7}", "rrr");
      System.out.println(b);
      
	}

}
