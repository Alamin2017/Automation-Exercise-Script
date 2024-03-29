package pagelocators;
import org.openqa.selenium.By;
public class RegisterLocator {
    public static By header_text_title_locator=By.xpath("//*[@id=\"slider-carousel\"]/div/div[1]/div[1]/h1");
    public static By sign_up_login_button_locator=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
    public static By login_email_text_field_locator=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
    public static By login_password_text_field_locator=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
    public static By login_button_locator=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
    public static By logout_button_locator=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
    public static By error_msg_for_login_locator=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p");
    public static By email_duplicate_msg_locator=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p");
    public static By new_user_signup_text_locator=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2");
    public static By signup_name_text_field_locator=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
    public static By signup_email_text_field_locator=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
    public static By sign_up_button_locator=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
    public static By mr_checkbox_locator=By.xpath("//*[@id=\"id_gender1\"]");
    public static By password_text_box_locator=By.xpath("//*[@id=\"password\"]");
    public static By newsletter_check_box_locator=By.xpath("//*[@id=\"newsletter\"]");
    public static By special_offer_checkbox_locator=By.xpath("//*[@id=\"optin\"]");
    public static By days_dropdown_locator=By.xpath("//*[@id=\"days\"]");
    public static By months_dropdown_locator=By.xpath("//*[@id=\"months\"]");
    public static By years_dropdown_locator=By.xpath("//*[@id=\"years\"]");
    public static By first_name_field_locator=By.xpath("//*[@id=\"first_name\"]");
    public static By last_name_field_locator=By.xpath("//*[@id=\"last_name\"]");
    public static By address1_locator=By.xpath("//*[@id=\"address1\"]");
    public static By state_locator=By.xpath("//*[@id=\"state\"]");
    public static By city_locator=By.xpath("//*[@id=\"city\"]");
    public static By zipcode_locator=By.xpath("//*[@id=\"zipcode\"]");
    public static By mobile_number_locator=By.xpath("//*[@id=\"mobile_number\"]");
    public static By create_account_button_locator=By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");
    public static By continue_button_locator=By.xpath("//*[@id=\"form\"]/div/div/div/div/a");
    public static By delete_account_button_locator=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a/i");
}
