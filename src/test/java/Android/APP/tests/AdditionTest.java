package Android.APP.tests;

import Android.APP.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTest extends BaseTest {

    @Test
    public void testAddition() {
    	
        calculatorPage.clickDigit(2);
        calculatorPage.clickPlus();
        calculatorPage.clickDigit(6);
        calculatorPage.clickEquals();
        
	    driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);

	    String res = calculatorPage.getResultText();
        Assert.assertEquals(res , "8 Calculation result");

       
         

     }
}