/**
 * 
 */
package com.abdelrahman.ValidationObject;



/**
 * @author Abdelrahman Sayed
 *
 * Feb 27, 2018
 */
public class MainClassForTest {

	public static void main(String[] args) {		
		Student st = new Student(120, "Abdelrahman Sayed", "��� ���� �� ������", "****##");
		String  RGX="^[�-� a-zA-Z0-9 #,_@.?!\\%^&*$-]*$";
	    System.out.println("result:{"+ RequestValidationUtil.validateRequest(st,RGX)+"}");
	}
}
