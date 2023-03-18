package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Action_Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		WebElement login = driver.findElement(By.xpath("//input[@id='login_field']"));
		login.sendKeys("Karthik");
		Thread.sleep(2000);
		Actions act =new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//input[@id='login_field']"))).build().perform();
		Thread.sleep(2000);

		
		
	}

}
