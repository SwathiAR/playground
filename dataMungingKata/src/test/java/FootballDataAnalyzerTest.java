import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 6/15/2015.
 */
public class FootballDataAnalyzerTest {
    FootballDataAnalyzer footballDataAnalyzer = new FootballDataAnalyzer();

    @Test

    public void shouldCalculateMinDiffInGoals(){

        FootballData footballData = footballDataAnalyzer.calculateSmallestGoalDifference();
        assertNotNull(footballData);
        footballData.getTeam();
        footballData.getDifferenceInGoals();

    }
}