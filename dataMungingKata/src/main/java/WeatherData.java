public class WeatherData {
    private int day;
    private int maxTemp;
    private int minTemp;
    private int tempSpread;

    public WeatherData(int day, int maxTemp, int minTemp){
        this.day = day;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }

    public int getTempSpread(){

        tempSpread = maxTemp - minTemp;
        return  tempSpread;
    }

    public int getDay() {
        return day;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }
}
