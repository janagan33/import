package com.pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Scrollwbside {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromeDriver\\chromedriver 106\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String Webside="http://demo.guru99.com/test/guru99home/";
		driver.manage().window().maximize();
		driver.get(Webside);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2500)");
		WebElement EmailBox = driver.findElement(By.xpath("//input[@type='text']"));
		EmailBox.sendKeys("janagan97janagan@gmail.com");
		
		
		
		WebElement SAPBox = driver.findElement(By.xpath("//select[@id='awf_field-91977689']"));
		
		Select Select=new Select(SAPBox);
		Select.selectByIndex(7);
		Thread.sleep(10000);
		Select.selectByValue("awlist4228221");
		Thread.sleep(10000);
		Select.selectByVisibleText("SAP MM");
		WebElement  SubmitBox= driver.findElement(By.xpath("//button[@type='submit']"));
		SubmitBox.click();
		Alert Alert= driver.switchTo().alert();
		Alert.accept();
		Thread.sleep(10000);
		driver.close();
		
		
	}

}
