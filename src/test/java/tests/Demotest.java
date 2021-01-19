package tests;

import static org.junit.Assert.assertTrue;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demotest {
	
	WebDriver driver;
	
	@Test
	public void test1() {
		System.out.println("Testing Maven");
		

		  WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
	     
	     driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/Weborders/Login.aspx");
	     
	     driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	     driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("tes");
	     driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		
		
	}	
	
//	@AfterMethod (alwaysRun = true)
//	public void teardownMethod() throws IOException {
//		// Based on the test result (pass, fail, skipped) you can put logic to takw a screenshot
//		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
//		FileUtils.copyFile(screenshot, new File("screenshot/screenshot" + System.currentTimeMillis() +"png "));
//		assertTrue(driver.getTitle().equals("Login"));
//		driver.quit();
		
//	}
	
	@Test
	public void test2() {
		List<Integer> list = new ArrayList<>();
		
		Faker f = new Faker();
		
		System.out.println(f.internet().emailAddress());
		
		
	}
	
	
		
}		
		
        
		

		
	


