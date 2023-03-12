package com.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Printinglinks {

	public static void main(String[] args) {
//		ChromeOptions ops = new ChromeOptions();
//		ops.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(ops);
		
		WebDriver driver =new EdgeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		List<WebElement>allLinks =driver.findElements(By.tagName("a"));
		for(WebElement link :allLinks )
		{
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
		
	}

}
