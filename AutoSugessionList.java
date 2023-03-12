package com.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSugessionList {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("http://www.google.com");
		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("suseela");
		Thread.sleep(3000);
		List<WebElement> elements =driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		Thread.sleep(3000);
		System.out.println(elements.size());
		for (WebElement b:elements)
		{
			String element =b.getText();
			System.out.println(element);
		}
		driver.close();
	}

}
