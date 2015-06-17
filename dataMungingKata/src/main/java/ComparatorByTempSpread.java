import java.util.Comparator;
import java.util.Map;

/**
 * Created by swathi on 6/14/2015.
 */
public class ComparatorByTempSpread implements Comparator<WeatherData> {



    public int compare(WeatherData o1, WeatherData o2) {
        return (o1.getTempSpread() - o2.getTempSpread());
    }
}
