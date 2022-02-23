package com.Bridgelabz.uservalidation;

import org.junit.Assert;
import org.junit.Test;
public class UsetValidationTest {
@Test
public void givenFirstName_whenProper_shoildReturnTrue() {	
UserValidation user=new UserValidation();
boolean result =user.validateFirstName("Nikita");
Assert.assertEquals(true,result);
}
@Test
public void givenLastName_whenProper_shoildReturnTrue() {
	UserValidation user=new UserValidation();
	boolean result=user.validateLastName("Khapare");
	Assert.assertEquals(true,result);	
}
@Test
public void givenEmail_whenProper_shoildReturnTrue() {
	UserValidation user=new UserValidation();
	boolean result=user.validateEmail("nikita5@gmail.com");
	Assert.assertEquals(true,result);	
}
@Test
public void givenPhoneNo_whenProper_shoildReturnTrue() {
	UserValidation user=new UserValidation();
	boolean result=user.validatePhoneNumber("9075194765");
	Assert.assertEquals(true,result);
}
@Test
public void givenPassword_whenProper_shoildReturnTrue() {
	UserValidation user=new UserValidation();
	boolean result=user.validatePassword("Nikita@53");
	Assert.assertEquals(true,result);


}



}
