package LinkdinPackage;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class Linkdinclass {
	WebDriver driver;

  @Test
  public void f() {
	  
	    //driver.findElement(By.xpath("input[@id='session_key']")).click();
		driver.findElement(By.id("session_key")).sendKeys("pallavipuranik2@gmail.com");
		//driver.findElement(By.xpath("//input[@id=\"session_password\"]")).click();

		driver.findElement(By.xpath("//input[@id='session_password']")).sendKeys("Pallup22@24");
		
		driver.findElement(By.xpath("//*[@id=\"fastrack-div\"]/div[3]/form/div[2]/button")).click();
	
		
	}
  
  @BeforeTest
  public void beforeTest() {
	  driver = new EdgeDriver();
		driver.get("https://in.linkedin.com");
		
		
		
		driver.manage().window().maximize();
		
	}
  

  @AfterTest
  public void afterTest() {
	  
			driver.quit();
  }}
		
	
 

