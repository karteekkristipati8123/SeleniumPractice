package com.SeleniumPractice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sc {

	public static void main(String[] args) throws Exception {
	ChromeOptions cp = new ChromeOptions();
	cp.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(cp);
	driver.manage().window().maximize();
	driver.get("https://github.com/login");
	Thread.sleep(3000);
	WebElement cb=driver.findElement(By.xpath("//input[@name='commit']"));
	File gc = cb.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(gc,new File(".\\Screenshots\\githubinputbutton1.png"));
	}

}
