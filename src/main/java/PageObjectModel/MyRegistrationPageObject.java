package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyRegistrationPageObject {

	public WebDriver driver;
	
	private	By firstName=By.xpath("//input[@id='input-firstname']");
	private	By lastName=By.xpath("//input[@id='input-lastname']");
	private	By email=By.xpath("//input[@id='input-email']");
	private	By telephone=By.xpath("//input[@id='input-telephone']");
	private	By password=By.xpath("//input[@id='input-password']");
	private	By confirm_password=By.xpath("//input[@id='input-confirm']");
	private By clickcontinue=By.xpath("//input[@value='Continue']");
	private By agree=By.xpath("//input[@name='agree']");
	private By homebutton=By.xpath("//i[@class='fa fa-home']");
	private By login=By.xpath("//input[@value='Login']");
	private By link1=By.xpath("//a[@title='My Account']");
	
	public MyRegistrationPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement ClickLink1()
	{
		return driver.findElement(link1);
	}
	public WebElement EnterFirstName()
	{
		return driver.findElement(firstName);
	}
	
	public WebElement EnterLastName()
	{
		return driver.findElement(lastName);
	}
	
	public WebElement EnterEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement EnterTelephone()
	{
		return driver.findElement(telephone);
	}
	public WebElement EnterPassword()
	{
		return driver.findElement(password);
	}
	public WebElement EnterConfirmPassword()
	{
		return driver.findElement(confirm_password);
	}
	public WebElement ClickContinue()
	{
		return driver.findElement(clickcontinue);
		
	}
	
	public WebElement ClickAgree()
	{
		return driver.findElement(agree);
	}
	public WebElement HomeButton()
	{
		return driver.findElement(homebutton);
	}

	public WebElement ClickLogin()
	{
		return driver.findElement(login);
	}
	
}
