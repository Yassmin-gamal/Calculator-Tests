package Android.APP.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Android.APP.utils.BaseTest;

public class DivisionTest extends BaseTest  {
	   @Test
	    public void testDivision() {
	    	
	        calculatorPage.clickDigit(6);
	        calculatorPage.clickDivision();
	        calculatorPage.clickDigit(2);
	        calculatorPage.clickEquals();
	        
		    driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);

		    String res = calculatorPage.getResultText();
	        Assert.assertEquals(res , "3 Calculation result");

}}
