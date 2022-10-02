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

    @FindBy (xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement girisYapildi;

    @FindBy (xpath = "//*[text()='Username or password is incorrect, please correct them and try again']")
    public WebElement girisYapilamadi;

    @FindBy (xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagement;

    @FindBy (xpath = "(//*[@class='icon-calendar'])[4]")
    public WebElement roomReservation;

    @FindBy (xpath = "//*[text()='Add Room Reservation ']")
    public WebElement addRoomReservation;

    @FindBy (xpath = "//*[@id='IDUser']")
    public WebElement idUser;



    @FindBy (xpath = "//*[@class='bootbox-body']")
    public WebElement roomreservationOnay;

    @FindBy (xpath = "//*[text()='OK']")
    public WebElement roomreservationOkeyButonu;

}

