package org.test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.text2.BaseClass;

public class LoginPage2 extends BaseClass{
////	public WebElement getuser() {
////		WebElement txtusername = driver.findElement(By.id("email"));
////		return txtusername;
//	}	
	public LoginPage2() {
		PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
private WebElement close;
@FindBy(xpath="//input[@class='_3704LK']")
private WebElement name;





public WebElement getclose() {
	return close;
}
public WebElement getname() {
	return name;
}


	
		
		

	}

}
	




	
	




