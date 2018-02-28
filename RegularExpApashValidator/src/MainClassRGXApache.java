import org.apache.commons.validator.CreditCardValidator;
import org.apache.commons.validator.EmailValidator;
import org.apache.commons.validator.UrlValidator;

/**
 * 
 */

/**
 * @author Abdelrahman Sayed
 *
 * Feb 28, 2018
 */
public class MainClassRGXApache {
	public static void main(String[] args) {
		System.out.println("RGX using Apach commons validator ");
		
      ////Email 
		EmailValidator emailValidator = EmailValidator.getInstance();
		String email = "eng.abdelrahmansayed.cs@gmail.com";
		System.out.println("email valid:"+emailValidator.isValid(email));
		
	  /// URL Validaor 
		UrlValidator urlValidator = new UrlValidator();
		String urlString = "http://www.google.com";
		System.out.println("URL valid:"+urlValidator.isValid(urlString));
		
		/// URL Validaor 
	     CreditCardValidator creditCardValidator = new CreditCardValidator(CreditCardValidator.VISA);
		 String creditcartString = "415214785555";
		 System.out.println("Visa valid:"+creditCardValidator.isValid(creditcartString));
		 creditCardValidator = new CreditCardValidator(CreditCardValidator.MASTERCARD);
		 creditcartString = "415214785555";
		 System.out.println("MASTERCARD valid:"+creditCardValidator.isValid(creditcartString));
		 
	}

}
