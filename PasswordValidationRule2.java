/**
 * 
 */
package RegexProblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author RUSHIKESH BHOSLE
 *
 */

public class PasswordValidationRule2 
{
	/**
	 * @purpose:Checking enter valid password rules
	 * @return: boolean true or false
	 */

	public static boolean checkValidPassword(String password) {
		boolean ispassword;// check the validation
		String passwordRegex = "^[A-Z]{1}[a-z]{7,}$";
		Pattern pattern = Pattern.compile(passwordRegex);
		if (password == null) {
			ispassword = false;
		}
		Matcher matcher = pattern.matcher(password);
		ispassword = matcher.matches();
		// print the output
		System.out.println(ispassword);
		return matcher.matches();
	}

	public static void main(String[] args) {
		// Calling the method
		checkValidPassword("Rushikesh");
	}

}
