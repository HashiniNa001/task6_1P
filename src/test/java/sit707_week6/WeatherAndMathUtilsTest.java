package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s223021831";
		Assert.assertNotNull("Student ID is ", studentId);
		System.out.println("Student ID is: " + studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "N G H Madushani";
		Assert.assertNotNull("Student name is ", studentName);
		System.out.println("Student name is: " + studentName);
	}
	
	@Test
    public void testCancelWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
        System.out.println("Weather advice test for canceling due to dangerous wind speed passed");
    }

    @Test
    public void testWeatherAdvice_AllClear() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 3.0));
        System.out.println("Weather advice test for all clear conditions passed");
    }

    @Test
    public void testWeatherAdvice_Cancel_DangerousWind() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(80.0, 2.0));
        System.out.println("Weather advice test for canceling due to dangerous wind speed passed");
    }

    @Test
    public void testWeatherAdvice_Cancel_DangerousRain() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(40.0, 7.0));
        System.out.println("Weather advice test for canceling due to dangerous rainfall passed");
    }

    @Test
    public void testWeatherAdvice_Cancel_ConcerningWindRain() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(50.0, 5.0));
        System.out.println("Weather advice test for canceling due to concerning wind speed and rainfall passed");
    }

    @Test
    public void testWeatherAdvice_Warn_ConcerningWind() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 3.0));
        System.out.println("Weather advice test for warning due to concerning wind speed passed");
    }

    @Test
    public void testWeatherAdvice_Warn_ConcerningRain() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(30.0, 5.0));
        System.out.println("Weather advice test for warning due to concerning rainfall passed");
    }

    @Test
    public void testWeatherAdvice_Warn_ConcerningWindRain() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 4.0));
        System.out.println("Weather advice test for warning due to concerning wind speed and rainfall passed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWeatherAdvice_InvalidInput_NegativeValues() {
        WeatherAndMathUtils.weatherAdvice(-10.0, 5.0);
        System.out.println("Test for invalid input with negative values passed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWeatherAdvice_InvalidInput_ZeroValues() {
        WeatherAndMathUtils.weatherAdvice(0.0, 0.0);
        System.out.println("Test for invalid input with zero values passed");
    }

    @Test
    public void testIsEven_EvenNumber() {
        Assert.assertTrue(WeatherAndMathUtils.isEven(4));
        System.out.println("Test for even number passed");
    }

    @Test
    public void testIsEven_OddNumber() {
        Assert.assertFalse(WeatherAndMathUtils.isEven(5));
        System.out.println("Test for odd number passed");
    }

    @Test
    public void testIsPrime_PrimeNumber() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(7));
        System.out.println("Test for prime number passed");
    }

    @Test
    public void testIsPrime_NonPrimeNumber() {
        Assert.assertFalse(WeatherAndMathUtils.isPrime(10));
        System.out.println("Test for non-prime number passed");
    }
}
