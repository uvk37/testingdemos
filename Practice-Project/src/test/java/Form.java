import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
	@Test
	public void login(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Downloads\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		
		
		WebElement name= driver.findElement(By.id("id_name"));
		name.sendKeys("vijay kumar");
				
		
		
		//email
		WebElement email= driver.findElement(By.id("id_email"));
		email.sendKeys("uvk@gmail.com");
		
		//mobile
		WebElement mobile= driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("1234567890");
		
		
		//password
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Uvk@1234@9");
		
		//button
		WebElement register= driver.findElement(By.cssSelector("#registerButton"));
		register.click();
}
}

