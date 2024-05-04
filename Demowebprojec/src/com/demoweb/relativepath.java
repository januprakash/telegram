package com.demoweb;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativepath {
	   public static void main(String[] args) throws InterruptedException
	   {
	  
		   WebDriver driver=new ChromeDriver();
	   driver.get("https://demoapps.qspiders.com/ui/checkbox");
	   driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[.='Check Box']")).click();
		driver.findElement(By.xpath("//input[@name='Domain' and @id='domain1']")).click();
		driver.findElement(By.xpath("//input[@name='mode' and @id='mode2']")).click();
		driver.findElement(By.xpath("//input[@name='mode' and @id='mode6']")).click();
		driver.findElement(By.xpath("//input[@type='submit' and @value='Continue']")).click();
	   
	   }
	   
	     n
}  
