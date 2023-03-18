package com.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Printinglinks {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		
//		WebDriver driver =new EdgeDriver();
//		driver.get("http://www.google.com");
//		driver.manage().window().maximize();
//		List<WebElement>allLinks =driver.findElements(By.tagName("a"));
//		for(WebElement link :allLinks )
//		{
//			System.out.println(link.getText() + " - " + link.getAttribute("href"));
//		}
//		
		//Printing links in dribbble website
		
//		driver.get("https://dribbble.com/tags/list_item");
//		Actions act =new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//ul[@class='site-nav-desktop-nav']/li/a[contains(text(),'Go Pro')]"))).build().perform();
//		
//		List<WebElement>lists=driver.findElements(By.xpath("//ul[@class='site-nav-desktop-nav']/li[4]/div"));
//		for(WebElement link :lists )
//		{
//			System.out.println(link.getText() + " - " + link.getAttribute("href"));
//		}
		
//		Printing links in Amazon
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='a-section a-spacing-small _deals-shoveler-v2_style_imageContainerPrimavera__2a3g5']")).click();
//		Thread.sleep(3000);
//		List<WebElement>lists=driver.findElements(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small s-price-instructions-style']//div[2]/a/span"));
//		for(WebElement link :lists )
//			{
//			System.out.println(link.getText() + " - " + link.getAttribute("href"));
//			}
		
//		Printing services list in IRCTC website
		
//		driver.get("https://www.irctctourism.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		List<WebElement>lists=driver.findElements(By.xpath("//ul[@class='nav-icons-wrap CenterIconBox']//a"));
//		for(WebElement link :lists )
//			{
//			System.out.println(link.getText() + " - " + link.getAttribute("href"));
//			}
//	
		
//		Printing month names in FB login page
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		List<WebElement>lists=driver.findElements(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg']"));
		for(WebElement link :lists )
			{
			System.out.println(link.getText() + " - " + link.getAttribute("value"));
			}
	}

}
