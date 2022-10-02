package tests.day19;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_SingletonPattern {
    @Test
    public void test01() {

        // Driver obj = new Driver();
        // obj.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        /*
        SINGLETON PATTERN: Tekli Kullanim. Bir class'in farkli class'lardan obje olusturarak kullanimini
        engellemektir.

         => Yukaridaki kodlarla Driver class'indan default constructor sayesinde obje olusturup driver'i
         kullanabildik. Ama bu istenen bu istenen bir durum degil.
            Bunun onune gecmek yani bir class'dan sadece bir objenin kullanilabilmesine singleton pattern denir.
         Singleton Pattern yapmak icin ilgili class'da (bu ornek icin Driver class'da) private bir constructor
         olusturduk.
            Bu sayede driver'a ulasmak isteyen sadece class ismi ve method ismiyle (Driver.getDriver()
         ulasabilecek.

         */


    }
}
