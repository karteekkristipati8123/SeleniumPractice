package com.SeleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Highlight {

	public static void main(String[] args) throws Exception {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('header-logo')[0].style.background='yellow';");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('login_field').setAttribute('style','border:5px red solid;background:yellow');");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('password').setAttribute('style','border:5px red solid;background:yellow');");
		Thread.sleep(3000);
		js.executeScript("document.getElementsByClassName('btn btn-primary btn-block js-sign-in-button')[0].style.background='yellow';");
		Thread.sleep(3000);
	}

}
