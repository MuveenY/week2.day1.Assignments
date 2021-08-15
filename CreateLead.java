package week2.day1.Assignments;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 WebElement webUser = driver.findElement(By.id("username"));
		 webUser.sendKeys("demosalesmanager");
		 
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("private");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Y");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muveen");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("chinna");
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Civil Engineer");
		 driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/18/92");
		 driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("400000");
		 
		 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select drpDwn = new Select(source);
		 drpDwn.selectByIndex(1);
		 
		 WebElement marketCampgn = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpDwn1 = new Select(marketCampgn);
		drpDwn1.selectByVisibleText("Road and Track");
		
		WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select drpDwn2 = new Select(currency);
		drpDwn2.selectByValue("INR");
		
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("980250067");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("muveen3636@gmail.com");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drpDwn4 = new Select(country);
		drpDwn4.selectByVisibleText("India");
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drpDwn3 = new Select(state);
		drpDwn3.selectByValue("IN-TN");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600050");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title1 = "View Lead | opentaps CRM";
		String homeTitle = driver.getTitle();
		
		if (title1.equals(homeTitle)) {
			System.out.println("In the Home Page");
			
		} else {
			System.out.println("Not in the Home Page");

		}
		
	}
	
}
		
		 
		 
	

	


