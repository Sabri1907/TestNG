package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HepsiBuradaPage {
    public HepsiBuradaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Elektronik']")
    public WebElement elektronik;


    @FindBy(xpath = "//*[text()='Bilgisayar/Tablet']")
    public WebElement bilgisayarTablet;


    @FindBy(xpath = "//*[text()='Dizüstü Bilgisayar']")
    public WebElement dizUstuBilgisayar;

    @FindBy(xpath = "//*[text()='Laptop Fiyatları Notebook Modelleri']")
    public WebElement dizUstuBilgisayarGiris;


    @FindBy(xpath = "//*[text()='Tablet']")
    public WebElement tablet;

    @FindBy(xpath = "//*[text()='Tablet Fiyatları ve Modelleri']")
    public WebElement tabletGiris;


    @FindBy(xpath = "//*[text()='Masaüstü Bilgisayar']")
    public WebElement masaustuBilgisayar;

    @FindBy(xpath = "//*[text()='Masaüstü Bilgisayar Fiyatları']")
    public WebElement masaUstuBilgisayarGiris;


    @FindBy(xpath = "//*[text()='Oyuncu Özel']")
    public WebElement oyuncuOzel;

    @FindBy(xpath = "//*[text()='Oyunculara Özel Bilgisayar ve Donanımlar']")
    public WebElement oyuncuOzelGiris;


    @FindBy(xpath = "//*[text()='Veri Depolama']")
    public WebElement veriDepolama;

    @FindBy(xpath = "(//*[text()='Veri Depolama Ürünleri'])[1]")
    public WebElement veriDepolamaGiris;


    @FindBy(xpath = "(//*[text()='Tüm Kategoriler'])[1]")
    public WebElement tumKategoriler;

    @FindBy(xpath = "//*[text()='Bilgisayar Fiyatları ve Modelleri']")
    public WebElement getTumKategorilerGiris;


    @FindBy(xpath = "//*[text()='Bilgisayar Bileşenleri']")
    public WebElement bilgisayarBilesenleri;

    @FindBy(xpath = "//*[text()='Bilgisayar Parçaları ve Fiyatları']")
    public WebElement bilgisayarBilesenleriGiris;


    @FindBy(xpath = "(//*[text()='Yurt Dışından'])[2]")
    public WebElement yurtDisindan;

    @FindBy(xpath = "//*[text()='Yurt Dışından Ürünler']")
    public WebElement yurtDisindanGiris;


    @FindBy(xpath = "//*[text()='Ağ - Modem - Akıllı Ev']")
    public WebElement agModem;

    @FindBy(xpath = "//*[text()='Ağ Modem Fiyatları']")
    public WebElement agModemGiris;


    @FindBy(xpath = "//*[text()='Grafik Tablet']")
    public WebElement grafikTablet;

    @FindBy(xpath = "(//*[text()='Grafik Tablet'])[1]")
    public WebElement grafikTabletGiris;


    @FindBy(xpath = "//*[text()='Çevre Birimleri']")
    public WebElement cevreBirimleri;

    @FindBy(xpath = "(//*[text()='Çevre Birimleri'])[1]")
    public WebElement cevreBirimleriGiris;


    @FindBy(xpath = "//*[text()='Yazılım Ürünleri']")
    public WebElement yazilimUrunleri;

    @FindBy(xpath = "(//*[text()='Yazılım Ürünleri'])[1]")
    public WebElement yazilimUrunleriGiris;


    @FindBy(xpath = "(//*[text()='Aksesuarlar'])[1]")
    public WebElement aksesuar;

    @FindBy(xpath = "(//*[text()='Bilgisayar Aksesuarları'])[1]")
    public WebElement aksesuarGiris;


    @FindBy(xpath = "(//*[text()='Kulaklık'])[2]")
    public WebElement kulaklik;

    @FindBy(xpath = "//*[text()='Kulaklık Fiyatları ve Markaları']")
    public WebElement kulaklikGiris;



}
