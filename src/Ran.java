import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ran {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("hello");
		
		System.setProperty("webdriver.chrome.driver", "/home/apmosys/Downloads/chromedriver_linux64 (2) (1)/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();	
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("rahul");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();


	}

}
