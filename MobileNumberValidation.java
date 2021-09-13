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

public class UserMobileNumber {
	/**
	 * @purpose:Checking enter valid mobile number
	 * @return: boolean true or false
	 */

	public static boolean checkValidMobilenumber(String Mobilenumber) {
		boolean isMobilenumber;// check the validation
		String MobilenumberRegex = "^[0-9]{2}\s{1}[0-9]{10}$";
		Pattern pattern = Pattern.compile(MobilenumberRegex);
		if (Mobilenumber == null) {
			isMobilenumber = false;
		}
		Matcher matcher = pattern.matcher(Mobilenumber);
		isMobilenumber = matcher.matches();
		// print the output
		System.out.println(isMobilenumber);
		return matcher.matches();
	}

	public static void main(String[] args) {
		// Calling the method
		checkValidMobilenumber("91 8788586956");
	}

}
