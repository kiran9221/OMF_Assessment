package testngoldmutual;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class oldmutualfinance {
	WebDriver br;
	
	  @BeforeMethod
	  @Parameters ("browser")
	  public void browseropen(String browsername) {
		  

			if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Selinium\\Old Mutual Assessment\\test\\driver\\geckodriver.exe");

				br = new FirefoxDriver();
			} else if (browsername.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver","C:\\Selinium\\Br\\chromedriver_win32 (2)\\chromedriver.exe");
				br = new ChromeDriver();
				
			}
			br.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
			br.manage().window().maximize();
			br.get("https://www.oldmutualfinance.co.za/");
	  }

	  @AfterMethod
	  public void browserclose() {
		  br.close();}

	
	
	
	@Test
  public void testcas1() throws IOException, InterruptedException {
		
		Date currentdate = new Date();
		String actualpagetittle = br.getTitle();
		System.out.println(actualpagetittle);
		String expectedpagetitle = "Bank and Borrow Solutions | Old Mutual";
		// Bank and Borrow Solutions | Old Mutual
		Assert.assertEquals(actualpagetittle, expectedpagetitle);
		// screen shot
		File SrcFile = ((TakesScreenshot) br).getScreenshotAs(OutputType.FILE);
		String screenshotfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
		FileUtils.copyFile(SrcFile,
				new File("src\\main\\java\\launch\\screenshoots\\" + screenshotfilename + "first.png"));
		Actions ac1 = new Actions(br);
		ac1.moveToElement(br.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/om-wc-config[1]/div[1]/om-page[1]/div[1]/div[1]/header[1]/om-header-with-breadcrumbs[1]/div[1]/om-main-navigation[1]/div[1]/nav[1]/div[1]/div[2]/om-main-navigation-menu[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]")))
				.perform();
		Thread.sleep(3000);
		ac1.moveToElement(br.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/om-wc-config[1]/div[1]/om-page[1]/div[1]/div[1]/header[1]/om-header-with-breadcrumbs[1]/div[1]/om-main-navigation[1]/div[1]/nav[1]/div[1]/div[2]/om-main-navigation-menu[1]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")))
				.perform();

		Thread.sleep(3000);
		br.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/om-wc-config[1]/div[1]/om-page[1]/div[1]/div[1]/header[1]/om-header-with-breadcrumbs[1]/div[1]/om-main-navigation[1]/div[1]/nav[1]/div[1]/div[2]/om-main-navigation-menu[1]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))
				.click();
		String actualloantitle = br.getTitle();
		System.out.println(actualloantitle);
		// Personal Loans – Apply for a Loan Online | Old Mutual
		String expectedloantitle = "Personal Loans – Apply for a Loan Online | Old Mutual";
		Assert.assertEquals(actualloantitle, expectedloantitle);
		File SrcFile1 = ((TakesScreenshot) br).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile1,
				new File("src\\main\\java\\launch\\screenshoots\\" + screenshotfilename + "middle.png"));

		Thread.sleep(3000);
		br.navigate().to("https://www.oldmutual.co.za/personal/tools-and-calculators/personal-loan-calculator/");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) br;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);

		ac1.moveToElement(br.findElement(By.xpath("(//span[contains(@class,'selected-value-container')])[1]")))
				.perform();
		br.findElement(By.xpath("(//span[contains(@class,'selected-value-container')])[1]")).click();
		Thread.sleep(5000);
		JavascriptExecutor js1 = (JavascriptExecutor) br;
		js1.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		ac1.moveToElement(br.findElement(By.cssSelector("li#R100000"))).perform();
		Thread.sleep(5000);
		br.findElement(By.cssSelector("li#R50000")).click();
		Thread.sleep(5000);
		ac1.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(3000);
		ac1.moveToElement(br.findElement(By.xpath("(//span[@class='om-button-text'][contains(.,'Next')])[1]")))
				.perform();
		Thread.sleep(3000);
		br.findElement(By.xpath("(//span[@class='om-button-text'][contains(.,'Next')])[1]")).click();
		Thread.sleep(3000);
		ac1.moveToElement(br.findElement(By.xpath("(//span[contains(@class,'selected-value-container')])[1]")))
				.perform();
		Thread.sleep(3000);
		br.findElement(By.xpath("(//span[contains(@class,'selected-value-container')])[1]")).click();
		Thread.sleep(3000);

		JavascriptExecutor js2 = (JavascriptExecutor) br;
		js2.executeScript("window.scrollBy(0,500)");

		Thread.sleep(2000);
		ac1.moveToElement(
				br.findElement(By.xpath("//li[@class='om-dropdown__option option-in-list'][contains(.,'60 Months')]")))
				.perform();
		Thread.sleep(2000);

		br.findElement(By.xpath("//li[@class='om-dropdown__option option-in-list'][contains(.,'60 Months')]")).click();

		br.findElement(By.xpath("(//span[@class='om-button-text'][contains(.,'Calculate')])[1]")).click();
		Thread.sleep(5000);
		File SrcFile2 = ((TakesScreenshot) br).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile2,
				new File("src\\main\\java\\launch\\screenshoots\\" + screenshotfilename + "last.png"));
		
		String actualrepayment = br.findElement(By.xpath("//strong[contains(.,'R1 656.43 - R1 810.05')]")).getText();
		Thread.sleep(2000);		
		System.out.println(actualrepayment);
		
		String expectedrepayment = "R1 656.43 - R1 810.05";
		// final validation
		Assert.assertEquals(actualrepayment, expectedrepayment);
		System.out.println("testcasepass");
		Thread.sleep(2000);
		br.quit();
  }

}

