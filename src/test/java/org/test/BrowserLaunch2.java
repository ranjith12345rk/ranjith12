package org.test;

import org.text2.BaseClass;

public class BrowserLaunch2 extends BaseClass  {
	public static void main(String[] args) {
browserLaunch("chrome");
launchurl("https://www.facebook.com/");
maximize();
findElements("id","email").sendKeys("ranjithkumar");
findElements("id","pass").sendKeys("ranjith");
findElements("name","login").click();
//Loginpage  l=new Loginpage();




}
}