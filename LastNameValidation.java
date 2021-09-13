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

public class UserLastName {
	/**
	 * @purpose:Checking enter valid last name
	 * @return: boolean true or false
	 */

	public static boolean checkValidLastName(String lastName) {
		boolean isLastName;// check the validation
		String LastNameRegex = "^[A-Z]{1}[a-z]{3,}$";
		Pattern pattern = Pattern.compile(LastNameRegex);
		if (lastName == null) {
			isLastName = false;
		}
		Matcher matcher = pattern.matcher(lastName);
		isLastName = matcher.matches();
		// print the output
		System.out.println(isLastName);
		return matcher.matches();
	}

	public static void main(String[] args) {
		// Calling the method
		checkValidLastName("Bhosle");
	}

}
