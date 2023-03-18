package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice {

	public static void main(String[] args) {

		WebDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

//		print text in buttons 
		WebElement searchip =driver.findElement(By.name("login"));
		System.out.println(searchip.getText());
		


	}

}
