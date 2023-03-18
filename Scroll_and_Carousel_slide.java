package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_and_Carousel_slide {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1090)");
		Thread.sleep(3000);

		WebElement scr = driver.findElement(By.xpath("//a[@class='a-link-normal feed-carousel-control feed-right']"));
		Thread.sleep(3000);
		scr.click();
		Thread.sleep(3000);
		scr.click();
		Thread.sleep(3000);
		scr.click();
		WebElement scl = driver.findElement(By.xpath("//a[@class='a-link-normal feed-carousel-control feed-left']"));
		Thread.sleep(3000);
		scl.click();
		Thread.sleep(3000);
		scl.click();
		Thread.sleep(3000);
		driver.close();
	}

}
