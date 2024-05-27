package Android.APP.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Android.APP.utils.BaseTest;

public class SubtractionTest extends BaseTest {
	
	
	   @Test
	    public void testSubtraction() {
	    	
	        calculatorPage.clickDigit(2);
	        calculatorPage.clickMinus();
	        calculatorPage.clickDigit(6);
	        calculatorPage.clickEquals();
	        
		    driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);

		    String res = calculatorPage.getResultText();
	        Assert.assertEquals(res , " Minus 4 Calculation result");

}}