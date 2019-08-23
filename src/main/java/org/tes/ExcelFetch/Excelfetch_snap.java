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
		driver.get("https://www.snapdeal.com/");
		WebElement btn=driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
		btn.sendKeys(getData(1,1));
		WebElement pwd=driver.findElement(By.xpath("//span[text()='Search']"));
		pwd.click();	
  }
}
