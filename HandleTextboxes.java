package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleTextboxes {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement emailTxt = driver.findElement(By.id("email"));
		if(emailTxt.isDisplayed())
		{
			if(emailTxt.isEnabled())
			{
				emailTxt.sendKeys("karthikkristipati123@gmail.com");
				Thread.sleep(3000);
				String enteredTxt=emailTxt.getAttribute("value");
				System.out.println(enteredTxt);
				emailTxt.clear();
			}else
				System.out.println("Email text box is not enabled");

		}else
			System.out.println("Email text box is not displayed");

	}

}
