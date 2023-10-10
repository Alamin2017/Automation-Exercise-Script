package pagelocators;

import org.openqa.selenium.By;

public class ProductLocator {

    public static By add_to_cart_button_locator=By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button");
    public static By products_link_locator=By.xpath("//a[@href='/products']");
    public static By view_product_locator=By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div[1]/div[2]/ul/li/a");
    public static By view_cart_button_locator=By.xpath("//u[normalize-space()='View Cart']");
    public static By proceed_to_checkout_button_locator=By.xpath("//a[normalize-space()='Proceed To Checkout']");
    public static By register_login_button_locator=By.xpath("//u[normalize-space()='Register / Login']");
    public static By cart_link_locator=By.xpath("//a[normalize-space()='Cart']");
    public static By place_order_button_locator=By.xpath("//a[normalize-space()='Place Order']");

}