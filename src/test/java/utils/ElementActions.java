package utils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import static envsetups.BaseEnv.driver;
public class ElementActions {
    public static WebElement getElement(By locator) {
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        }
        catch (Exception e) {
            System.out.println("Locator not found within 30 seconds");
        }
        return driver.findElement(locator);
    }
    public static List<WebElement> getElements(By locator) {
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        }
        catch (Exception e){
            System.out.println("Locators not found within 30 seconds");
        }
        return driver.findElements(locator);
    }
    public static void clickElement(By locator) throws InterruptedException {
        getElement(locator).click();
    }
    public static String getText(By locator) throws InterruptedException {
        return getElement(locator).getText();
    }
    public static void doEnterValue(By locator, String value) throws InterruptedException {
        getElement(locator).clear();
        getElement(locator).sendKeys(value);
    }
    public static boolean elementVisibilty(By locator) {
        return getElement(locator).isDisplayed();
    }
    public static void doDropdownValue(By locator, String value) throws InterruptedException {
        Select se = new Select(getElement(locator));
        se.selectByValue(value);
    }
    public static void elementScroll(By locator) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",getElement(locator));
    }
}
