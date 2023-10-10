package testcases;
import envsetups.BaseEnv;
import listeners.Retry;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagelocators.ContactUsLocator;
import pagelocators.PaymentLocator;
import pagelocators.ProductLocator;
import pagelocators.RegisterLocator;
import testdata.data;
import utils.ElementActions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class TestScript extends BaseEnv {
    @Test(retryAnalyzer = Retry.class)
    public void Test_Case_1() throws InterruptedException {
        driver.get("https://automationexercise.com/");
        String expectedText="AutomationExercise";
        String actualText=ElementActions.getText(RegisterLocator.header_text_title_locator);
        Assert.assertEquals(actualText,expectedText);
        ElementActions.clickElement(RegisterLocator.sign_up_login_button_locator);
        Assert.assertTrue(ElementActions.elementVisibilty(RegisterLocator.new_user_signup_text_locator));
        ElementActions.doEnterValue(RegisterLocator.signup_name_text_field_locator,"sumon");
        ElementActions.doEnterValue(RegisterLocator.signup_email_text_field_locator, data.dynamic_email_value());
        ElementActions.clickElement(RegisterLocator.sign_up_button_locator);
        ElementActions.clickElement(RegisterLocator.mr_checkbox_locator);
        ElementActions.doEnterValue(RegisterLocator.password_text_box_locator,"1234");
        ElementActions.clickElement(RegisterLocator.newsletter_check_box_locator);
        ElementActions.clickElement(RegisterLocator.special_offer_checkbox_locator);
        ElementActions.doDropdownValue(RegisterLocator.days_dropdown_locator,"12");
        ElementActions.doDropdownValue(RegisterLocator.months_dropdown_locator,"6");
        ElementActions.doDropdownValue(RegisterLocator.years_dropdown_locator,"2019");
        ElementActions.doEnterValue(RegisterLocator.first_name_field_locator,"sumon");
        ElementActions.doEnterValue(RegisterLocator.last_name_field_locator,"ahmed");
        ElementActions.doEnterValue(RegisterLocator.address1_locator,"Zaman House");
        ElementActions.doEnterValue(RegisterLocator.state_locator,"Dhaka");
        ElementActions.doEnterValue(RegisterLocator.city_locator,"Khilkhet");
        ElementActions.doEnterValue(RegisterLocator.zipcode_locator,"1229");
        ElementActions.doEnterValue(RegisterLocator.mobile_number_locator,"01723456721");
        ElementActions.clickElement(RegisterLocator.create_account_button_locator);
        ElementActions.clickElement(RegisterLocator.continue_button_locator);
        ElementActions.clickElement(RegisterLocator.delete_account_button_locator);
        ElementActions.clickElement(RegisterLocator.continue_button_locator);
        Thread.sleep(2000);
    }
    @Test(retryAnalyzer = Retry.class)
    public void Test_Case_2_and_4() throws InterruptedException {
        driver.get("https://automationexercise.com/");
        ElementActions.clickElement(RegisterLocator.sign_up_login_button_locator);
        ElementActions.doEnterValue(RegisterLocator.login_email_text_field_locator,"tania@gmail.com");
        ElementActions.doEnterValue(RegisterLocator.login_password_text_field_locator,"@tania12");
        ElementActions.clickElement(RegisterLocator.login_button_locator);
        ElementActions.clickElement(RegisterLocator.logout_button_locator);
        Thread.sleep(2000);
    }
    @Test(retryAnalyzer = Retry.class)
    public void Test_Case_3() throws InterruptedException {
        driver.get("https://automationexercise.com/");
        ElementActions.clickElement(RegisterLocator.sign_up_login_button_locator);
        ElementActions.doEnterValue(RegisterLocator.login_email_text_field_locator,"sumon@gmail.com");
        ElementActions.doEnterValue(RegisterLocator.login_password_text_field_locator,"@11");
        ElementActions.clickElement(RegisterLocator.login_button_locator);
        Assert.assertEquals("Your email or password is incorrect!",ElementActions.getText(RegisterLocator.error_msg_for_login_locator));
        Thread.sleep(2000);
    }
    @Test(retryAnalyzer = Retry.class)
    public void Test_Case_5() throws InterruptedException {
        driver.get("https://automationexercise.com/");
        ElementActions.clickElement(RegisterLocator.sign_up_login_button_locator);
        ElementActions.doEnterValue(RegisterLocator.signup_name_text_field_locator,"tania");
        ElementActions.doEnterValue(RegisterLocator.signup_email_text_field_locator,"tania@gmail.com");
        ElementActions.clickElement(RegisterLocator.sign_up_button_locator);
        Assert.assertEquals("Email Address already exist!",ElementActions.getText(RegisterLocator.email_duplicate_msg_locator));
        Thread.sleep(2000);
    }
    @Test(retryAnalyzer = Retry.class)
    public void Test_Case_6() throws InterruptedException, AWTException {
        driver.get("https://automationexercise.com/");
        ElementActions.clickElement(ContactUsLocator.contact_us_locator);
        ElementActions.doEnterValue(ContactUsLocator.name_text_field_locator,"ta");
        ElementActions.doEnterValue(ContactUsLocator.email_text_field_locator,"ta@gmail.com");
        ElementActions.doEnterValue(ContactUsLocator.subject_text_field_locator,"physic23");
        ElementActions.doEnterValue(ContactUsLocator.message_text_field_locator,"here is ");
        Thread.sleep(2000);
        ElementActions.elementScroll(ContactUsLocator.choose_file_locator);
        Thread.sleep(2000);
        ElementActions.clickElement(ContactUsLocator.choose_file_locator);
        StringSelection file = new StringSelection("C:\\Users\\BS1169\\Pictures\\Screenshots\\iOS.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(1000);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyRelease(KeyEvent.VK_ENTER);
        ElementActions.clickElement(ContactUsLocator.submit_button_locator);
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
    }
    @Test(retryAnalyzer = Retry.class)
    public void Test_Case_7_and_8_Full_Coverage() throws InterruptedException {
        driver.get("https://automationexercise.com/");
        ElementActions.clickElement(ProductLocator.products_link_locator);
        ElementActions.elementScroll(ProductLocator.view_product_locator);
        ElementActions.clickElement(ProductLocator.view_product_locator);
        ElementActions.clickElement(ProductLocator.add_to_cart_button_locator);
        Thread.sleep(1000);
        ElementActions.clickElement(ProductLocator.view_cart_button_locator);
        Thread.sleep(1000);
        ElementActions.clickElement(ProductLocator.proceed_to_checkout_button_locator);
        ElementActions.clickElement(ProductLocator.register_login_button_locator);
        ElementActions.doEnterValue(RegisterLocator.login_email_text_field_locator,"tania@gmail.com");
        ElementActions.doEnterValue(RegisterLocator.login_password_text_field_locator,"@tania12");
        ElementActions.clickElement(RegisterLocator.login_button_locator);
        ElementActions.clickElement(ProductLocator.cart_link_locator);
        ElementActions.clickElement(ProductLocator.proceed_to_checkout_button_locator);
        ElementActions.elementScroll(ProductLocator.place_order_button_locator);
        ElementActions.clickElement(ProductLocator.place_order_button_locator);
        ElementActions.doEnterValue(PaymentLocator.name_on_card_text_field_locator,"sumon");
        ElementActions.doEnterValue(PaymentLocator.card_number_text_field_locator,"4485233521979909");
        ElementActions.doEnterValue(PaymentLocator.cvc_text_field_locator,"748");
        ElementActions.doEnterValue(PaymentLocator.month_expiration_text_field_locator,"9");
        ElementActions.doEnterValue(PaymentLocator.year_expiration_text_field_locator,"2025");
        ElementActions.clickElement(PaymentLocator.pay_and_confirm_order_button_locator);
        Thread.sleep(8000);
    }


}

