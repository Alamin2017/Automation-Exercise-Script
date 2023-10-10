package pagelocators;

import org.openqa.selenium.By;

public class ContactUsLocator {
    public static By contact_us_locator=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a");
    public static By name_text_field_locator=By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input");
    public static By email_text_field_locator=By.xpath("//*[@id=\"contact-us-form\"]/div[2]/input");
    public static By subject_text_field_locator=By.xpath("//*[@id=\"contact-us-form\"]/div[3]/input");
    public static By message_text_field_locator=By.xpath("//*[@id=\"message\"]");
    public static By choose_file_locator=By.xpath("//*[@id=\"contact-us-form\"]/div[5]");
    public static By submit_button_locator=By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input");
}
