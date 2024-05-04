package com.demoweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register 
{
   {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://demowebshop.tricentis.com/register");
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.id("gender-female")).click();
	   driver.findElement(By.id("FirstName")).sendKeys("janani");
	   driver.findElement(By.id("lastName")).sendKeys("janu");
	   driver.findElement(By.id("Password")).sendKeys("janu234");
	   driver.findElement(By.id("ConfirmPassword")).sendKeys("janu234");
	   driver.findElement(By.id("register-button")).click();
	   driver.quit();
   }
	   
	   
	   

} 