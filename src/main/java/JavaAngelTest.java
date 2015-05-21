
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.annotations.*;

public class JavaAngelTest {

	WebDriver driver;
	public String field_value1, field_value2, field_value3, field_value4;
	
	@BeforeClass
	public void startup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://angel.net/~nic/passwd.current.html");
		driver.manage().window().maximize();
	
	}
	
	@Test
	public void javaAngelTest1() throws InterruptedException
	{
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Az7~!@#$%^&*()_+-=;:/?.>,<|[{]}\"\'`\\");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("www.javatpoint.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td/input")).click();
		Thread.sleep(1000);
		field_value1 = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[2]/input")).getAttribute("value");
		Thread.sleep(1000);
		
		Assert.assertEquals((!field_value1.equals("")), true);
	}		
	
	@Test
	public void javaAngelTest2() throws InterruptedException
	{
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).clear();
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Az7~!@#$%^&*()_+-=;:/?.>,<|[{]}\"\'`\\");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).clear();
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("www.javatpoint.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td/input")).click();
		Thread.sleep(1000);
		field_value1 = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[2]/input")).getAttribute("value");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).clear();
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Az7~!@#$%^&*()_+-=;:/?.>,<|[{]}\"\'`\\");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).clear();
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("www.javatpoint.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td/input")).click();
		Thread.sleep(1000);
		field_value2 = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[2]/input")).getAttribute("value");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).clear();
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("anothermasterpassword");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).clear();
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("www.javatpoint.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td/input")).click();
		Thread.sleep(1000);
		field_value3 = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[2]/input")).getAttribute("value");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).clear();
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Az7~!@#$%^&*()_+-=;:/?.>,<|[{]}\"\'`");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).clear();
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("livejournal.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td/input")).click();
		Thread.sleep(1000);
		field_value4 = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[2]/input")).getAttribute("value");
		Thread.sleep(1000);
		
		Assert.assertEquals(field_value1, field_value2);
		Assert.assertEquals((!field_value3.equals("field_value1")), true);
		Assert.assertEquals((!field_value4.equals("field_value1")), true);
	}	
	
	@Test
	public void javaAngelTest3() throws InterruptedException
	{
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).clear();
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Az7~!@#$%^&*()_+-=;:/?.>,<|[{]}\"\'`");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).clear();
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("www.javatpoint.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td/input")).click();
		Thread.sleep(1000);
		field_value1 = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[2]/input")).getAttribute("value");
		Thread.sleep(1000);
		
		Assert.assertEquals(field_value1.substring(field_value1.length()-3, field_value1.length()), "@1a");
	}		

	@AfterClass
	public void teardown()
	{
		driver.quit();		
	}

}
