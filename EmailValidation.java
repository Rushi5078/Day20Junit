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

public class EmailIdValidation {
	/**
	 * @purpose:Checking enter valid email id
	 * @return: boolean true or false
	 */

	public static boolean checkValidEmailId(String EmailId ) 
	{
		boolean isEmailId;// check the validation
		String EmailIdRegex = "^[a-z0-9+_.-]+@[a-z0-9.-]+$";
		Pattern pattern = Pattern.compile(EmailIdRegex);
		if (EmailId == null) {
			isEmailId = false;
		}
		Matcher matcher = pattern.matcher(EmailId);
		isEmailId = matcher.matches();
		// print the output
		System.out.println(isEmailId);
		return matcher.matches();
	}

	public static void main(String[] args) {
		// Calling the method
		checkValidEmailId("rushikeshb5078@gamil.com");
	}

}
