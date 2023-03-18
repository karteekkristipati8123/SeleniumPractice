package com.SeleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JsE_Sendkeys {

	public static void main(String[] args) throws Exception {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('login_field').value='id';");
		Thread.sleep(2000);
		jse.executeScript("document.getElementsByName('login')[0].value='Name';");
		Thread.sleep(2000);
		jse.executeScript("document.getElementsByClassName('form-control input-block js-login-field')[0].value='ClassName';");
		Thread.sleep(2000);
		jse.executeScript("document.getElementsByTagName('input')[2].value='TagName';");
		Thread.sleep(2000);
		jse.executeScript("document.querySelector('#login_field').value='CSS';");
		Thread.sleep(2000);
		jse.executeScript("document.evaluate(\"//input[@id='login_field']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value='xpath';");
		Thread.sleep(2000);
	}
}
