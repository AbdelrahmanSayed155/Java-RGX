/**
 * 
 */
package com.abdelrahman.RGX.File;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Abdelrahman Sayed
 *
 * Feb 28, 2018
 */
public class MainClassRGXFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

       File  folder = new File("files/go");
       File [] files = folder.listFiles();
       
       String pattern =  ".*.zip.*";

       Pattern pattern2 = Pattern.compile(pattern);
       
       for(File f:files){
    	   Matcher matcher = pattern2.matcher(f.getName());
    	   if(matcher.matches()){
    		   System.out.println("this file is zip file " +f.getName() );
    	   }
       }
       
	}

}
