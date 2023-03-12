package com.SeleniumPractice;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/#alerts");

		//		Sample Alert
		//		driver.findElement(By.xpath("//a[@onclick='window.alert(\"Sample alert\")']")).click();
		//		Thread.sleep(2000);
		//		Alert alert =driver.switchTo().alert();
		//		System.out.println(alert.getText());
		//		Thread.sleep(2000);
		//		alert.accept();

		//		Confirm Alert with Accept
		//		driver.findElement(By.xpath("//a[@onclick='window.confirm(\"Are you sure?\")']")).click();
		//		Thread.sleep(2000);
		//		Alert calert =driver.switchTo().alert();
		//		System.out.println(calert.getText());
		//		Thread.sleep(2000);
		//		calert.accept();
		//		
		//		Confirm Alert with Dismiss
		//		driver.findElement(By.xpath("//a[@onclick='window.confirm(\"Are you sure?\")']")).click();
		//		Thread.sleep(2000);
		//		Alert cdalert =driver.switchTo().alert();
		//		System.out.println(cdalert.getText());
		//		Thread.sleep(2000);
		//		cdalert.dismiss();
			
		//		Prompt Alert with Accept
		driver.findElement(By.linkText("See a sample prompt")).click();
		Thread.sleep(2000);
		Alert palert =driver.switchTo().alert();
		Thread.sleep(5000);
		palert.sendKeys("Java");
		System.out.println(palert.getText());
		Thread.sleep(5000);
		palert.accept();	
	}
}
