import java.util.Comparator;

/**
 * Created by swathi on 6/15/2015.
 */
public class ComparatorBYDiffInGoals implements Comparator<FootballData> {
    public int compare(FootballData o1, FootballData o2) {
        return o1.getDifferenceInGoals()-o2.getDifferenceInGoals();
    }
}
