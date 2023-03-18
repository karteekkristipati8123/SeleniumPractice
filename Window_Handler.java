package com.SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Window_Handler {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.irctctourism.com/");
		driver.findElement(By.xpath("/html/body/app-root/tourpkgs/div[2]/div[2]/ul/li[1]/a/div")).click();
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println(windowhandles);
		
		Iterator<String>iterator =windowhandles.iterator();
		String parentwindow = iterator.next();
		System.out.println(parentwindow);
		String childwindow =iterator.next();
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow);
		
		driver.findElement(By.xpath("//*[@id=\"eType\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);
		driver.close();
		

	}

}
