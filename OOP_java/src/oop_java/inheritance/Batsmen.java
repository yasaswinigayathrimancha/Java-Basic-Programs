package oop_java.inheritance;
public class Batsmen extends Cricketer {
    private int runsScored;
    private int ballsFaced;
    private int noOfDismissals;
    private int noOfCenturies;
    private int highestScore;
    
    public int getRunsScored() {
        return runsScored;
    }
    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }
    public int getBallsFaced() {
        return ballsFaced;
    }
    public void setBallsFaced(int ballsFaced) {
        this.ballsFaced = ballsFaced;
    }
    public int getNoOfDismissals() {
        return noOfDismissals;
    }
    public void setNoOfDismissals(int noOfDismissals) {
        this.noOfDismissals = noOfDismissals;
    }
    public int getNoOfCenturies() {
        return noOfCenturies;
    }
    public void setNoOfCenturies(int noOfCenturies) {
        this.noOfCenturies = noOfCenturies;
    }
    public int getHighestScore() {
        return highestScore;
    }
    public void setHighestScore(int highestScore) {
        this.highestScore = highestScore;
    }
    
    public Batsmen() {
        super();
    }
    
    public Batsmen(String cricketerName, int cricketerAge, int numOfMatchesPlayed, int runsScored, int ballsFaced,
            int noOfDismissals, int noOfCenturies, int highestScore) {
        super(cricketerName, cricketerAge, numOfMatchesPlayed);
        this.runsScored = runsScored;
        this.ballsFaced = ballsFaced;
        this.noOfDismissals = noOfDismissals;
        this.noOfCenturies = noOfCenturies;
        this.highestScore = highestScore;
    }
    
    public double calStrikeRate() {
        double strikeRate = (double)(runsScored / ballsFaced) *100;
        return strikeRate;
    }
    
    public double calAverage() {
        double average = (double)(runsScored / noOfDismissals);
        return average;
    }
    
    @Override
    public String toString() {
        return   "\n["+ super.toString() + "\n runsScored = " + runsScored + "\n ballsFaced = " + ballsFaced + "\n noOfDismissals =" + noOfDismissals
                + "\n noOfCenturies = " + noOfCenturies + "\n highestScore = " + highestScore + "\n StrikeRate = "
                + calStrikeRate() + "\n Average = " + calAverage() +"]";
    }
}