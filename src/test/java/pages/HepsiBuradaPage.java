package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HepsiBuradaPage {
    public HepsiBuradaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Elektronik']")
    public WebElement elektronik;


    @FindBy(xpath = "//*[text()='Bilgisayar/Tablet']")
    public WebElement bilgisayarTablet;


    @FindBy(xpath = "//*[text()='Dizüstü Bilgisayar']")
    public WebElement dizustu;

    @FindBy(xpath = "//*[text()='Laptop Fiyatları Notebook Modelleri']")
    public WebElement dizUstuGiris;


    @FindBy(xpath = "//*[text()='Tablet']")
    public WebElement tablet;

    @FindBy(xpath = "//*[text()='Tablet Fiyatları ve Modelleri']")
    public WebElement tabletGiris;


    @FindBy(xpath = "//*[text()='Masaüstü Bilgisayar']")
    public WebElement masaustu;

    @FindBy(xpath = "//*[text()='Masaüstü Bilgisayar Fiyatları']")
    public WebElement masaUstuGiris;


    @FindBy(xpath = "//*[text()='Oyuncu Özel']")
    public WebElement oyuncu;

    @FindBy(xpath = "//*[text()='Oyunculara Özel Bilgisayar ve Donanımlar']")
    public WebElement oyuncuGiris;


    @FindBy(xpath = "//*[text()='Veri Depolama']")
    public WebElement veri;

    @FindBy(xpath = "(//*[text()='Veri Depolama Ürünleri'])[1]")
    public WebElement veriGiris;


    @FindBy(xpath = "(//*[text()='Tüm Kategoriler'])[1]")
    public WebElement tumKategoriler;

    @FindBy(xpath = "//*[text()='Bilgisayar Fiyatları ve Modelleri']")
    public WebElement getTumKategorilerGiris;


    @FindBy(xpath = "//*[text()='Bilgisayar Bileşenleri']")
    public WebElement bilesenler;

    @FindBy(xpath = "//*[text()='Bilgisayar Parçaları ve Fiyatları']")
    public WebElement bilesenlerGiris;


    @FindBy(xpath = "(//*[text()='Yurt Dışından'])[2]")
    public WebElement yurt;

    @FindBy(xpath = "//*[text()='Yurt Dışından Ürünler']")
    public WebElement yurtGiris;


    @FindBy(xpath = "//*[text()='Ağ - Modem - Akıllı Ev']")
    public WebElement modem;

    @FindBy(xpath = "//*[text()='Ağ Modem Fiyatları']")
    public WebElement modemGiris;


    @FindBy(xpath = "//*[text()='Grafik Tablet']")
    public WebElement grafik;

    @FindBy(xpath = "(//*[text()='Grafik Tablet'])[1]")
    public WebElement grafikGiris;


    @FindBy(xpath = "//*[text()='Çevre Birimleri']")
    public WebElement cevre;

    @FindBy(xpath = "(//*[text()='Çevre Birimleri'])[1]")
    public WebElement cevreGiris;


    @FindBy(xpath = "//*[text()='Yazılım Ürünleri']")
    public WebElement yazilim;

    @FindBy(xpath = "(//*[text()='Yazılım Ürünleri'])[1]")
    public WebElement yazilimGiris;


    @FindBy(xpath = "(//*[text()='Aksesuarlar'])[1]")
    public WebElement aksesuarlar;

    @FindBy(xpath = "(//*[text()='Bilgisayar Aksesuarları'])[1]")
    public WebElement aksesuarlarGiris;


    @FindBy(xpath = "(//*[text()='Kulaklık'])[2]")
    public WebElement kulaklik;

    @FindBy(xpath = "//*[text()='Kulaklık Fiyatları ve Markaları']")
    public WebElement kulaklikGiris;

    @FindBy(xpath = "(//*[@class='sf-ChildMenuItems-OMxRJDk0466HYQpTli0P'])[1]")
    public WebElement hepsi;

    @FindBy (xpath = "(//div[@class='sf-ChildMenuItems-OMxRJDk0466HYQpTli0P'])[1]//span")
    public List<WebElement> sixtysixWE;

    @FindBy(xpath = "(//*[text()='Elektronik'])[1]")
    public WebElement elektronik1;

    @FindBy(xpath = "//*[text()='Bilgisayar/Tablet']")
    public WebElement bilgisayarTablet1;

    @FindBy(xpath = "(//div[@class='sf-ChildMenuItems-OMxRJDk0466HYQpTli0P'])[1]//span")
    public List<WebElement> altBasliklar;

    @FindBy (xpath = "//h1[@class='title']")
    public WebElement sonucYazi;




}
