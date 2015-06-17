/**
 * Created by swathi on 6/15/2015.
 */
public class FootballData {

    private String team;
    private int forGoals;
    private int againstGoals;

    public FootballData(String team, int forGoals, int againstGoals) {
        this.team = team;
        this.forGoals = forGoals;
        this.againstGoals = againstGoals;
    }


    public int getAgainstGoals() {
        return againstGoals;
    }

    public String getTeam() {
        return team;
    }

    public int getForGoals() {
        return forGoals;
    }

    public int getDifferenceInGoals(){

        int differenceInGoals = forGoals - againstGoals;
        return differenceInGoals;
    }



}
