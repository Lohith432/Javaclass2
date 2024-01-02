package pageelements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppage {
   WebDriver driver;
	public Signuppage(WebDriver driverhere) {
	this.driver =  driverhere;
	PageFactory.initElements(driver, this);
	
	}
    @FindBy (xpath = "//a[@href='/login']")
    WebElement login;
    
    @FindBy (xpath = "//input[@name='name']")
    WebElement entername;
    
    @FindBy (xpath = "//input[@name='email'])[2]")
    WebElement entermail;
    
    @FindBy (xpath = "//button[@type='submit'])[2]")
    WebElement submitbutton;
    
    public void enterSignupdetails(String Name, String EmailAdress) throws InterruptedException{
    	
    	login.clear();
    	System.out.println("'New User Signup!' is visible");
    	entername.sendKeys(Name);
    	entermail.sendKeys(EmailAdress);
    	submitbutton.sendKeys(Keys.ENTER);
    	
    }
}
