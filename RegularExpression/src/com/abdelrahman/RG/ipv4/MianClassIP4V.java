/**
 * 
 */
package com.abdelrahman.RG.ipv4;

/**
 * @author Abdelrahman Sayed
 *
 * Feb 28, 2018
 */
public class MianClassIP4V {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	  String pattern="^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+
		               "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+
				       "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+
		               "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
		String ipV4 = "2.2.2.2";
		
		System.out.println("IPV4 valid:"+ipV4.matches(pattern));

	}

}
