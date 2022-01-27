package org.text2;




import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.remote.server.handler.SwitchToParentFrame;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
		
//		public static WebDriver browserLaunch() {
//		WebDriverManager.chromedriver().setup();
//	        return driver=new ChromeDriver();
//		}

	public static WebDriver browserLaunch(String browsername){
//		if(browsername.equals("chrome")){
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//		
//		}
//		else if(browsername.equals("firefox")) {
//			WebDriverManager.firefoxdriver().setup();
//		driver=new FirefoxDriver();
//		}
//		else if(browsername.equalsIgnoreCase("Edge")) {
//			WebDriverManager.edgedriver().setup();
//			driver=new EdgeDriver();
//
//		
//		}
//		return driver;
		
		
		
		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
			break;
		default:
			break;
		}
		return driver;
		
		
	}
public static void launchurl(String url) {
	driver.get(url);
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static String currenturl() {
		String currenturl=driver.getCurrentUrl();
		return currenturl;
	}
		
		public static String SendKeys(WebElement e, String name) {
			e.sendKeys(name);
			return name;
		}
		// find element
		public static  WebElement findElements(String locatorname,String locator) {
			WebElement e=null;
			if(locatorname.equals("id")) {
				e= driver.findElement(By.id(locator));
			}
			else if(locatorname.equals("name")) {
				e= driver.findElement(By.name(locator));
			}
			if(locatorname.equals("xpath")) {
				e= driver.findElement(By.xpath(locator));
			}
			return e;
		}
			
		public static void btnclik(WebElement e) {
		e.click();

		}
		
		public static String gettitle() {
			String title = driver.getTitle();
			return title;
			

		}
		
		
		
		@SuppressWarnings("deprecation")
		public static void implicitwait(long time){
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}
		//actions
		public static void movetoElement(WebElement e) {
			Actions a=new Actions(driver);
			a.moveToElement(e).perform();
					
			
		}
		//drag and drop
	public static  void dragandDrop(WebElement src,WebElement des) { 
	Actions a=new Actions(driver);
	a.dragAndDrop(src,des).perform();
	}
	
	
	{
			

		}
		
	
		
	

}
		
		
	

	
	
	
	
	
	
	
	
	
	
	


	
	
		
		
	
			
			
			
			
			
			
		
		
		
		
	


