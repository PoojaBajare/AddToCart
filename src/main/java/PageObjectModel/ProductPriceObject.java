package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProductPriceObject {

	//this driver dont have scope
	public WebDriver driver;
	
	//driver.findElement(By.xpath(""))
	//we have achieve encapsulation
private	By searchPlaceholder=By.xpath("//input[@placeholder='Search']");  

private	By click=By.xpath("//i[@class='fa fa-search']");

private By iphonePrice=By.xpath("//p[@class='price']");

private By addtoCart1=By.xpath("(//div[@class='button-group']//button)[1]");

private By clear=By.xpath("//input[@name='search']");

private By searchSamsung=By.xpath("//input[@name='search']");

private By samsungPrice=By.xpath("(//p[@class='price'])[2]");

private By addtoCart2=By.xpath("(//div[@class='button-group']//button)[4]");

private By totalClick=By.xpath("//div[@id='cart']/button");




public ProductPriceObject(WebDriver driver2) {
	this.driver=driver2;
}

public WebElement EnterPlacholder()
{
	return driver.findElement(searchPlaceholder);
}

public WebElement Click()
{
	return driver.findElement(click);
}




public WebElement AddToCart()
{
	return driver.findElement(addtoCart1);
}

public WebElement Clear()
{
	return driver.findElement(clear);
}

public WebElement Search()
{
	return driver.findElement(searchSamsung);
}

public WebElement AddToCart2()
{
	
	return driver.findElement(addtoCart2);
}

public WebElement TotalClick()
{
	return driver.findElement(totalClick);
}



public String IphonePrice()
{
	WebElement a= driver.findElement(iphonePrice);
	String price1= a.getText();
	String wordsiphone[]=price1.split(" ");
	   //words["$123.20EX","Tax:" ,"$123.20"}
	//   System.out.println(words[0]);
	   String temp2=wordsiphone[0];
	   String FinaliphonePrice= temp2.replaceAll("[^\\d.]", "");
	   // double FinaliphonePriceDou =Double.parseDouble(FinaliphonePrice);
	   return FinaliphonePrice;   	   
}

public  String SamsungPrice()
{
	WebElement b= driver.findElement(samsungPrice);
	String price2= b.getText();
	
     String wordssamsung[]=price2.split(" ");
	     String temp2=wordssamsung[0];
	   String FinalsamsungPrice= temp2.replaceAll("[^\\d.]", "");
	 //  double FinalsamsungPriceDou =Double.parseDouble(FinalsamsungPrice);
	//   System.out.println(FinalsamsungPriceDou);
	   return FinalsamsungPrice;   	   
}

}
