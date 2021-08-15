package week2.day1.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.findElement(By.linkText("Create New Account")).click();
		 
		 driver.findElement(By.name("firstname")).sendKeys("Y");
		 driver.findElement(By.name("lastname")).sendKeys("Muveen");
		 driver.findElement(By.name("reg_email__")).sendKeys("muveen3636@gmail.com");
		 
		 driver.findElement(By.name("reg_passwd__")).sendKeys("private");
		 
		 WebElement birthDay = driver.findElement(By.id("day"));
		 Select drpDwn = new Select(birthDay);
		 drpDwn.selectByValue("18");
		 
		 WebElement birthMonth = driver.findElement(By.id("month"));
		 Select drpDwn1 = new Select(birthMonth);
		 drpDwn1.selectByIndex(5);
		 
		 WebElement birthYear = driver.findElement(By.id("year"));
		 Select drpDwn2 = new Select(birthYear);
		 drpDwn2.selectByVisibleText("1992");
		 
		 driver.findElement(By.className("_58mt")).click();
		 
		 
		 
		 
		
	}

}
