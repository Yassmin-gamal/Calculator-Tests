package Android.APP.Pages;

 
 

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CalculatorPage {
    private AndroidDriver<MobileElement> driver;

    // Constructor
    public CalculatorPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    // Elements
    private By digit0 = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_00");

    private By digit1 = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01");
    private By digit2 = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02");
    private By digit3 = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03");
    private By digit4 = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_04");
    private By digit5 = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05");
    private By digit6 = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_06");
    private By digit7 = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07");
    private By digit8 = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_08");
    private By digit9 = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09");

    private By sum = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add");
    private By sub = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_sub");
    private By mul = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul");
    private By div = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_div");
    private By per = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_percentage");
    
    
    private By equals = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal");
    private By result = By.className("android.widget.EditText");

    // Methods to interact with elements
    public void clickDigit(int digit) {
        switch (digit) {
        case 0:
            driver.findElement(digit0).click();
            break;
           case 1:
            driver.findElement(digit1).click();
            break;
            case 2:
                driver.findElement(digit2).click();
                break;
            case 3:
                driver.findElement(digit3).click();
                break;
            case 4:
                driver.findElement(digit4).click();
                break;
            case 5:
                driver.findElement(digit5).click();
                break;
            case 6:
                driver.findElement(digit6).click();
                break;
            case 7:
                driver.findElement(digit7).click();
                break;
            case 8:
                driver.findElement(digit8).click();
                break;
            case 9:
                driver.findElement(digit9).click();
                break;
            default:
                throw new IllegalArgumentException("Invalid digit: " + digit);
        }
    }
    
    public void clickPlus() {
        driver.findElement(sum).click();
    }

    public void clickMinus() {
        driver.findElement(sub).click();
    }

    public void clickMultiply() {
        driver.findElement(mul).click();
    }
    public void clickDivision() {
        driver.findElement(div).click();
    }
    public void clickpercentage() {
        driver.findElement(per).click();
    }

    public void clickEquals() {
        driver.findElement(equals).click();
    }


    public String getResultText() {
        return driver.findElement(result).getText();
    }
}
