package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		
	   
	   //	WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		
         // open url on the browser
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
	//provide user name - admin
   //WebElement txtUsername=driver.findElement(By.name("username"));
	//txtUsername.sendKeys("Admin");
		
		WebElement txtemailbox=driver.findElement(By.name("username"));
		txtemailbox.clear();
		txtemailbox.sendKeys("admin@yourstore.com");
		
		driver.findElement(By.id("Email")); //if there already a value
		
		
		
	//provide password
		driver.findElement(By.name("password")).sendKeys("admin123");
	
		
	//click login button
	driver.findElement( By.xpath("")).click();
	Thread.sleep(5000);
	
	//verift the title of page 
	/*
	String act_title=driver.getTitle();
	String exp_title="OrangeHRM";
	
	if(act_title.equals(exp_title))
	{
		System.out.println("tested pass");
	}
	else
	{
		System.out.println("failed");
	}
	*/
	
	//lable validation after login
	String act_label ="";
	try
	{
	act_label=driver.findElement(By.xpath("")).getText();
	}
	catch(NoSuchElementException e) {
		
	}
	String exp_label="Dashboard";
	
	if(act_label.equals(exp_label))
	{
		System.out.println("tested pass");
	}
	else
		
	{
		System.out.println("tested failed");
	}
		
	driver.quit();
	
	}
}

		
		
		
