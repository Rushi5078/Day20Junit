/**
 * 
 */
package com.RejexProblem;

import org.junit.Assert;
import org.junit.Test;
import RegexProblem.EmailIdValidation;
import RegexProblem.PasswordValidationRule1;
import RegexProblem.PasswordValidationRule2;
import RegexProblem.PasswordValidationRule3;
import RegexProblem.PasswordValidationRule4;
import RegexProblem.UserLastName;
import RegexProblem.UserMobileNumber;
import RegexProblem.UserRegistration;

/**
 * @author RUSHIKESH BHOSLE
 *
 */
public class TestingUserRegestration {
	/**
	 * @purpose:Testing and validation
	 * @return: true or false
	 */
	// Test case for the first name

	@Test
	public void When_First_Letter_Capital_ReturnTrue() {
		Assert.assertTrue(UserRegistration.checkValidFirstUserName("Rushikesh"));
	}

	@Test
	public void When_First_Letter_Small_ReturnFalse() {
		Assert.assertFalse(UserRegistration.checkValidFirstUserName("rushikesh"));
	}

	@Test
	public void When_First_Letter_Number_ReturnFalse() {
		Assert.assertFalse(UserRegistration.checkValidFirstUserName("8Rushikesh"));
	}

	@Test
	public void When_First_Letter_Symbol_ReturnFalse() {
		Assert.assertFalse(UserRegistration.checkValidFirstUserName("@Rushikesh"));
	}

//Test case for last name
	@Test
	public void WhenFirst_Letter_Capital_ReturnTrue() {
		Assert.assertTrue(UserLastName.checkValidLastName("Bhosle"));
	}

	@Test
	public void WhenFirst_Letter_Small_ReturnFalse() {
		Assert.assertFalse(UserLastName.checkValidLastName("bhosle"));
	}

	@Test
	public void WhenFirst_Letter_Number_ReturnFalse() {
		Assert.assertFalse(UserLastName.checkValidLastName("6Bhosle"));
	}

	@Test
	public void WhenFirst_Letter_Symbol_ReturnFalse() {
		Assert.assertFalse(UserLastName.checkValidLastName("@Bhosle"));
	}

//Test case for mobile number
	@Test
	public void Mobile_Number_shoud_Be_TenDigit_ReturnTrue() {
		Assert.assertTrue(UserMobileNumber.checkValidMobilenumber("91 8788586956"));
	}

	@Test
	public void Mobile_Number_Character_Is_NotPresent_ReturnFalse() {
		Assert.assertFalse(UserMobileNumber.checkValidMobilenumber("R91 8788586956"));
	}

	@Test
	public void Mobile_Number_Sysmbol_Is_NotPresent_ReturnFalse() {
		Assert.assertFalse(UserMobileNumber.checkValidMobilenumber("#91 8788586956"));
	}

	@Test
	public void Mobile_Number_Bracket_Is_NotPresent_ReturnFalse() {
		Assert.assertFalse(UserMobileNumber.checkValidMobilenumber("()91 8788586956"));
	}

//Test case for the email validation
	@Test
	public void When_EmailId_AllLetter_Small_ReturnTrue() {
		Assert.assertTrue(EmailIdValidation.checkValidEmailId("rushikeshb5078@gmail.com"));
	}

	@Test
	public void When_EmailId_FirstLetter_ShoudNotUse_Symbol_ReturnFalse() {
		Assert.assertFalse(EmailIdValidation.checkValidEmailId("#rushikeshb5078@gmail.com"));
	}

	@Test
	public void When_EmailId_FirstLetter_ShoudNotUse_Bracket_ReturnFalse() {
		Assert.assertFalse(EmailIdValidation.checkValidEmailId("()rushikeshb5078@gmail.com"));
	}

//Test case for the password validation Rule1

	@Test
	public void When_Password_All_Letter_Small_ReturnTrue() {
		Assert.assertTrue(PasswordValidationRule1.checkValidPassword("rushikesh"));
	}

//test case for the password validation Rule2

	@Test
	public void When_Password_FirstLetter_Capital_ReturnTrue() {
		Assert.assertTrue(PasswordValidationRule2.checkValidPassword("Rushikesh"));
	}

//Test case for the password validation Rule3

	@Test
	public void When_Password_OneNumericNumber_ReturnTrue() {
		Assert.assertTrue(PasswordValidationRule3.checkValidPassword("Rushikesh1"));
	}

//Test case for the password validation Rule4

	@Test
	public void When_Password_OneSymbole_ReturnTrue() {
		Assert.assertTrue(PasswordValidationRule4.checkValidPassword("Rushikesh@123"));
	}
}
