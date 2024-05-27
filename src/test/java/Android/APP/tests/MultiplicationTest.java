package Android.APP.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Android.APP.utils.BaseTest;

public class MultiplicationTest extends BaseTest {
	
	   @Test
	    public void testMultiplication() {
	    	
	        calculatorPage.clickDigit(2);
	        calculatorPage.clickMultiply();
	        calculatorPage.clickDigit(6);
	        calculatorPage.clickEquals();
	        
		    driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);

		    String res = calculatorPage.getResultText();
	        Assert.assertEquals(res , "12 Calculation result");

}}
