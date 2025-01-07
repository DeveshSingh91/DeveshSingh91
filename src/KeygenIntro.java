import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class KeygenIntro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://keygen.adeevatechnologies.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		WebElement clickuser = driver.findElement(By.xpath("//input[@placeholder='Enter your username']"));
		clickuser.click();
		System.out.println("Username is Clicked");
		
		WebElement enteruser = driver.findElement(By.xpath("//input[@placeholder='Enter your username']"));
		enteruser.sendKeys("retailer10");
		System.out.println("Username is Entered");
		
		WebElement clickpass = driver.findElement(By.id("login-form_password"));
		clickpass.click();
		System.out.println("Password is Clicked");
		
		WebElement enterpass = driver.findElement(By.id("login-form_password"));
		enterpass.sendKeys("12345678");
		System.out.println("Password is Entered");
		
		WebElement checkbox = driver.findElement(By.className("ant-checkbox-input"));
		checkbox.click();
		System.out.println("Checkbox is Clicked");
		
		WebElement loginbtn = driver.findElement(By.className("ant-btn-primary"));
		loginbtn.click();
		Thread.sleep(1000);
		System.out.println("SIgnIn Button is Clicked");
		
		// Automate MPIN SCREEN
		
		WebElement mpin1 = driver.findElement(By.xpath("input[@type='tel'][1]"));
		mpin1.click();
		Thread.sleep(1000);
		mpin1.sendKeys("1");
		
		WebElement mpin2 = driver.findElement(By.xpath("input[@type='tel'][2]"));
		mpin2.click();
		Thread.sleep(1000);
		mpin2.sendKeys("1");
		
		WebElement mpin3 = driver.findElement(By.xpath("input[@type='tel'][3]"));
		mpin3.click();
		Thread.sleep(1000);
		mpin3.sendKeys("1");
		
		//CONFIRM M-PIN
		
		WebElement mpin4 = driver.findElement(By.xpath("input[@type='tel'][4]"));
		mpin4.click();
		Thread.sleep(1000);
		mpin4.sendKeys("1");
		
		WebElement mpin5 = driver.findElement(By.xpath("input[@type='tel'][5]"));
		mpin5.click();
		Thread.sleep(1000);
		mpin5.sendKeys("1");
		
		WebElement mpin6 = driver.findElement(By.xpath("input[@type='tel'][6]"));
		mpin6.click();
		Thread.sleep(1000);
		mpin6.sendKeys("1");
		
		
		
		
		
		

	}

}
