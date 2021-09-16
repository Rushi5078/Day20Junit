package RegexProblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author RUSHIKESH BHOSLE
 *
 */

public class SampleEmailValidation {
	/**
	 * @purpose:Checking enter email valid or invalid
	 * @return: no return value
	 */

	public static boolean checkValidEmail(String Email) {
		boolean isEmail;// check the validation
		String EmailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
		Pattern pattern = Pattern.compile(EmailRegex);
		if (Email == null) {
			isEmail = false;
		}
		Matcher matcher = pattern.matcher(Email);
		isEmail = matcher.matches();
		// print the output
		System.out.println(isEmail);
		return matcher.matches();
	}

	public static void main(String[] args) {
		// Calling the method

		System.out.println("---------- Valid Emails ----------");

		String email = "abc@bridgelabz.co.in";
		checkValidEmail(email);

		email = "abc@gmail.com.com";
		checkValidEmail(email);

		email = "abc@yahoo.com";
		checkValidEmail(email);

		email = "abc@1.com";
		checkValidEmail(email);

		email = "abc-100@yahoo.com";
		checkValidEmail(email);

		email = "abc.100@yahoo.com";
		checkValidEmail(email);

		email = "abc111@abc.com";
		checkValidEmail(email);

		email = "abc-100@abc.net";
		checkValidEmail(email);

		email = "abc.100@abc.com.au";
		checkValidEmail(email);

		email = "abc+100@gmail.com";
		checkValidEmail(email);

		System.out.println("---------------------------------------------------");

		System.out.println("---------- Invalid Emails ----------");

		email = ".abc@abc.com";
		checkValidEmail(email);

		email = "abc";
		checkValidEmail(email);

		email = "abc@.com.my";
		checkValidEmail(email);

		email = "abc@abc@gmail.com";
		checkValidEmail(email);

		email = "abc()*@gmail.com";
		checkValidEmail(email);

		email = "abc..2002@gmail.com";
		checkValidEmail(email);

		email = "abc.@gmail.com";
		checkValidEmail(email);

		email = "abc123@.com";
		checkValidEmail(email);

		email = "abc123@.com.com";
		checkValidEmail(email);

		email = "abc123@gmail.a";
		checkValidEmail(email);

		email = "abc@%*.com";
		checkValidEmail(email);

		email = "abc@gmail.com.1a";
		checkValidEmail(email);

		email = "abc@gmail.com.aa.au";
		checkValidEmail(email);

		System.out.println("---------------------------------------------------");
	}

}
