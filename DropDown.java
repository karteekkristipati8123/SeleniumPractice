package com.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new EdgeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement dd =driver.findElement(By.id("searchDropdownBox"));
		Select sdd = new Select(dd);
		List<WebElement>sddoptions=sdd.getOptions();
		for(WebElement option : sddoptions)
		{
			System.out.println(option.getText());
		}
		sdd.selectByIndex(5);
		Thread.sleep(3000);
		sdd.selectByValue("search-alias=electronics");
		Thread.sleep(3000);
		sdd.selectByVisibleText("Musical Instruments");
		Thread.sleep(3000);

		String selectedText=sdd.getFirstSelectedOption().getText();
		System.out.println("Last selected option is  :- "+selectedText);
	}

}
