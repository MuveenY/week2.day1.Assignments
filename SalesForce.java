package week2.day1.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElement(By.name("UserFirstName")).sendKeys("Y");
		 driver.findElement(By.name("UserLastName")).sendKeys("Naveen");
		 driver.findElement(By.name("UserEmail")).sendKeys("naveen36@gmail.com");
		 
		 driver.findElement(By.name("CompanyName")).sendKeys("private");
		 driver.findElement(By.name("UserPhone")).sendKeys("8940250056");
		 
		 WebElement jobTitle = driver.findElement(By.name("UserTitle"));
		 Select drpDwn = new Select(jobTitle);
		 drpDwn.selectByIndex(7);
		 
		 WebElement employees = driver.findElement(By.name("CompanyEmployees"));
		 Select drpDwn1 = new Select(employees);
		 drpDwn1.selectByValue("9");
		 
		 WebElement country = driver.findElement(By.name("CompanyCountry"));
		 Select drpDwn2 = new Select(country);
		 drpDwn2.selectByVisibleText("India");
		 
		 driver.findElement(By.className("checkbox-ui")).click();
		 
		 driver.close();
		 
		 
	}	 
	
}
