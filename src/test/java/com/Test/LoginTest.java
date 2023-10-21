package com.Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.utility.Utility;

public class LoginTest extends BaseClass {
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		try {
			launchTheWeb();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@AfterMethod
	public void tearDown() 
	{
		//driver.quit();
	}
	@Test
	public void loginTest() throws InterruptedException 
	{  
		com.pom.LoginPom loginPom = new com.pom.LoginPom();
		
		loginPom.setUsername(loginPom.getUsername());		
		loginPom.setPassword(loginPom.getPassword());		
		loginPom.clickLogin();
		
		 String actualUrl = driver.getCurrentUrl();
	      String expectedUrl = "dashboard";
	      Assert.assertTrue(actualUrl.contains(expectedUrl));
		
		
	}
	@Test
	public void test_users() throws EncryptedDocumentException, IOException 
	{
		com.pom.LoginPom loginPom = new com.pom.LoginPom();
       Utility utility = new Utility();
		
		Sheet sh = utility.read_Excel("Sheet1");
		
	    String key=  (String) utility.getSingleStringData(1, 0, sh);
		String value=(String) utility.getSingleStringData(1, 0, sh);
		loginPom.clickLogin();
	}
	
	public void getDataFromExcel() throws EncryptedDocumentException, IOException {
		Utility utility = new Utility();
		
		Sheet sh = utility.read_Excel("Sheet1");
		
	    String key=  (String) utility.getSingleStringData(1, 0, sh);
		String value=(String) utility.getSingleStringData(1, 0, sh);
		
		
		
		
				
	}

}
