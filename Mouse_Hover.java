package com.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws Exception {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=7656602511906258882&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299135&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiA6rCgBhDVARIsAK1kGPLJV4IITcG5R7Dg_HUA8vXx9XSyfXbcAQURKTMbpFyt9eEb-kQQ1TYaAkFvEALw_wcB");
		Thread.sleep(2000);
		Actions act =new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"))).build().perform();
		List<WebElement>allLinks =driver.findElements(By.xpath("//div[@id='nav-al-wishlist']"));
		for(WebElement link :allLinks )
		{
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
		Thread.sleep(3000);

		List<WebElement>allLinks1 =driver.findElements(By.xpath("//div[@id='nav-al-your-account']"));
		for(WebElement link1 :allLinks1 )
		{
			System.out.println(link1.getText() + " - " + link1.getAttribute("href"));
		}
		Thread.sleep(3000);
	}

}
