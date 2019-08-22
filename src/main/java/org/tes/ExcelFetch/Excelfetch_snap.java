package org.tes.ExcelFetch;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelfetch_snap extends ExcelRead
{
 public static void main(String[] args) throws IOException 
  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subbian\\eclipse-workspace\\Arch\\ExcelFetch\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement btn=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		btn.click();
		WebElement login=driver.findElement(By.xpath("//a[text()='Login & Signup']"));
		login.click();
		WebElement user=driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		user.sendKeys(getData(4,1));
		WebElement pwd=driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		pwd.sendKeys(getData(4,2));	
  }
}
