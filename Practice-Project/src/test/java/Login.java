import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
	@Test
	public void loginhere(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Downloads\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/login/");
		
		
		
		
		
		//email
		WebElement email= driver.findElement(By.id("id_email_login"));
		email.sendKeys("uvk@gmail.com");
		
		
		//password
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Uvk@1234");
		
		//button
		WebElement login= driver.findElement(By.cssSelector("#cndidate_login_widget"));
		login.click();
}
}
