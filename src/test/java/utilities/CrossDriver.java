package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class CrossDriver {

    private CrossDriver(){
        // Farkli objelerle erisimi engellemek icin private constructor olusturarak default constructor'i
        // iptal ettik.
    }

    static WebDriver driver;

    public static WebDriver getDriver(String browser){
        //  => Eger browser'a deger atanmamissa ConfigReader vasitasiyla configuration.properties'deki
        //  browser'in calismasi icin ternary ile driver'in calismasini garantiye almis olduk.
        browser=browser==null?ConfigReader.getProperty("browser"):browser;

        /*
            Testlerimizi xml file'dan farkli browser ile calistirabilmek icin getDriver() methoduna parametre
        atamamiz gerekir.
         */
        if (driver==null) {

            switch(browser){
                // =>CrossBrowser icin bizim gonderdigimiz browser uzerinden calismasi icin switch'e
                // parametre olarak girdigimiz degeri yazdik.

                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "edge" :
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "headless-chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    // => Bu manager sayfa acmadan testlerimizi yapar
                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        // => WebElement turunde method olusturdugumuz icin bizden bisey return etmemizi istedi.
        // Biz de driver'i return ettik.
        return driver;
    }

    public static void closeDriver(){
        if (driver!=null) { // driver'a deger atanmissa
            driver.close();
            driver=null; // Kapandiktan sonraki acmalari garanti altina almak icin null yaptik.

        }
    }

    public static void quitDriver(){
        if (driver!=null) {
            driver.quit();
            driver=null;
        }
    }
}
