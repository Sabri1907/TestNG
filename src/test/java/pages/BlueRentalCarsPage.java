package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalCarsPage {
    public BlueRentalCarsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement blueRentLogin;

    @FindBy (xpath = "//*[@id='formBasicEmail']")
    public WebElement blueRentUser;

    @FindBy (id = "dropdown-basic-button")
    public WebElement blueRentProfil;


}
