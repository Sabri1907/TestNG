package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FaceBookPage {

    public FaceBookPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@id='email']")
    public WebElement emailKutusu;

    @FindBy (xpath = "//*[@id='pass']")
    public WebElement sifreKutusu;

    @FindBy (xpath = "//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
    public WebElement girisYapButonu;

    @FindBy (xpath = "//*[@class='_9ay7']")
    public WebElement girisYapilamadiYazisi;

    @FindBy (xpath = "//*[@class='_9ai6 img sp_vxiiSmFDFzJ sx_082a2e']")
    public WebElement senMisinKutusu;

}
