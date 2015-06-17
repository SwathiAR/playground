import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 6/15/2015.
 */
public class WeatherDataAnalyzerTest {

    WeatherDataAnalyzer weatherDataAnalyzer = new WeatherDataAnalyzer();

    @Test

    public void shouldCalculateSmallestTemperature(){
        weatherDataAnalyzer.outputSmallestTemperatureSpread();
    }

}