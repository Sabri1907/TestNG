package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCamp {

    public HotelMyCamp(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='Log in']")
    public WebElement login;

    @FindBy (xpath = "//*[@id='UserName']")
    public WebElement userName;

    @FindBy (xpath = "//*[@id='Password']")
    public WebElement passWord;

    @FindBy (xpath = "//*[@value='Log in']")
    public WebElement login2;

    @FindBy (xpath = "//*[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement listOfUsers;
}
