/**
 * 
 */
package com.abdelrahman.RGX.image;

/**
 * @author Abdelrahman Sayed
 *
 * Feb 28, 2018
 */
public class MainClassImageRGX {

	public static void main(String[] args) {
		String imagePattern = "([^//s]+(\\.(?i)(jpg|png|gif|bmp)))";
		String imageName = "abdelrahman.jpg";
		System.out.println("validate image:" +imageName.matches(imagePattern));
		imageName = "abdelrahman.jar";
		System.out.println("validate image:" +imageName.matches(imagePattern));
	}

}
