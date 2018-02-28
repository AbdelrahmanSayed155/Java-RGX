/**
 * 
 */
package com.abdelrahman.RGX.diffrent.Validators;

/**
 * @author Abdelrahman Sayed
 *
 * Feb 27, 2018
 */
public class commomValidator {
	


	public static boolean validateNationalId(String nationalId) {
		String regex = "^([0-9]{14})$";
		return nationalId.matches(regex);
	}

	public static boolean validateMobileNumber(String mobileNumber) {
		String regex = "^([0-9]{11})$";
		return mobileNumber.matches(regex);
	}

	public static boolean validateMobileNumberStartsWithLeadingZero(String mobileNumber) {
		
		
		return mobileNumber.startsWith("0");
	}
	
	public static boolean validateMsisdn(String msisdn) {
		String regex = "^([0-9]{"+msisdn.length()+"})$";
		return msisdn.matches(regex);
	} 
	
	public static boolean validateLandLine(String landLine) {
		String regex = "^(0[0-9]{9,10})$";
		
		return landLine.matches(regex);
	}
	

}
