
package oop_java.inheritance;
public class Bowler extends Cricketer {
    private int numOfWickets;
    private int runsGiven;
    private int noOfOversBowled;
    public int getNumOfWickets() {
        return numOfWickets;
    }
    public void setNumOfWickets(int numOfWickets) {
        this.numOfWickets = numOfWickets;
    }
    public int getRunsGiven() {
        return runsGiven;
    }
    public void setRunsGiven(int runsGiven) {
        this.runsGiven = runsGiven;
    }
    public int getNoOfOversBowled() {
        return noOfOversBowled;
    }
    public void setNoOfOversBowled(int noOfOversBowled) {
        this.noOfOversBowled = noOfOversBowled;
    }
    public Bowler() {
        super();
    }
    public Bowler(String cricketerName, int cricketerAge, int numOfMatchesPlayed, int numOfWickets, int runsGiven,
            int noOfOversBowled) {
        super(cricketerName, cricketerAge, numOfMatchesPlayed);
        this.numOfWickets = numOfWickets;
        this.runsGiven = runsGiven;
        this.noOfOversBowled = noOfOversBowled;
    }
    public double calEconomy() {
        double economy = (double)(runsGiven / noOfOversBowled);
        return economy;
    }
    public double calAverage() {
        double average = (double)(runsGiven / numOfWickets);
        return average;
    }
    @Override
    public String toString() {
        return "\n["+ super.toString() + "\n numOfWickets = " + numOfWickets + "\n runsGiven = " + runsGiven + "\n noOfOversBowled = "
                + noOfOversBowled + "\n Economy = " + calEconomy() + "\n Average = " + calAverage()
                + "]";
    }
}