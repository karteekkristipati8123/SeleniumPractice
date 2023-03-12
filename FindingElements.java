package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindingElements {

	public static void main(String[] args) throws Exception {
//		ChromeOptions ops = new ChromeOptions();
//		ops.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(ops);
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement username =driver.findElement(By.id("login_field"));
		username.sendKeys("karthikkristipati123@gmail.com");
		Thread.sleep(3000);
		WebElement pw =driver.findElement(By.name("password"));
		pw.sendKeys("jfjfkdj");
		Thread.sleep(3000);
		WebElement button=driver.findElement(By.name("commit"));
		button.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement link1 =driver.findElement(By.linkText("Forgot password?"));
		link1.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement link2 =driver.findElement(By.partialLinkText("Create an "));
		link2.click();
		Thread.sleep(3000);
		driver.navigate().to("https://github.com/login");
		Thread.sleep(2000);
		
//		driver.close();




	}


}
