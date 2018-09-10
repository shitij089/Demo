package myAutomation;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class QaitAutomation {

	private static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
	}

	@AfterClass
	public static void afterClass() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test (priority = 1)
	public void QALink() {
		String baseURL = "https://qainfotech.com/";
		driver.get(baseURL);	
	}
	
	@Test (priority = 2)
	public void about() {
		driver.findElement(By.xpath("//*[contains(text(),'About')]")).click();
		System.out.println("After clicking About...");
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'About')]")).isDisplayed());
	}
	
	@Test (priority = 3)
	public void services() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[contains(text(),'Services')]")).click();
		System.out.println("After clicking Services...");
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Services')]")).isDisplayed());
	}
	
	@Test (priority = 4)
	public void verticals() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[contains(text(),'Verticals')]")).click();
		System.out.println("After clicking Verticals...");
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Verticals')]")).isDisplayed());
	}
	
	@Test (priority = 5)
	public void knowledgeCenter() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[contains(text(),'Knowledge Center')]")).click();
		System.out.println("After clicking Knowledge Center...");
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Knowledge Center')]")).isDisplayed());
	}
	
	@Test (priority = 6)
	public void team() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[contains(text(),'Team')]")).click();
		System.out.println("After clicking Team...");
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Team')]")).isDisplayed());
	}
	
	@Test (priority = 7)
	public void news() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[contains(text(),'News')]")).click();
		System.out.println("After clicking News...");
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'News')]")).isDisplayed());
	}
	
	@Test (priority = 8)
	public void contact() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[contains(text(),'Contact')]")).click();
		/*driver.navigate().to("https://qainfotech.com/#contact");
		Assert.assertEquals("https://qainfotech.com/#contact", driver.getCurrentUrl(),
				"Strings are not matching");*/
		System.out.println("After clicking Contact...");
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Contact')]")).isDisplayed());
	}
	
	@Test (priority = 9)
	public void careers() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//span[contains(text(), 'Careers')]")).click();
		System.out.println("After clicking in Careers...");
		driver.navigate().to("https://qainfotech.com/careers.html");
		Assert.assertEquals("https://qainfotech.com/careers.html", driver.getCurrentUrl(),
				"Strings are not matching");
		//Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(), 'Careers')]")).isDisplayed());
	}
	
	@Test (priority = 10)
	public void jobOpportunities() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[contains(text(), 'Job Opportunities')]")).click();
		System.out.println("After clicking in Job Oppurtunities in Career page...");
		driver.navigate().to("https://qainfotech.com/careers/job-opportunities.html");
		Assert.assertEquals("https://qainfotech.com/careers/job-opportunities.html", driver.getCurrentUrl(),
				"Strings are not matching");
	}
	
	@Test (priority = 11)
	public void QATV() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[contains(text(), 'QA TV')]")).click();
		System.out.println("After clicking in QA TV in Career page...");
		driver.navigate().to("https://qainfotech.com/qa-tv.html");
		Assert.assertEquals("https://qainfotech.com/qa-tv.html", driver.getCurrentUrl(),
				"Strings are not matching");
		driver.navigate().to("https://qainfotech.com/careers/job-opportunities.html");
	}
	
	@Test (priority = 12)
	public void employeeSpeak() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[contains(text(), 'Employees Speak')]")).click();
		System.out.println("After clicking in Employee Speak in Career page...");
		driver.navigate().to("https://qainfotech.com/careers/employees-speak.html");
		Assert.assertEquals("https://qainfotech.com/careers/employees-speak.html", driver.getCurrentUrl(),
				"Strings are not matching");
	}
	
	@Test (priority = 13)
	public void fakeJobOffer() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[contains(text(), 'Fake Job Offer – Beware')]")).click();
		System.out.println("After clicking in Fake Job Offer in Career page...");
		driver.navigate().to("https://qainfotech.com/beware-of-fake-job-offers.html");
		Assert.assertEquals("https://qainfotech.com/beware-of-fake-job-offers.html", driver.getCurrentUrl(),
				"Strings are not matching");
	}
	
	
}
