package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchTheBrowser {

	public static void main(String[] args) {
		//Setup the path driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click the login button
		driver.findElement(By.className ("decorativeSubmit")).click();
		
		//click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click create lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//enter the firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Praveena");
		
		//enter lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("balraj");
		
		//handle the dropdown
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//FindElement returns WebElement
		Select drop1 =new Select(source);
		drop1.selectByVisibleText("Cold Call");
		
		//add the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println(driver.getTitle());
		
	}

}
