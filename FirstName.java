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
public class UserRegistration 
{
	/**
	 * @purpose:Checking enter valid first name
	 * @return: boolean true or false
	 */
	
    public static boolean checkValidFirstUserName(String firstName) 
	{
        boolean isFirstName;
		String firstNameRegex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(firstNameRegex);
		if (firstName == null)
		{
			isFirstName = false;
		}
		Matcher matcher = pattern.matcher(firstName);
		isFirstName = matcher.matches();

		 System.out.println(isFirstName);
		 return matcher.matches();
    }
    
        public static void main(String[] args) 
	{
		// TODO Calling the method
		checkValidFirstUserName("Rushikesh");
		 
	}

}
