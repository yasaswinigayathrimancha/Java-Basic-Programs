
package oop_java.inheritance;
public class CricketerProfile {
    public static void main(String[] args) {
        Batsmen obj1 = new Batsmen("Rohit Sharma",35,122,3443,2465,122,4,118);
        Bowler obj2 = new Bowler("jadeja",33,60,50,1427,200);
        System.out.println("Player 1 profile -----> \n" + obj1);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Player 2 profile -----> \n" + obj2);
    }
}