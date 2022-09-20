package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.ProductPriceObject;
import PageObjectModel.MyRegistrationPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import Resources.commonUtilities;

public class VerifyProductTestCase extends BaseClass{
	
	@Test
	public void search() throws IOException,InterruptedException
	{
		MyRegistrationPageObject rpo=new MyRegistrationPageObject(driver);
    	rpo.ClickLink1().click();
		Thread.sleep(2000);
	    WebElement link2=driver.findElement(By.linkText("Login"));
	    link2.click();
		Thread.sleep(2000);
		rpo.EnterEmail().sendKeys(TestCaseData.email);
		rpo.EnterPassword().sendKeys(TestCaseData.password);
		rpo.ClickLogin().click();
		ProductPriceObject ppo=new ProductPriceObject(driver);
		ppo.EnterPlacholder().sendKeys(TestCaseData.Iphonesearch);
		ppo.Click().click();
		Thread.sleep(2000);
		ppo.IphonePrice();
		ppo.AddToCart().click();   
		Thread.sleep(2000);
		ppo.Clear().clear();
		ppo.EnterPlacholder().sendKeys(TestCaseData.Samsungsearch);
		ppo.Click().click();
		Thread.sleep(5000);
		ppo.SamsungPrice();
		ppo.AddToCart2().click();
		Thread.sleep(2000);
		ppo.TotalClick().click();
		Thread.sleep(5000);
		String expected="$365.19";
		String actual = driver.findElement(By.xpath("(//td[@class='text-right'])[12]")).getText();
		commonUtilities.HandleAssert(actual, expected);

	
	}	
	
}
