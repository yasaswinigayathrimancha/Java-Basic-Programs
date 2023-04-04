package oop_java.inheritance;
public class Cricketer {
    private String cricketerName;
    private int cricketerAge;
    private int numOfMatchesPlayed;
    public String getCricketerName() {
        return cricketerName;
    }
    public void setCricketerName(String cricketerName) {
        this.cricketerName = cricketerName;
    }
    public int getCricketerAge() {
        return cricketerAge;
    }
    public void setCricketerAge(int cricketerAge) {
        this.cricketerAge = cricketerAge;
    }
    public int getNumOfMatchesPlayed() {
        return numOfMatchesPlayed;
    }
    public void setNumOfMatchesPlayed(int numOfMatchesPlayed) {
        this.numOfMatchesPlayed = numOfMatchesPlayed;
    }
    public Cricketer(String cricketerName, int cricketerAge, int numOfMatchesPlayed) {
        super();
        this.cricketerName = cricketerName;
        this.cricketerAge = cricketerAge;
        this.numOfMatchesPlayed = numOfMatchesPlayed;
    }
    public Cricketer() {
        super();
    }
    @Override
    public String toString() {
        return "cricketerName = " + cricketerName + "\n cricketerAge = " + cricketerAge + "\n numOfMatchesPlayed = "
                + numOfMatchesPlayed ;
    }
}