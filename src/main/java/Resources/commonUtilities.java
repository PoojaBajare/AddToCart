package Resources;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class commonUtilities {
	
	private static By driver;

	public static String HandleAssert(String actual,String expected)
	{
		 SoftAssert assertion =new SoftAssert();
			Assert.assertEquals(actual, expected);
			assertion.assertAll();
			System.out.println(actual);
			return actual;
	}
	

}