package com.SeleniumPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class URL_Title {
		public static void main(String[] args) {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		
		// Print Url
		String url = driver.getCurrentUrl();
		System.out.println("CurrentUrl is :"+ url);
		
		// Print Title
		String title =driver.getTitle();
		System.out.println("Title of web page is :" + title);
		

	}

}
