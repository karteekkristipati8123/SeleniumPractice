package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicControls {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		WebElement rcb=driver.findElement(By.id("femalerb"));
		rcb.click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement hindicb=driver.findElement(By.id("hindichbx"));
		hindicb.click();
		Thread.sleep(3000);
		driver.findElement(By.id("frenchchbx")).click();
		Thread.sleep(3000);
		if(hindicb.isSelected())
			hindicb.click();
		Thread.sleep(3000);
		driver.findElement(By.className("bcButton")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		
	}

}
