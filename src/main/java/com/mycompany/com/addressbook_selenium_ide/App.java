package com.mycompany.com.addressbook_selenium_ide;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;



public class App 
{   
	@Test
    public static void main( String[] args )
    {
		System.setProperty("webdriver.chrome.driver","home/ubuntu/selenium/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("---headless");
		 WebDriver driver = new ChromeDriver(chromeOptions);

		 System.out.println("Hi, Welcome to selenuim with jenkins");


		 driver.get("http://13.232.37.11:8889//addressbook");

		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 driver.findElement(By.className("v-button")).click();
		 driver.findElement(By.id("gwt-uid-5")).sendKeys("SwathiJenkins");
		 driver.findElement(By.id("gwt-uid-7")).sendKeys("ManjunathJenkins");
		 driver.findElement(By.id("gwt-uid-9")).sendKeys("999996667");
		 driver.findElement(By.id("gwt-uid-11")).sendKeys("Devops@edu.com");
		 driver.findElement(By.id("gwt-uid-13")).sendKeys("02/21/1998");
		 driver.findElement(By.className("v-button-primary")).click();
		 //Thread.sleep(5000);
		 //driver.quit();

    }
}
