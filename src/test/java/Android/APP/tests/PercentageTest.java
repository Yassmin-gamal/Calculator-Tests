package Android.APP.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Android.APP.utils.BaseTest;

public class PercentageTest extends BaseTest  {
	   @Test
	    public void testPercentage() {
	    	
	        calculatorPage.clickDigit(1);
	        calculatorPage.clickDigit(0);
            calculatorPage.clickDigit(0);

	        calculatorPage.clickpercentage();
 	        calculatorPage.clickEquals();
	        
		    driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);

		    String res = calculatorPage.getResultText();
	        Assert.assertEquals(res , "1 Calculation result");

}}
