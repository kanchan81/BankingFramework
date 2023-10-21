package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPom extends BaseClass {
	
	{
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[text() = 'Username : Admin']") private WebElement username;
	
	@FindBy(xpath = "//input[@name='username']") private WebElement inputusername;
	
	@FindBy(xpath = "//p[text() = 'Password : admin123']") private WebElement password;
	
	@FindBy(xpath = "//input[@name='password']") private WebElement inputpassword;
	
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	
	@FindBy(xpath = "//p[text()='Forgot your password? ']") private WebElement forgotpass;
	
	
	public String getUsername() 
	{
		
		 String uname= username.getText();
		 System.out.println(uname);
		return uname.substring(uname.indexOf(":"),uname.length()-1);
	}
	
	public String getPassword() 
	{
		
		 String pass = password.getText();
		 System.out.println(pass);
		 
		 return pass.substring(pass.indexOf(":"));
	}
	
	public void setUsername(String setUsername) 
	{
		inputusername.sendKeys(setUsername);
	}
	
	public void setPassword(String setPassword) 
	{
		inputpassword.sendKeys(setPassword);
	}
	
	public void clickLogin() 
	{
		login.click();
		
	}
	

}
