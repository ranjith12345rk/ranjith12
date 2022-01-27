package org.test;

import java.util.List;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.text2.BaseClass;

public class LoginPage extends BaseClass{
////	public WebElement getuser() {
////		WebElement txtusername = driver.findElement(By.id("email"));
////		return txtusername;
//	}	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@id='email']")})
private List<WebElement> txtusername;
@FindAll({@FindBy(id="pas"),@FindBy(xpath="//input[@id='pass']")})
private WebElement txtpassword;
@FindBy(name="login")
private WebElement btnlogin;

public List<WebElement> getTxtusername() {
	return txtusername;
}
public WebElement getTxtpassword() {
	return txtpassword;
}
public WebElement  getbtngin() {
	return btnlogin;
	

}

	public  void login(String username,String password){
		SendKeys(getTxtusername().get(0),username);
		SendKeys(getTxtpassword(),password);
		btnclik(getbtngin());

	}

}
	




	
	




