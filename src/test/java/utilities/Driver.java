package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    /*
    => Butun class'lardan driver'i cagirip kullanabilmek icin oncelikle utilities package'i altinda Driver class'i
    olusturduk.
    =>  Class seviyesinde static WebDriver olusturduk ve daha sonra static getDriver methodu olusturarak
    test'lerden once yapmamiz gereken ayarlari bu methodun icinde yaptik.

    => Daha sonra driverClose() ve driverQuit methodlari olusturduk.

     */

    static WebDriver driver;

    public static WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // => WebElement turunde method olusturdugumuz icin bizden bisey return etmemizi istedi.
        // Biz de driver'i return ettik.
        return driver;
    }

    public static void closeDriver(){
        driver.close();
    }

    public static void quitDriver(){
        driver.quit();
    }
}
