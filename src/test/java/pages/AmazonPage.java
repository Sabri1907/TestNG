package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){ // Public Contructor olusturmamiz gerekir
        PageFactory.initElements(Driver.getDriver(),this);
        /*
        => Baska class'lardan WebElementlere ulasmamiz icin PageFactory class'indan initElements()
        methodunu kullanmamiz gerekir.
        => @FindBy notasyonunda driver olmadigi icin initElements() methodu icine Driver class'inda
        olusturdugumuz driver'i this keyword'u ile tanimladik.
        */



    }

    @FindBy (id="twotabsearchtextbox") // Aldigimiz locate'i @FindBy notasyonu yanina parantez icinde yazilir
    public WebElement aramaKutusu; // Olusturdugumuz webelement'i public olarak tanimlariz ve
                                  // herkesin anlayacagi sekilde isimlendiririz.

    @FindBy (xpath="//*[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucuWE;

}
