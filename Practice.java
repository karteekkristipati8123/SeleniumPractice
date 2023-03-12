package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice {

	public static void main(String[] args) {

		WebDriver driver =new EdgeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
	
		


	}

}
