import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by swathi on 6/15/2015.
 */
public class FootballDataAnalyzer {

    Logger logger = LoggerFactory.getLogger(FootballDataAnalyzer.class);

    public FootballData calculateSmallestGoalDifference() {
        File file = new File("C:\\Users\\swathi\\IdeaProjects\\csvFile\\kata1\\football.dat");

        List<FootballData> footballDataList = new ArrayList<FootballData>();
        try {
            Scanner inputStream = new Scanner(file);
            inputStream.nextLine();
            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                String[] split = line.split("\\s+");
                if (split.length >= 10) {
                    String team = split[2];
                    int forGoals = integerParse(split[7]);
                    int againstGoals = integerParse((split[9]));
                    FootballData footballData = new FootballData(team, forGoals, againstGoals);
                    footballDataList.add(footballData);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        footballDataList.sort(new ComparatorBYDiffInGoals());
        FootballData footballDataOfTeamWithMinGoalDiff = footballDataList.get(0);
        String teamWithMinGoalDiff = footballDataOfTeamWithMinGoalDiff.getTeam();
        int minGoalDiff = footballDataOfTeamWithMinGoalDiff.getDifferenceInGoals();
        logger.info("Team with min goal difference  is {} ", teamWithMinGoalDiff);
        logger.info("Min Goal Difference is {}", minGoalDiff);
        return footballDataOfTeamWithMinGoalDiff;

    }


    private int integerParse(String s) {

        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            return 0;
        }
    }

}
