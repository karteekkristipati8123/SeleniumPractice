package com.SeleniumPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Capture_Screenshot {

	public static void main(String[] args) throws IOException {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		File screenshotfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshotfile, new File("E:\\Screenshots\\Myntra.jpg"));
		driver.close();

	}

}
