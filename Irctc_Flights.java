package com.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc_Flights {

	public static void main(String[] args) {
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.air.irctc.co.in/");
		List<WebElement> li =driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		System.out.println(li.size());
		//print city names in origin options menu 
		for(WebElement c:li)
		{
			String cityName = c.getText();
			System.out.println(cityName);
		
		}
	}

}
