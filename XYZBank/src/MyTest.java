import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Random;

import javax.swing.GroupLayout.Group;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class MyTest {
	WebDriver driver;

	 
	
	@BeforeTest
	
	public void BeforeMyTest() {
		
		WebDriverManager.chromedriver().setup();
		
	
		driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		
		driver.manage().window().maximize();
		
	}
	
//	@Test(groups = "Customers" , priority = 1)
//	
//	public void LoginAsCustomer() {
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
//	}
//	
//	@Test(groups = "Manager" , priority = 1 )
//	
//	public void LoginAsManager() {
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//
//		
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button")).click();
//		
//	}
//	
//	
//	@Test(groups = "Manager" , priority = 2 )
//	
//	public void Add_Customers() throws InterruptedException {
//		
//		
//		
//		int userId = (int) (Math.random() *100);
//		StringBuilder userName = new StringBuilder();
//		userName.append(userId) ;
//		
//		String userIdAsString = userName.toString();
//		
//		System.out.println(userIdAsString);
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
//		
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("user" + userIdAsString);
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Customer");
//
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys(userIdAsString);
//		
//		
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
//		Thread.sleep(3000);
//		String myTestInTheAlert = driver.switchTo().alert().getText();
//		
//		System.out.println(myTestInTheAlert);
//		
//		boolean myCheck = myTestInTheAlert.contains("successfully");
//	
//		SoftAssert myAssert = new SoftAssert();
//		
//		myAssert.assertEquals(myCheck, false, "This is not countains successfully");
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
//		driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/list");
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")).sendKeys("user" + userIdAsString);
//		
//		myAssert.assertAll();
//	
//
//	}
	
	
	
//	@Test()
//	
//	public void test_again() throws InterruptedException {
//		
//		String depositString = "1500";
//		String withdrawlString = "700";
//		
//		int deposit=Integer.parseInt(depositString);  
//		int withdrawl=Integer.parseInt(withdrawlString);  
//		
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
//		
//		WebElement  myMenu = driver.findElement(By.xpath("//*[@id=\"userSelect\"]")); 
//		
//		Select mySelect = new Select(myMenu);
//		
//		mySelect.selectByVisibleText("Harry Potter");
//		
//		
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();
//		
//		
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys(depositString);
//		
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
//		
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]")).click();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys(withdrawlString);
//		
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
//		
//		
//		String AcualNumber = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]")).getText();
//		 
//		
//		int Acual=Integer.parseInt(AcualNumber); 
//		
//		
//		SoftAssert assertSoft = new SoftAssert();
//		
//		
//		assertSoft.assertEquals(Acual, deposit-withdrawl);
//		
//		assertSoft.assertAll();
//		
//	}
	
	@Test()
	
	public void exchange_currencies () throws InterruptedException {
		
		
		
		String number1 = "100";
		String number2 = "200";
		String number3= "300";

		
		int one=Integer.parseInt(number1);  
		int two=Integer.parseInt(number2); 
		int three=Integer.parseInt(number3);
		
		
		double dollarToRupee = 8232.39;
		double poundToRupee = 21002.80;

		
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
		
		WebElement  myMenu = driver.findElement(By.xpath("//*[@id=\"userSelect\"]")); 
		
		Select mySelect = new Select(myMenu);
		
		mySelect.selectByVisibleText("Harry Potter");
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys(number1);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		
		String text1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]")).getText();
		//Convert String to Doubl
		double textOne=Double.parseDouble(text1);
		
		textOne = dollarToRupee;
		
		Thread.sleep(3000);
		
     WebElement  myAccount = driver.findElement(By.xpath("//*[@id=\"accountSelect\"]")); 
		
		Select account = new Select(myAccount);
		
		 account.selectByIndex(1);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys(number2);
		
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		
        String text2 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]")).getText();
		//Convert String to Double
		double textTwo=Double.parseDouble(text2);
		
		textOne = dollarToRupee;
		Thread.sleep(3000);

		account.selectByIndex(2);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys(number3);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		
		String text3 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]")).getText();
		
		double textThree=Double.parseDouble(text3);
		// Count all balance
		double countBalance = dollarToRupee + poundToRupee + textThree;
		
		System.out.println(countBalance);

		
	}
	
	
	
	

}
