package pagelocators;

import org.openqa.selenium.By;

public class PaymentLocator {
    public static By name_on_card_text_field_locator=By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button");
    public static By card_number_text_field_locator=By.xpath("//a[@href='/products']");
    public static By cvc_text_field_locator=By.xpath("(//a[contains(text(),'View Product')])[1]");
    public static By month_expiration_text_field_locator=By.xpath("//u[normalize-space()='View Cart']");
    public static By year_expiration_text_field_locator=By.xpath("//a[normalize-space()='Proceed To Checkout']");
    public static By pay_and_confirm_order_button_locator=By.xpath("//button[@id='submit']");

}
