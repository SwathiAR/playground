
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


/**
 * Created by swathi on 6/14/2015.
 */
public class WeatherDataAnalyzer {

    Logger logger = LoggerFactory.getLogger(WeatherDataAnalyzer.class);



    public WeatherData outputSmallestTemperatureSpread() {



        File file = new File("C:\\Users\\swathi\\IdeaProjects\\csvFile\\kata1\\weather.dat");

        ComparatorByTempSpread comp = new ComparatorByTempSpread();
        List<WeatherData> weatherDataList = new ArrayList<WeatherData>();
       try{
            Scanner inputStream = new Scanner(file);
            inputStream.nextLine();
            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                String[] split = line.split("\\s+");

                    int day = parseInt(split[1]);
                    int maxTemp = parseInt(split[2]);
                    int minTemp = parseInt(split[3]);


                WeatherData weatherData = new WeatherData(day ,maxTemp, minTemp);
                weatherDataList.add(weatherData);
            }

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

        weatherDataList.sort(comp);

        WeatherData weatherDataofMinTempSpread = weatherDataList.get(0);
        int minTempDay = weatherDataofMinTempSpread.getDay();
        int minTempSpread = weatherDataofMinTempSpread.getTempSpread();
        logger.info(String.valueOf(minTempDay));
        logger.info(String.valueOf(minTempSpread));
        return weatherDataofMinTempSpread;

    }

    private int parseInt(String s) {
        try{
            return Integer.parseInt(s);
        }
        catch (Exception e){
            logger.warn("Invalid data " + s);
            return  0;

        }
    }


}
