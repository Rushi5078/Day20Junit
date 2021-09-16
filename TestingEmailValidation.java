/**
 * 
 */
package com.RejexProblem;

import org.junit.Assert;
import org.junit.Test;

import RegexProblem.SampleEmailValidation;

/**
 * @author RUSHIKESH BHOSLE
 *
 */
public class TestingEmailValidation {

	/**
	 * @purpose:Testing and Validation for email
	 * @return: true or false
	 */
	
	//Test case for the email valid or invalid
	
	@Test
	public void When_Sysmbol_TwoDot_Present_ReturnTrue()
	{
		Assert.assertTrue(SampleEmailValidation.checkValidEmail("abc@bridgelabz.co.in"));
	}
	
	@Test
	public void When_Sysmbol_Domain_SubDomain_Present_ReturnTrue()
	{
		Assert.assertTrue(SampleEmailValidation.checkValidEmail("abc@gmail.com.com"));
	}
	
	@Test
	public void When_Sysmbol_OneDot_Domain__Present_ReturnTrue()
	{
		Assert.assertTrue(SampleEmailValidation.checkValidEmail("abc@yahoo.com"));
	}
	
	
	@Test
	public void When_Hypen_Numbers_Sysmbol_OneDot_Present_ReturnTrue()
	{
		Assert.assertTrue(SampleEmailValidation.checkValidEmail("abc-100@yahoo.com"));
	}
	
	@Test
	public void When_Dot_Numbers_Sysmbol_Present_ReturnTrue()
	{
		Assert.assertTrue(SampleEmailValidation.checkValidEmail("abc-100@yahoo.com"));
	}
	
	@Test
	public void When_Numbers_Sysmbol_Present_ReturnTrue()
	{
		Assert.assertTrue(SampleEmailValidation.checkValidEmail("abc111@abc.com"));
	}

	@Test
	public void When_Hypen_Numbers_Sysmbol_Present_ReturnTrue()
	{
		Assert.assertTrue(SampleEmailValidation.checkValidEmail("abc-100@abc.net"));
	}
	
	@Test
	public void When_Dot_Numbers_Sysmbol_Domain_SubDomain_Present_ReturnTrue()
	{
		Assert.assertTrue(SampleEmailValidation.checkValidEmail("abc.100@abc.com.au"));
	}
	
	@Test
	public void When_ArethmaticSymbol_Numbers_Sysmbol_Present_ReturnTrue()
	{
		Assert.assertTrue(SampleEmailValidation.checkValidEmail("abc+100@gmail.com"));
	}
	
	@Test
	public void When_FirstDot_Present_ReturnFalse()
	{
		Assert.assertFalse(SampleEmailValidation.checkValidEmail(".abc@abc.com"));
	}
	
	@Test
	public void When_OnlyCharacter_Present_ReturnFalse()
	{
		Assert.assertFalse(SampleEmailValidation.checkValidEmail(".abc@abc.com"));
	}
	
	@Test
	public void When_Invalid_Domain_Present_ReturnFalse()
	{
		Assert.assertFalse(SampleEmailValidation.checkValidEmail("abc@.com.my"));
	}
	
	@Test
	public void When_TwoAtTheRate_Present_ReturnFalse()
	{
		Assert.assertFalse(SampleEmailValidation.checkValidEmail("abc@abc@gmail.com"));
	}
	
	@Test
	public void When_Bracket_Star_Present_ReturnFalse()
	{
		Assert.assertFalse(SampleEmailValidation.checkValidEmail("abc()*@gmail.com"));
	}
	
	@Test
	public void When_TwoDot_Numbers_Present_ReturnFalse()
	{
		Assert.assertFalse(SampleEmailValidation.checkValidEmail("abc..2002@gmail.com"));
	}
	
	@Test
	public void When_Dot_AtTheRate_Present_ReturnFalse()
	{
		Assert.assertFalse(SampleEmailValidation.checkValidEmail("abc.@gmail.com"));
	}
	
	@Test
	public void When_Numbers_AtTheRate_Present_ReturnFalse()
	{
		Assert.assertFalse(SampleEmailValidation.checkValidEmail("abc123@.com"));
	}
	
	@Test
	public void When_Numbers_AtTheRate_Domain_SubDomain_Present_ReturnFalse()
	{
		Assert.assertFalse(SampleEmailValidation.checkValidEmail("abc123@.com.com"));
	}
	
	@Test
	public void When_InvalidDomain_Present_ReturnFalse()
	{
		Assert.assertFalse(SampleEmailValidation.checkValidEmail("abc123@gmail.a"));
	}
}
