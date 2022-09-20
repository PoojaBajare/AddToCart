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


public class VerifyMyRegistrationTestCase extends BaseClass {
@Test
	public void register() throws InterruptedException, IOException
	{
	
	MyRegistrationPageObject rpo=new MyRegistrationPageObject(driver);
	rpo.ClickLink1().click();
	Thread.sleep(2000);	   
	WebElement link2=driver.findElement(By.linkText("Register"));
    link2.click();
	Thread.sleep(2000);
	rpo.EnterFirstName().sendKeys(TestCaseData.firstname);
	rpo.EnterLastName().sendKeys(TestCaseData.lastname);
	rpo.EnterEmail().sendKeys(TestCaseData.email);
	rpo.EnterTelephone().sendKeys(TestCaseData.telephone);
	rpo.EnterPassword().sendKeys(TestCaseData.password);
	rpo.EnterConfirmPassword().sendKeys(TestCaseData.confirmpassword);
	rpo.ClickAgree().click();
	Thread.sleep(2000);
	rpo.ClickContinue().click();
	Thread.sleep(5000);
	}
	
	
}
