package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import utilities.Driver;


public class BasePage {
    public BasePage() {PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//*[text()='Şamil Çay']")
    public WebElement MyAccId;

    @FindBy(xpath = "(//*[@href='https://www.wecan.com.tr/uye/duzenle'])[1]")
    public WebElement MyAccount;

    @FindBy(xpath = "(//*[@href='https://www.wecan.com.tr/Orders'])[1]")
    public WebElement MyOrders;

    @FindBy(xpath = "//*[@class='col-12']")
    public WebElement MyOrdersPage;

    @FindBy(xpath = "//*[@href='https://www.wecan.com.tr/uye/cikis']")
    public WebElement SafeExit;

    //-----HOMEPAGE-HEADER------//
    @FindBy(xpath = "(//*[@href='https://www.wecan.com.tr/'])[2]")
    public WebElement WecanLogosu;

    @FindBy(xpath = "(//*[@class='rounded-circle'])[1]")
    public WebElement HeaderTurkishButton;

    @FindBy(xpath = "//*[@class='liveAmount text-white px-2']")
    public WebElement HeaderCartButton;

    @FindBy(xpath = "//*[text()='Yardım']")
    public WebElement TurkishChange;

    @FindBy(xpath ="(//*[@class='rounded-circle'])[2]" )
    public WebElement HeaderEnglishButton;

    @FindBy(xpath = "//*[text()='Support']")
    public WebElement EnglishChange;

    @FindBy(xpath = "(//*[@class='rounded-circle'])[3]")
    public WebElement HeaderRussianButton;

    @FindBy(xpath = "//*[text()='помощь']")
    public WebElement RussianChange;

    @FindBy(xpath ="//*[@class='d-flex align-items-center justify-content-center me-3 custom-link']")
    public WebElement HeaderSupportButton;

    @FindBy(xpath ="//*[@class='header-l-btn border-0 py-2 px-3 login rounded me-1']" )
    public WebElement HeaderSignInButton;

    @FindBy(xpath = "//*[@class='header-l-btn border-0 py-2 px-3 register rounded']")
    public WebElement HeaderSignUpButton;

    @FindBy(xpath = "//*[@class='col-lg-6 col-md-6 col-sm-12 col-xs-12 text-center']")
    public WebElement SignInPage;

    @FindBy(xpath = "//*[@class='col-lg-6 col-md-6 col-sm-12 col-xs-12 text-center']")
    public WebElement SignUpPage;

    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement SearchBox;

    @FindBy(xpath = "//*[@class='text-center mt-2']")
    public WebElement SearchBoxPuskullu;

    //-------HOME-BODY-PAGE--------//

    @FindBy(xpath = "(//*[@class='collection-button py-1 px-4 mt-1'])[1]")
    public WebElement BabyDiscoverNowButton;

    @FindBy(xpath = "(//*[@class='collection-button py-1 px-4 mt-1'])[2]")
    public WebElement ToddlerDiscoverNowButton;

    @FindBy(xpath = "(//*[@class='collection-button py-1 px-4 mt-1'])[3]")
    public WebElement KidsDiscoverNowButton;

    @FindBy(xpath = "//*[@id='icq8g']")
    public WebElement RegisterFreeButton;

    @FindBy(xpath = "//*[@id='idy3kn']")
    public WebElement GetShippingInfoButton;

    @FindBy(xpath = "//*[@id='imgtrr']")
    public WebElement ReturnRequestButton;

    @FindBy(xpath = "(//*[@loading='lazy'])[1]")
    public WebElement Baby624ViewAll;

    @FindBy(xpath = "(//*[@loading='lazy'])[2]")
    public WebElement HomeBabyDress;

    @FindBy(xpath = "(//*[@loading='lazy'])[3]")
    public WebElement HomeBabyEvenings;

    @FindBy(xpath = "(//*[@loading='lazy'])[4]")
    public WebElement HomeBabySets;

    @FindBy(xpath = "(//*[@loading='lazy'])[5]")
    public WebElement HomeToddlerEvenings;

    @FindBy(xpath = "(//*[@loading='lazy'])[6]")
    public WebElement HomeToddlerDress;

    @FindBy(xpath = "(//*[@loading='lazy'])[7]")
    public WebElement HomeToddlerSets;

    @FindBy(xpath = "(//*[@loading='lazy'])[8]")
    public WebElement HomeToddlerViewAll;

    @FindBy(xpath = "//*[text()='More About Wecan']")
    public WebElement HomeMoreAboutWecan;

    @FindBy(xpath = "//*[@id='i76f']")
    public WebElement AboutWecanPage;
    //----------------------NewClothingOneOptions-------------------------//
    @FindBy(xpath = "//*[@data-src='https://wecan.sercdn.com/resimler/a5e7b3241cf25ee56d5f50de47bbf3d7-65157fd47b841.jpg']")
    public WebElement NewClothingOne;

    @FindBy(xpath = "(//*[@alt='Ekru'])[1]")
    public WebElement NewClothingOneColorOne;

    @FindBy(xpath = "(//*[@alt='Somon'])[1]")
    public WebElement NewClothingOneColorTwo;

    @FindBy(xpath = "(//*[@alt='Pudra'])[1]")
    public WebElement NewClothingOneColorThree;

    @FindBy(xpath = "(//*[@alt='Beyaz'])[1]")
    public WebElement NewClothingOneColorFour;

    @FindBy(xpath = "(//*[@class='bi bi-plus'])[1]")
    public WebElement NewClothingOne4Plus;

    @FindBy(xpath = "(//*[@class='bi bi-dash'])[1]")
    public WebElement NewClothingOne4Minus;

    @FindBy(xpath = "(//*[@class='d-none d-lg-inline-block'])[1]")
    public WebElement NewClothingOneAddToCart;

    @FindBy(xpath = "(//*[@class='bi  bi-heart  fs-5 icon-favorite'])[1]")
    public WebElement NewClothing1Fav;
    //----------------------NewClothingTwoOptions-------------------------//

    @FindBy(xpath = "(//*[@data-src='https://wecan.sercdn.com/resimler/881f84a73af56a1ff8dae2e5ea2c9cfd-6553d2327185f.jpg'])[1]")
    public WebElement NewClothingTwo;

    @FindBy(xpath = "(//*[@alt='Ekru'])[2]")
    public WebElement NewClothingTwoColorOne;

    @FindBy(xpath = "(//*[@alt='Beyaz'])[2]")
    public WebElement NewClothingTwoColorTwo;

    @FindBy(xpath = "(//*[@alt='Somon'])[2]")
    public WebElement NewClothingTwoColorThree;

    @FindBy(xpath = "(//*[@class='bi bi-plus'])[2]")
    public WebElement NewClothingTwo4Plus;

    @FindBy(xpath = "(//*[@class='bi bi-dash'])[2]")
    public WebElement NewClothingTwo4Minus;

    @FindBy(xpath = "(//*[@class='d-none d-lg-inline-block'])[2]")
    public WebElement NewClothingTwoAddToCart;

    @FindBy(xpath = "(//*[@class='bi  bi-heart  fs-5 icon-favorite'])[2]")
    public WebElement NewClothing2Fav;

    //----------------------NewClothingThreeOptions-------------------------//
    @FindBy(xpath = "(//*[@data-src='https://wecan.sercdn.com/resimler/c469f1d2440619f7938038466c70528b-6575ce236132e.jpg'])[1]")
    public WebElement NewClothingThree;

    @FindBy(xpath = "(//*[@alt='Somon'])[3]")
    public WebElement NewClothingThreeColorOne;

    @FindBy(xpath = "(//*[@alt='Beyaz'])[3]")
    public WebElement NewClothingThreeColorTwo;

    @FindBy(xpath = "(//*[@alt='Ekru'])[3]")
    public WebElement NewClothingThreeColorThree;

    @FindBy(xpath = "(//*[@alt='Yeşil'])[1]")
    public WebElement NewClothingThreeColorFour;

    @FindBy(xpath = "(//*[@class='bi bi-plus'])[3]")
    public WebElement NewClothingThree4Plus;

    @FindBy(xpath = "(//*[@class='bi bi-dash'])[3]")
    public WebElement NewClothingThree4Minus;

    @FindBy(xpath = "(//*[@class='d-none d-lg-inline-block'])[3]")
    public WebElement NewClothingThreeAddToCart;

    @FindBy(xpath = "(//*[@class='bi  bi-heart  fs-5 icon-favorite'])[3]")
    public WebElement NewClothing3Fav;
    //----------------------NewClothingFourOptions-------------------------//
    @FindBy(xpath = "(//*[@data-src='https://wecan.sercdn.com/resimler/6f661df74536b930e6dc37747884374d-657007af5affd.jpg'])[1]")
    public WebElement NewClothingFour;

    @FindBy(xpath = "(//*[@alt='Lila'])[1]")
    public WebElement NewClothingFourColorOne;

    @FindBy(xpath = "(//*[@alt='Pudra'])[2]")
    public WebElement NewClothingFourColorTwo;

    @FindBy(xpath = "(//*[@alt='Somon'])[4]")
    public WebElement NewClothingFourColorThree;

    @FindBy(xpath = "(//*[@alt='Beyaz'])[4]")
    public WebElement NewClothingFourColorFour;

    @FindBy(xpath = "(//*[@alt='Ekru'])[4]")
    public WebElement NewClothingFourColorFive;

    @FindBy(xpath = "(//*[@class='bi bi-plus'])[4]")
    public WebElement NewClothingFour4Plus;

    @FindBy(xpath = "(//*[@class='bi bi-dash'])[4]")
    public WebElement NewClothingFour4Minus;

    @FindBy(xpath = "(//*[@class='d-none d-lg-inline-block'])[4]")
    public WebElement NewClothingFourAddToCart;

    @FindBy(xpath = "(//*[@class='bi  bi-heart  fs-5 icon-favorite'])[4]")
    public WebElement NewClothing4Fav;
    //----------------------NewClothingFiveOptions-------------------------//
    @FindBy(xpath = "(//*[@data-src='https://wecan.sercdn.com/resimler/11fe42fe54b500321091d6dda77afad9-6553d16edda32.jpg'])[1]")
    public WebElement NewClothingFive;

    @FindBy(xpath = "(//*[@alt='Ekru'])[5]")
    public WebElement NewClothingFiveColorOne;

    @FindBy(xpath = "(//*[@alt='Somon'])[5]")
    public WebElement NewClothingFiveColorTwo;

    @FindBy(xpath = "(//*[@class='bi bi-plus'])[5]")
    public WebElement NewClothingFive4Plus;

    @FindBy(xpath = "(//*[@class='bi bi-dash'])[5]")
    public WebElement NewClothingFive4Minus;

    @FindBy(xpath = "(//*[@class='d-none d-lg-inline-block'])[5]")
    public WebElement NewClothingFiveAddToCart;

    @FindBy(xpath = "(//*[@class='bi  bi-heart  fs-5 icon-favorite'])[5]")
    public WebElement NewClothing5Fav;

    //----------------------NewClothingSixOptions-------------------------//
    @FindBy(xpath = "(//*[@data-src='https://wecan.sercdn.com/resimler/74b850ba5864a2d69a0157a41b3083d6-65716ef14b217.jpg'])[1]")
    public WebElement NewClothingSix;

    @FindBy(xpath = "(//*[@alt='Pudra'])[3]")
    public WebElement NewClothingSixColorOne;

    @FindBy(xpath = "(//*[@alt='Ekru'])[6]")
    public WebElement NewClothingSixColorTwo;

    @FindBy(xpath = "(//*[@class='bi bi-plus'])[6]")
    public WebElement NewClothingSix4Plus;

    @FindBy(xpath = "(//*[@class='bi bi-dash'])[6]")
    public WebElement NewClothingSix4Minus;

    @FindBy(xpath = "(//*[@class='d-none d-lg-inline-block'])[6]")
    public WebElement NewClothingSixAddToCart;

    @FindBy(xpath = "(//*[@class='bi  bi-heart  fs-5 icon-favorite'])[6]")
    public WebElement NewClothing6Fav;

    //----------------------NewClothingSevenOptions-------------------------//
    @FindBy(xpath = "(//*[@data-src='https://wecan.sercdn.com/resimler/8c903fd4555c6f077076c9b3e8e9313a-656ada44c19af.jpg'])[1]")
    public WebElement NewClothingSeven;

    @FindBy(xpath = "(//*[@alt='Beyaz'])[5]")
    public WebElement NewClothingSevenColorOne;

    @FindBy(xpath = "(//*[@alt='Yeşil'])[2]")
    public WebElement NewClothingSevenColorTwo;

    @FindBy(xpath = "(//*[@alt='Sarı'])[1]")
    public WebElement NewClothingSevenColorThree;

    @FindBy(xpath = "(//*[@alt='Pembe'])[1]")
    public WebElement NewClothingSevenColorFour;

    @FindBy(xpath = "(//*[@class='bi bi-plus'])[7]")
    public WebElement NewClothingSeven4Plus;

    @FindBy(xpath = "(//*[@class='bi bi-dash'])[7]")
    public WebElement NewClothingSeven4Minus;

    @FindBy(xpath = "(//*[@class='d-none d-lg-inline-block'])[7]")
    public WebElement NewClothingSevenAddToCart;

    @FindBy(xpath = "(//*[@class='bi  bi-heart  fs-5 icon-favorite'])[7]")
    public WebElement NewClothing7Fav;
    //----------------------NewClothingEightOptions-------------------------//

    @FindBy(xpath = "(//*[@data-src='https://wecan.sercdn.com/resimler/85e2637399c7fa0d4ae89f1425ccafdb-656afcffcd0ce.jpg'])[1]")
    public WebElement NewClothingEight;

    @FindBy(xpath = "(//*[@alt='Ekru'])[7]")
    public WebElement NewClothingEightColorOne;

    @FindBy(xpath = "(//*[@alt='Gül Kurusu'])[1]")
    public WebElement NewClothingEightColorTwo;

    @FindBy(xpath = "(//*[@alt='Pudra'])[4]")
    public WebElement NewClothingEightColorThree;

    @FindBy(xpath = "(//*[@class='bi bi-plus'])[8]")
    public WebElement NewClothingEight4Plus;

    @FindBy(xpath = "(//*[@class='bi bi-dash'])[8]")
    public WebElement NewClothingEight4Minus;

    @FindBy(xpath = "(//*[@class='d-none d-lg-inline-block'])[8]")
    public WebElement NewClothingEightAddToCart;

    @FindBy(xpath = "(//*[@class='bi  bi-heart  fs-5 icon-favorite'])[8]")
    public WebElement NewClothing8Fav;

    //----------------------NewClothingNineOptions-------------------------//
    @FindBy(xpath = "(//*[@data-src='https://wecan.sercdn.com/resimler/542de2ccad6d8b1c0e1ad243d8c8ab86-65833b6d9ad31.jpg'])[1]")
    public WebElement NewClothingNine;

    @FindBy(xpath = "(//*[@alt='Beyaz'])[6]")
    public WebElement NewClothingNineColorOne;

    @FindBy(xpath = "(//*[@class='bi bi-plus'])[9]")
    public WebElement NewClothingNine4Plus;

    @FindBy(xpath = "(//*[@class='bi bi-dash'])[9]")
    public WebElement NewClothingNine4Minus;

    @FindBy(xpath = "(//*[@class='d-none d-lg-inline-block'])[9]")
    public WebElement NewClothingNineAddToCart;

    @FindBy(xpath = "(//*[@class='bi  bi-heart  fs-5 icon-favorite'])[9]")
    public WebElement NewClothing9Fav;

    //------------UnderWecanLogoMobileAppsBanner--------//
    @FindBy(xpath = "(//*[@class='align-self-start ms-2'])[1]")
    public WebElement DowloadIphone;

    @FindBy(xpath = "(//*[@class='align-self-start ms-2'])[1]")
    public WebElement DowloadAndroid;

    @FindBy(xpath = "(//*[@class='align-self-start ms-2'])[1]")
    public WebElement DowloadHuawei;


    //----------Home-Body-Instagram-Posts-------//
    @FindBy(xpath = "(//*[@class='img-fluid'])[9]")
    public WebElement InstagramPost1;

    @FindBy(xpath = "(//*[@class='img-fluid'])[10]")
    public WebElement InstagramPost2;

    @FindBy(xpath = "(//*[@class='img-fluid'])[11]")
    public WebElement InstagramPost3;

    @FindBy(xpath = "(//*[@class='img-fluid'])[12]")
    public WebElement InstagramPost4;

    @FindBy(xpath = "(//*[@class='img-fluid'])[13]")
    public WebElement InstagramPost5;

    @FindBy(xpath = "(//*[@class='img-fluid'])[14]")
    public WebElement InstagramPost6;

    @FindBy(xpath = "(//*[@class='img-fluid'])[15]")
    public WebElement InstagramPost7;

    @FindBy(xpath = "(//*[@class='img-fluid'])[16]")
    public WebElement InstagramPost8;

    @FindBy(xpath = "(//*[@class='img-fluid'])[17]")
    public WebElement InstagramPost9;

    @FindBy(xpath = "(//*[@class='img-fluid'])[18]")
    public WebElement InstagramPost10;

    @FindBy(xpath = "(//*[@class='img-fluid'])[19]")
    public WebElement InstagramPost11;

    @FindBy(xpath = "(//*[@class='img-fluid'])[20]")
    public WebElement InstagramPost12;

    @FindBy(xpath = "//*[@class='mt-3 px-3 py-2']")
    public WebElement FollowWecanInstagram;




    //-------LOGIN-PAGE--------//


    @FindBy(xpath = "(//*[@class='form-control'])[2]")
    public WebElement EmailBox;

    @FindBy(xpath = "(//*[@class='form-control'])[3]")
    public WebElement PasswordBox;

    @FindBy(xpath = "//*[@class='btn btn-success btn-sm btnLogin']")
    public WebElement LoginButton;

    //-------BABY-GIRL|6-18-MONTH-PAGE--------//

    @FindBy(xpath = "//*[@class='text-center mt-2']")
    public WebElement BabyGirlMainText;

    //-------GIRL|2-13-AGE-PAGE--------//

    @FindBy(xpath = "//*[@class='text-center mt-2']")
    public WebElement Girl13YMainText;

    //------Home-Footer------//

    @FindBy(xpath = "(//*[@src='https://wecan.sercdn.com/files/wecanlogo.svg'])[2]")
    public WebElement  FooterWecanLogo;

    @FindBy(xpath = "(//*[@class='align-self-start ms-2'])[4]")
    public WebElement FooterDowloadForIphone;

    @FindBy(xpath = "(//*[@class='align-self-start ms-2'])[5]")
    public WebElement FooterDowloadForAndroid;

    @FindBy(xpath = "(//*[@class='align-self-start ms-2'])[6]")
    public WebElement FooterDowloadForHuawei;

    @FindBy(xpath = "(//*[@class='nav-link p-0 text-body-secondary'])[1]")
    public WebElement FooterAboutUs;

    @FindBy(xpath = "//*[@id='i76f']")
    public WebElement AboutUsPage;

    @FindBy(xpath = "(//*[@class='nav-link p-0 text-body-secondary'])[2]")
    public WebElement FooterSalesAgreement;

    @FindBy(xpath = "//*[@style='font-size: 24pt;']")
    public WebElement SalesAgreementPage;

    @FindBy(xpath = "(//*[@class='nav-link p-0 text-body-secondary'])[3]")
    public WebElement FooterLocalRights;

    @FindBy(xpath = "//*[text()='TÜKETİCİNİN KORUNMASI HAKKINDA KANUN']")
    public WebElement LocalRightsPage;

    @FindBy(xpath = "(//*[@class='nav-link p-0 text-body-secondary'])[4]")
    public WebElement FooterPrivacyAndCookies;

    @FindBy(xpath = "//*[text()='Gizlilik & Güvenlik']")
    public WebElement PrivacyAndCookiesPage;

    @FindBy(xpath = "(//*[@class='nav-link p-0 text-body-secondary'])[5]")
    public WebElement FooterReturnAndCP;

    @FindBy(xpath = "//*[text()='İptal / İade Koşulları']")
    public WebElement ReturnAndCPage;

    @FindBy(xpath = "(//*[@class='nav-link p-0 text-body-secondary'])[6]")
    public WebElement FooterContact;

    @FindBy(xpath = "(//*[@class='col-6 col-lg mb-3 order-4'])[1]")
    public WebElement ContactPage;

    @FindBy(xpath = "(//*[@class='nav-link p-0 text-body-secondary'])[7]")
    public WebElement FooterMyAccount;

    @FindBy(xpath = "//*[@class='col-12 py-2']")
    public WebElement MyAccountPage;

    @FindBy(xpath = "(//*[@class='nav-link p-0 text-body-secondary'])[8]")
    public WebElement FooterMyOrders;

    @FindBy(xpath = "//*[@class='col-12']")
    public WebElement OrdersPage;

    @FindBy(xpath = "(//*[@class='nav-link p-0 text-body-secondary'])[9]")
    public WebElement FooterQuickPayments;

    @FindBy(xpath = "(//*[@class='col-12 text-center'])[1]")
    public WebElement QuickPaymentsPage;

    @FindBy(xpath = "(//*[@class='nav-link p-0 text-body-secondary'])[10]")
    public WebElement FooterFacebook;

    @FindBy(xpath = "(//*[@class='nav-link p-0 text-body-secondary'])[11]")
    public WebElement FooterInstagram;

    @FindBy(xpath = "(//*[@class='nav-link p-0 text-body-secondary'])[12]")
    public WebElement FooterNumber;

    @FindBy(xpath = "(//*[@class='nav-link p-0 text-body-secondary'])[13]")
    public WebElement FooterWhatsapp;

    @FindBy(xpath = "(//*[@class='nav-link p-0 text-body-secondary'])[14]")
    public WebElement FooterEMail;

    @FindBy(xpath = "//*[text()='Kazım Karabekir, Özbirlik Sk No:4, 16270 Yıldırım/Bursa']")
    public WebElement FooterLocate;

    //---Register-Page---//

    @FindBy(xpath = "//*[@class='col-lg-6 col-md-6 col-sm-12 col-xs-12 text-center']")
    public WebElement RegisterPage;

    @FindBy(xpath = "//*[@id='firma']")
    public WebElement RegisterCompany;

    @FindBy(xpath = "//*[@id='yetkili']")
    public WebElement RegisterName;

    @FindBy(xpath = "//*[@id='mail']")
    public WebElement RegisterMail;

    @FindBy(xpath = "//*[@id='sifre']")
    public WebElement RegisterPassword;

    @FindBy(xpath = "//*[@id='e_phone_number']")
    public WebElement RegisterPhoneNumber;

    @FindBy(xpath = "//*[@id='e_phone_number']")
    public WebElement RegisterCountry; //213TR

    @FindBy(xpath = "//*[@id='sehir']")
    public WebElement RegisterCity; //6410-Adana

    @FindBy(xpath = "//*[@name='adres']")
    public WebElement RegisterAdress;

    @FindBy(xpath = "//*[@name='sartlar']")
    public WebElement RegisterTerms;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement RegisterSubmit;

    //---My-Account-Page---//

    @FindBy(xpath = "//*[@name='firma']")
    public WebElement YourCompany;

    @FindBy(xpath = "//*[@name='yetkili']")
    public WebElement YourName;

    @FindBy(xpath = "//*[@name='tckimlik']")
    public WebElement YourIDnumber;

    @FindBy(xpath = "//*[@name='mail']")
    public WebElement YourEMail;

    @FindBy(xpath = "//*[@name='adres']")
    public WebElement YourAdress;

    @FindBy(xpath = "//*[@name='sabittel']")
    public WebElement YourPhone;

    @FindBy(xpath = "//*[@name='gsm']")
    public WebElement YourPhone2;

    @FindBy(xpath = "//*[@name='fax']")
    public WebElement YourFax;

    @FindBy(xpath = "//*[@name='sifre']")
    public WebElement YourPassword;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement AccountUptade;


    //https://www.wecan.com.tr/Cart//

    @FindBy(xpath = "//*[@class='col text-end']")
    public WebElement CartPage;

    @FindBy(xpath = "(//*[@type='button'])[1]")
    public WebElement CartItemOneDecrease;

    @FindBy(xpath = "(//*[@type='button'])[2]")
    public WebElement CartItemOneIncrease;

    @FindBy(xpath = "(//*[@type='button'])[3]")
    public WebElement CartItemTwoDecrease;

    @FindBy(xpath = "(//*[@type='button'])[4]")
    public WebElement CartItemTwoIncrease;

    @FindBy(xpath = "(//*[@class='bi bi-trash'])[1]")
    public WebElement CartItemOneDelete;

    @FindBy(xpath = "(//*[@class='bi bi-trash'])[1]")
    public WebElement CartItemTwoDelete;

    @FindBy(xpath = "//*[@id='btnEmptyCartUser']")
    public WebElement CartClearCart;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-block']")
    public WebElement CartInvoiceAndDelivery;





}
