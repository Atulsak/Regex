package com.junit.junittest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UserRegrstrationTest extends UserRegrstration {

	 @Test
	    public void Name(){
	        Assert.assertEquals(true, Name("Acd") );
	    }

	    @Test
	    public void LastNameTest(){
	        Assert.assertEquals(true, Last("Abcdef") );
	    }
	    @Test
	    public void EmailTest(){
	        Assert.assertEquals(true, Email("abc@xyz.com") );
	    }
	    @Test
	    public void PhoneTest(){
	        Assert.assertEquals(true, Phone("91 1234578910") );
	    }
	    @Test
	    public void PasswordTest(){
	        Assert.assertEquals(true, Password("09@abcdefgh") );
	    }

	    
}
