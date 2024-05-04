import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isenabledtest 
{
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://demoapps.qspiders.com/ui/dropdown");
		  	   public static void main(String[] args) throws InterruptedException{
 driver.findElement(By.linkText("Multi select")).click();
		   Thread.sleep(2000);
		   WebElement countryDropdown=driver.findElement(By.id("select-multiple-native"));
		   Select selectcountry=new Select(countryDropdown);
		   System.out.println(selectcountry.isMultiple());
		   selectcountry.selectByVisibleText("Germany");
		   Thread.sleep(2000);
		   selectcountry.selectByIndex(4);
		   Thread.sleep(2000);
		   selectcountry.selectByValue("India");
		   Thread.sleep(2000);
		   selectcountry.deselectByValue("Germany");
		   Thread.sleep(2000);
		   selectcountry.deselectAll();
		   Thread.sleep(2000);

		   
		   
		   }
	   

}
