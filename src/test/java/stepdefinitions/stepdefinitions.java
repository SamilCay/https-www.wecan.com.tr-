package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class stepdefinitions extends BasePage{


    //------US_001--------//
    @Given("User goes to URL")
    public void user_goes_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Given("User confirms successful login to the site")
    public void user_confirms_successful_login_to_the_site() {

        Assert.assertTrue(WecanLogosu.isDisplayed());}

    @Given("The users close the page.")
    public void the_users_close_the_page() {
        Driver.closeDriver();}


      //------US_002--------//

    @Given("User confirms Help, Login, Register, Russian, English, Turkish and Search buttons visible and active")
    public void user_confirms_help_login_register_russian_english_turkish_and_search_buttons_visible_and_active() {

        Assert.assertTrue(HeaderTurkishButton.isDisplayed()&&HeaderTurkishButton.isEnabled());
        Assert.assertTrue(HeaderEnglishButton.isDisplayed()&&HeaderEnglishButton.isEnabled());
        Assert.assertTrue(HeaderRussianButton.isDisplayed()&&HeaderRussianButton.isEnabled());
        Assert.assertTrue(HeaderSupportButton.isDisplayed()&&HeaderSupportButton.isEnabled());
        Assert.assertTrue(HeaderSignInButton.isDisplayed()&&HeaderSignInButton.isEnabled());
        Assert.assertTrue(HeaderSignUpButton.isDisplayed()&&HeaderSignUpButton.isEnabled());
    }

    @Given("User clicks on the language options and confirms that the languages have changed")
    public void user_clicks_on_the_language_options_and_confirms_that_the_languages_have_changed() {
        HeaderEnglishButton.click();
        EnglishChange.isDisplayed();
        ReusableMethods.wait(2);
        HeaderTurkishButton.click();
        TurkishChange.isDisplayed();
        ReusableMethods.wait(2);
        HeaderRussianButton.click();
        RussianChange.isDisplayed();
        ReusableMethods.wait(1);
        HeaderTurkishButton.click();
    }

    @Given("User click the help button and is redirected")
    public void user_click_the_help_button_and_is_redirected() {


    }

    @Given("The user clicks the Login and Register buttons and is redirected")
    public void the_user_clicks_the_login_and_register_buttons_and_is_redirected() {
        HeaderSignInButton.click();
        SignInPage.isDisplayed();
        HeaderSignUpButton.click();
        SignUpPage.isDisplayed();
        Driver.closeDriver();
    }

    //------US_003--SC_01------//

    @Given("User enters registration information by clicking Login")
    public void user_enters_registration_information_by_clicking_login() {
        HeaderSignInButton.click();
        EmailBox.sendKeys("samilcay@windowslive.com");
        PasswordBox.sendKeys("Solider123");
        ReusableMethods.wait(2);
        LoginButton.click();
        ReusableMethods.wait(2);


    }

    @Given("User types the desired model in the Search box and gets results")
    public void user_types_the_desired_model_in_the_search_box_and_gets_results() {

        ReusableMethods.wait(4);
        SearchBox.sendKeys("püsküllü"+ Keys.ENTER);

    }

    @Given("User confirms that they have been redirected to the results")
    public void user_confirms_that_they_have_been_redirected_to_the_results() {
        Assert.assertTrue(SearchBoxPuskullu.isDisplayed());
    }

    //------US_003--SC_02------//


    @Given("User clicks on the Discover Now buttons under Baby Toddler and Kids and confirms that it works and redirects to the correct page")
    public void user_clicks_on_the_discover_now_buttons_under_baby_toddler_and_kids_and_confirms_that_it_works_and_redirects_to_the_correct_page() {

        BabyDiscoverNowButton.click();
        Assert.assertTrue(BabyGirlMainText.isDisplayed());
        Driver.getDriver().navigate().back();
        ToddlerDiscoverNowButton.click();
        Assert.assertTrue(Girl13YMainText.isDisplayed());
        Driver.getDriver().navigate().back();
        KidsDiscoverNowButton.click();
        Assert.assertTrue(Girl13YMainText.isDisplayed());
        Driver.getDriver().navigate().back();
    }

    @Given("user verifies that the Register Free, Get Shipping Info and Return Request buttons work and visible")
    public void user_verifies_that_the_register_free_get_shipping_ınfo_and_return_request_buttons_work_and_visible() {

        Assert.assertTrue(RegisterFreeButton.isDisplayed()&&RegisterFreeButton.isEnabled());
        Assert.assertTrue(GetShippingInfoButton.isDisplayed()&&GetShippingInfoButton.isEnabled());
        Assert.assertTrue(ReturnRequestButton.isDisplayed()&&ReturnRequestButton.isEnabled());

    }

    @Given("User verifies that images under baby {int}-{int} months appear and work")
    public void user_verifies_that_images_under_baby_months_appear_and_work(Integer int1, Integer int2) {
        Assert.assertTrue(Baby624ViewAll.isDisplayed()&&Baby624ViewAll.isEnabled());
        Assert.assertTrue(HomeBabyDress.isDisplayed()&&HomeBabyDress.isEnabled());
        Assert.assertTrue(HomeBabyEvenings.isDisplayed()&&HomeBabyEvenings.isEnabled());
        Assert.assertTrue(HomeBabySets.isDisplayed()&&HomeBabySets.isEnabled());

    }

    @Given("User verifies that images under toddler-girls {int}-{int} years appear and work")
    public void user_verifies_that_images_under_toddler_girls_years_appear_and_work(Integer int1, Integer int2) {
        Assert.assertTrue(HomeToddlerEvenings.isDisplayed()&&HomeToddlerEvenings.isEnabled());
        Assert.assertTrue(HomeToddlerDress.isDisplayed()&&HomeToddlerDress.isEnabled());
        Assert.assertTrue(HomeToddlerSets.isDisplayed()&&HomeToddlerSets.isEnabled());
        Assert.assertTrue(HomeToddlerViewAll.isDisplayed()&&HomeToddlerViewAll.isEnabled());

    }

    @Given("User verifies that images under New Clothings  appear and work")
    public void user_verifies_that_images_under_new_clothings_appear_and_work() {

        Assert.assertTrue(HomeMoreAboutWecan.isDisplayed()&&HomeMoreAboutWecan.isEnabled());
        ReusableMethods.wait(2);
        //All image should be visible and must redirect
        Assert.assertTrue(NewClothingOne.isDisplayed()&&NewClothingOne.isEnabled());
        Assert.assertTrue(NewClothingTwo.isDisplayed()&&NewClothingTwo.isEnabled());
        Assert.assertTrue(NewClothingThree.isDisplayed()&&NewClothingThree.isEnabled());
        Assert.assertTrue(NewClothingFour.isDisplayed()&&NewClothingFour.isEnabled());
        Assert.assertTrue(NewClothingFive.isDisplayed()&&NewClothingFive.isEnabled());
        Assert.assertTrue(NewClothingSix.isDisplayed()&&NewClothingSix.isEnabled());
        Assert.assertTrue(NewClothingSeven.isDisplayed()&&NewClothingSeven.isEnabled());
        Assert.assertTrue(NewClothingEight.isDisplayed()&&NewClothingEight.isEnabled());
        Assert.assertTrue(NewClothingNine.isDisplayed()&&NewClothingNine.isEnabled());


    }

    @Given("User confirms that the color options of the products under New Clothes can be changed, added to the cart and the quantity can be increased")
    public void user_confirms_that_the_color_options_of_the_products_under_new_clothes_can_be_changed_added_to_the_cart_and_the_quantity_can_be_increased() {
        ReusableMethods.wait(2);
        //New-Clothing-1-Options//

        Assert.assertTrue(NewClothingOneColorOne.isDisplayed()&&NewClothingOneColorOne.isEnabled());
        Assert.assertTrue(NewClothingOneColorTwo.isDisplayed()&&NewClothingOneColorTwo.isEnabled());
        Assert.assertTrue(NewClothingOneColorThree.isDisplayed()&&NewClothingOneColorThree.isEnabled());
        Assert.assertTrue(NewClothingOneColorFour.isDisplayed()&&NewClothingOneColorFour.isEnabled());
        Assert.assertTrue(NewClothingOne4Plus.isDisplayed()&&NewClothingOne4Plus.isEnabled());
        Assert.assertTrue(NewClothingOne4Minus.isDisplayed()&&NewClothingOne4Minus.isEnabled());
        Assert.assertTrue(NewClothingOneAddToCart.isDisplayed()&&NewClothingOneAddToCart.isEnabled());
        ReusableMethods.wait(2);
        //New-Clothing-2-Options//

        Assert.assertTrue(NewClothingTwoColorOne.isDisplayed()&&NewClothingTwoColorOne.isEnabled());
        Assert.assertTrue(NewClothingTwoColorTwo.isDisplayed()&&NewClothingOneColorTwo.isEnabled());
        Assert.assertTrue(NewClothingTwoColorThree.isDisplayed()&&NewClothingTwoColorThree.isEnabled());
        Assert.assertTrue(NewClothingTwo4Plus.isDisplayed()&&NewClothingTwo4Plus.isEnabled());
        Assert.assertTrue(NewClothingTwo4Minus.isDisplayed()&&NewClothingTwo4Minus.isEnabled());
        Assert.assertTrue(NewClothingTwoAddToCart.isDisplayed()&&NewClothingTwoAddToCart.isEnabled());
        ReusableMethods.wait(2);
        //New-Clothing-3-Options//
        Assert.assertTrue(NewClothingThreeColorOne.isDisplayed()&&NewClothingThreeColorOne.isEnabled());
        Assert.assertTrue(NewClothingThreeColorTwo.isDisplayed()&&NewClothingThreeColorTwo.isEnabled());
        Assert.assertTrue(NewClothingThreeColorThree.isDisplayed()&&NewClothingThreeColorThree.isEnabled());
        Assert.assertTrue(NewClothingThreeColorFour.isDisplayed()&&NewClothingThreeColorFour.isEnabled());
        Assert.assertTrue(NewClothingThree4Plus.isDisplayed()&&NewClothingThree4Plus.isEnabled());
        Assert.assertTrue(NewClothingThree4Minus.isDisplayed()&&NewClothingThree4Minus.isEnabled());
        Assert.assertTrue(NewClothingThreeAddToCart.isDisplayed()&&NewClothingThreeAddToCart.isEnabled());
        ReusableMethods.wait(2);
        //New-Clothing-4-Options//
        Assert.assertTrue(NewClothingFourColorOne.isDisplayed()&&NewClothingFourColorOne.isEnabled());
        Assert.assertTrue(NewClothingFourColorTwo.isDisplayed()&&NewClothingFourColorTwo.isEnabled());
        Assert.assertTrue(NewClothingFourColorThree.isDisplayed()&&NewClothingFourColorThree.isEnabled());
        Assert.assertTrue(NewClothingFourColorFour.isDisplayed()&&NewClothingFourColorFour.isEnabled());
        Assert.assertTrue(NewClothingFourColorFive.isDisplayed()&&NewClothingFourColorFive.isEnabled());
        Assert.assertTrue(NewClothingFour4Plus.isDisplayed()&&NewClothingFour4Plus.isEnabled());
        Assert.assertTrue(NewClothingFour4Minus.isDisplayed()&&NewClothingFour4Minus.isEnabled());
        Assert.assertTrue(NewClothingFourAddToCart.isDisplayed()&&NewClothingFourAddToCart.isEnabled());
        ReusableMethods.wait(2);
        //New-Clothing-5-Options//
        Assert.assertTrue(NewClothingFiveColorOne.isDisplayed()&&NewClothingFiveColorOne.isEnabled());
        Assert.assertTrue(NewClothingFiveColorTwo.isDisplayed()&&NewClothingFiveColorTwo.isEnabled());
        Assert.assertTrue(NewClothingFive4Plus.isDisplayed()&&NewClothingFive4Plus.isEnabled());
        Assert.assertTrue(NewClothingFive4Minus.isDisplayed()&&NewClothingFive4Minus.isEnabled());
        Assert.assertTrue(NewClothingFiveAddToCart.isDisplayed()&&NewClothingFiveAddToCart.isEnabled());
        ReusableMethods.wait(2);
        //New-Clothing-6-Options//
        Assert.assertTrue(NewClothingSixColorOne.isDisplayed()&&NewClothingSixColorOne.isEnabled());
        Assert.assertTrue(NewClothingSixColorTwo.isDisplayed()&&NewClothingSixColorTwo.isEnabled());
        Assert.assertTrue(NewClothingSix4Plus.isDisplayed()&&NewClothingSix4Plus.isEnabled());
        Assert.assertTrue(NewClothingSix4Minus.isDisplayed()&&NewClothingSix4Minus.isEnabled());
        Assert.assertTrue(NewClothingSixAddToCart.isDisplayed()&&NewClothingSixAddToCart.isEnabled());
        ReusableMethods.wait(2);
        //New-Clothing-7-Options//
        Assert.assertTrue(NewClothingSevenColorOne.isDisplayed()&&NewClothingSevenColorOne.isEnabled());
        Assert.assertTrue(NewClothingSevenColorTwo.isDisplayed()&&NewClothingSevenColorTwo.isEnabled());
        Assert.assertTrue(NewClothingSevenColorThree.isDisplayed()&&NewClothingSevenColorThree.isEnabled());
        Assert.assertTrue(NewClothingSevenColorFour.isDisplayed()&&NewClothingSevenColorFour.isEnabled());
        Assert.assertTrue(NewClothingSeven4Plus.isDisplayed()&&NewClothingSeven4Plus.isEnabled());
        Assert.assertTrue(NewClothingSeven4Minus.isDisplayed()&&NewClothingSeven4Minus.isEnabled());
        Assert.assertTrue(NewClothingSevenAddToCart.isDisplayed()&&NewClothingSevenAddToCart.isEnabled());
        ReusableMethods.wait(2);
        //New-Clothing-8-Options//
        Assert.assertTrue(NewClothingEightColorOne.isDisplayed()&&NewClothingEightColorOne.isEnabled());
        Assert.assertTrue(NewClothingEightColorTwo.isDisplayed()&&NewClothingEightColorTwo.isEnabled());
        Assert.assertTrue(NewClothingEightColorThree.isDisplayed()&&NewClothingEightColorThree.isEnabled());
        Assert.assertTrue(NewClothingEight4Plus.isDisplayed()&&NewClothingEight4Plus.isEnabled());
        Assert.assertTrue(NewClothingEight4Minus.isDisplayed()&&NewClothingEight4Minus.isEnabled());
        Assert.assertTrue(NewClothingEightAddToCart.isDisplayed()&&NewClothingEightAddToCart.isEnabled());
        ReusableMethods.wait(2);
        //New-Clothing-9-Options//
        Assert.assertTrue(NewClothingNineColorOne.isDisplayed()&&NewClothingNineColorOne.isEnabled());
        Assert.assertTrue(NewClothingNine4Plus.isDisplayed()&&NewClothingNine4Plus.isEnabled());
        Assert.assertTrue(NewClothingNine4Minus.isDisplayed()&&NewClothingNine4Minus.isEnabled());
        Assert.assertTrue(NewClothingNineAddToCart.isDisplayed()&&NewClothingNineAddToCart.isEnabled());

    }

    @Given("User can check that the mobile application buttons below the Wecan logo are visible and operational")
    public void user_can_check_that_the_mobile_application_buttons_below_the_wecan_logo_are_visible_and_operational() {

        Assert.assertTrue(DowloadIphone.isDisplayed()&&DowloadIphone.isEnabled());
        Assert.assertTrue(DowloadAndroid.isDisplayed()&&DowloadAndroid.isEnabled());
        Assert.assertTrue(DowloadHuawei.isDisplayed()&&DowloadHuawei.isEnabled());
    }

    @Given("User verifies that Instagram posts appear and redirect to Wecan Instagram account")
    public void user_verifies_that_ınstagram_posts_appear_and_redirect_to_wecan_ınstagram_account() {

        //Home-Page-All-Instagram-Posts//
        Assert.assertTrue(InstagramPost1.isDisplayed()&&InstagramPost1.isEnabled());
        Assert.assertTrue(InstagramPost2.isDisplayed()&&InstagramPost2.isEnabled());
        Assert.assertTrue(InstagramPost3.isDisplayed()&&InstagramPost3.isEnabled());
        Assert.assertTrue(InstagramPost4.isDisplayed()&&InstagramPost4.isEnabled());
        Assert.assertTrue(InstagramPost5.isDisplayed()&&InstagramPost5.isEnabled());
        Assert.assertTrue(InstagramPost6.isDisplayed()&&InstagramPost6.isEnabled());
        Assert.assertTrue(InstagramPost7.isDisplayed()&&InstagramPost7.isEnabled());
        Assert.assertTrue(InstagramPost8.isDisplayed()&&InstagramPost8.isEnabled());
        Assert.assertTrue(InstagramPost9.isDisplayed()&&InstagramPost9.isEnabled());
        Assert.assertTrue(InstagramPost10.isDisplayed()&&InstagramPost10.isEnabled());
        Assert.assertTrue(InstagramPost11.isDisplayed()&&InstagramPost11.isEnabled());
        Assert.assertTrue(InstagramPost12.isDisplayed()&&InstagramPost12.isEnabled());
    }

    @Given("User verifies Follow Wecan button is visible and working")
    public void user_verifies_follow_wecan_button_is_visible_and_working() {
        Assert.assertTrue(FollowWecanInstagram.isDisplayed()&&FollowWecanInstagram.isEnabled());

    }

                             //------US_004-------//

    @Given("User verifies that the items in the Footer section are working and visible")
    public void user_verifies_that_the_items_in_the_footer_section_are_working_and_visible() {

        ReusableMethods.clickWithJS(FooterWecanLogo);
        Assert.assertTrue(HeaderSupportButton.isDisplayed());

        Assert.assertTrue(FooterDowloadForAndroid.isDisplayed());
        Assert.assertTrue(FooterDowloadForIphone.isDisplayed());
        Assert.assertTrue(FooterDowloadForHuawei.isDisplayed());
        ReusableMethods.wait(1);

        //---Corporate---//
        ReusableMethods.clickWithJS(FooterAboutUs);
        Assert.assertTrue(AboutUsPage.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        ReusableMethods.clickWithJS(FooterSalesAgreement);
        Assert.assertTrue(SalesAgreementPage.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        ReusableMethods.clickWithJS(FooterLocalRights);
        Assert.assertTrue(LocalRightsPage.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        ReusableMethods.clickWithJS(FooterPrivacyAndCookies);
        Assert.assertTrue(PrivacyAndCookiesPage.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        ReusableMethods.clickWithJS(FooterReturnAndCP);
        Assert.assertTrue(ReturnAndCPage.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        ReusableMethods.clickWithJS(FooterContact);
        Assert.assertTrue(ContactPage.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        //---Costomer-Service---//

        ReusableMethods.clickWithJS(FooterMyAccount);
        Assert.assertTrue(MyAccountPage.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        ReusableMethods.clickWithJS(FooterMyOrders);
        Assert.assertTrue(MyOrdersPage.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        ReusableMethods.clickWithJS(FooterQuickPayments);
        Assert.assertTrue(QuickPaymentsPage.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        //---Follow-Us---//

        Assert.assertTrue(FooterFacebook.isDisplayed()&& FooterFacebook.isEnabled());
        Assert.assertTrue(FooterInstagram.isDisplayed()&& FooterInstagram.isEnabled());

        //---Contact-Us---//

        Assert.assertTrue(FooterLocate.isDisplayed());

        Assert.assertTrue(FooterNumber.isDisplayed()&& FooterNumber.isEnabled());
        Assert.assertTrue(FooterWhatsapp.isDisplayed()&& FooterWhatsapp.isEnabled());
        Assert.assertTrue(FooterEMail.isDisplayed()&& FooterEMail.isEnabled());

    }

    //------US_005--SC_01-----//

    @Given("User clicks sign up")
    public void user_clicks_sign_up() {
        HeaderSignUpButton.click();
    }
    @Given("User verifies register page show up")
    public void user_verifies_register_page_show_up() {
        Assert.assertTrue(SignInPage.isDisplayed());
    }

    //------US_005--SC_02-----//

    @Given("User fills in the registration information and click register")
    public void user_fills_in_the_registration_information_and_click_register() {
        RegisterCompany.sendKeys("AnyCompany"+Keys.ENTER);
        RegisterName.sendKeys("AnyComp"+Keys.ENTER);
        RegisterMail.sendKeys("qweqwe@gmail.com"+Keys.ENTER);
        RegisterPassword.sendKeys("12312"+Keys.ENTER);
        RegisterPhoneNumber.sendKeys("5462772727"+Keys.ENTER);

        RegisterCountry.sendKeys("Türkiye"+Keys.ENTER);
        RegisterCity.sendKeys("Türkiye"+Keys.ENTER);




        RegisterAdress.sendKeys("Kazım Karabekir, Özbirlik Sk No:4, 16270 Yıldırım/Bursa"+Keys.ENTER);

        RegisterTerms.click();

        Assert.assertTrue(RegisterSubmit.isDisplayed()&& RegisterSubmit.isEnabled());
    }


    //------US_006--SC_01-----//
    @Given("User verifies successfully login")
    public void user_verifies_successfully_login() {
        Assert.assertTrue(MyAccId.isDisplayed());
    }

    //------US_006--SC_02-----//
    @Given("User click Account")
    public void user_click_account() {
        MyAccId.click();
        ReusableMethods.waitForClickablility(MyAccount,2).click();
    }

    @Given("Changes the user information and presses the Update button")
    public void changes_the_user_information_and_presses_the_update_button() {
        YourCompany.clear();
        YourCompany.sendKeys("AnyCompany"+Keys.ENTER);

        YourName.clear();
        YourName.sendKeys("Şamil Çay"+Keys.ENTER);

        YourIDnumber.clear();
        YourIDnumber.sendKeys("23983342486"+Keys.ENTER);

        YourEMail.clear();
        YourEMail.sendKeys("samilcay@windowslive.com"+Keys.ENTER);

        YourAdress.clear();
        YourAdress.sendKeys("blalbalbablabla"+Keys.ENTER);

        YourPhone.clear();
        YourPhone.sendKeys("5462772727"+Keys.ENTER);

        YourPhone2.clear();
        YourPhone2.sendKeys("5462772727"+Keys.ENTER);

        YourFax.clear();
        YourFax.sendKeys("5462772727"+Keys.ENTER);

        Assert.assertTrue(YourPassword.isDisplayed()&&YourPassword.isEnabled());
        ReusableMethods.wait(2);
        Assert.assertTrue(AccountUptade.isDisplayed()&&AccountUptade.isEnabled());




    }



    //------US_006--SC_03-----//
    @Given("User clicks the Orders button under the username")
    public void user_clicks_the_orders_button_under_the_username() {
        MyAccId.click();
        ReusableMethods.waitForClickablility(MyOrders,2).click();


    }

    @Given("User verifies redirect the orders page")
    public void user_verifies_redirect_the_orders_page() {
        Assert.assertTrue(OrdersPage.isDisplayed());
    }

    //------US_006--SC_04-----//
    @Given("User clicks  Secure Logout and verifies successfully log out")
    public void user_clicks_secure_logout_and_verifies_successfully_log_out() {
        MyAccId.click();
        ReusableMethods.waitForClickablility(SafeExit,2).click();
        Assert.assertTrue(HeaderSignInButton.isDisplayed());
    }

    //------US_007--SC_01-----//
    @Given("User clicks Cart button")
    public void user_clicks_cart_button() {
        HeaderCartButton.click();
    }

    @Given("User verifies redirect to Cart Page")
    public void user_verifies_redirect_to_cart_page() {
        Assert.assertTrue(CartPage.isDisplayed());
    }

    //------US_007--SC_02-----//
    @Given("User adds items to Cart")
    public void user_adds_items_to_cart() {

        ReusableMethods.clickWithJS(NewClothingOne4Plus);
        ReusableMethods.clickWithJS(NewClothingOneAddToCart);
        ReusableMethods.clickWithJS(NewClothingTwo4Plus);
        ReusableMethods.clickWithJS(NewClothingTwoAddToCart);
    }


    @Given("User after go to the Cart page verifies can decrease , increase or delete items in cart")
    public void user_after_go_to_the_cart_page_verifies_can_decrease_increase_or_delete_items_in_cart() {

        HeaderCartButton.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(CartItemOneDecrease.isDisplayed()&&CartItemOneDecrease.isEnabled());
        Assert.assertTrue(CartItemOneDecrease.isDisplayed()&&CartItemOneDecrease.isEnabled());
        Assert.assertTrue(CartItemTwoDecrease.isDisplayed()&&CartItemTwoDecrease.isEnabled());
        Assert.assertTrue(CartItemTwoIncrease.isDisplayed()&&CartItemTwoIncrease.isEnabled());
        Assert.assertTrue(CartItemTwoDelete.isDisplayed()&&CartItemTwoDelete.isEnabled());
        Assert.assertTrue(CartItemOneDelete.isDisplayed()&&CartItemOneDelete.isEnabled());
        Assert.assertTrue(CartClearCart.isDisplayed()&&CartClearCart.isEnabled());
        Assert.assertTrue(CartInvoiceAndDelivery.isDisplayed()&&CartInvoiceAndDelivery.isEnabled());

    }



}
