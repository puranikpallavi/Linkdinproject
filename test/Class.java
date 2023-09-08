package test;

import org.testng.annotations.Test;

import linkdin_test_cases.chromeDriver;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class Class {
  @Test
  public void f() {
	  driver.findElement(By.xpath("input[@id='session_key']")).click();
		driver.findElement(By.id("session_key")).sendKeys("pallavipuranik2@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"session_password\"]")).click();
		driver.findElement(By.id("password")).sendKeys("Pallup22@24");
		driver.findElement(By.xpath("//button[@id=\"main-content\"]/section[1]/div/div/form/div[2]/button")).click();
	
		driver.get("https://www.amazon.in");
		
	}
  
  @BeforeTest
  public void beforeTest() {
	  driver = new chromeDriver();
		driver.get("https://in.linkedin.com");
		
		driver.manage().window().maximize();
		
	}
  

  @AfterTest
  public void afterTest() {
	  
			driver.quit();
		}
		
	
 
