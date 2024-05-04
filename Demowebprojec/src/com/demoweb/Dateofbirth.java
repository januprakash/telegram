package com.demoweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dateofbirth {
	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
		    Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).click();
			Thread.sleep(5000);
			while(true)
			{
				driver.findElement(By.xpath("//span[@class='react-datepicker__navigation-icon react-datepicker__navigation-icon--previous'/..]")).click();
			
			if(driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText().equals("December 2001"))
			{
				break;
			}
			driver.findElement(By.xpath("//div[.='15']")).click();

	
	}
}

}

