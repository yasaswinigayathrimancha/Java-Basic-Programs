package task3.task3;
import java.util.*;
public class AddOneSecond{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hrs:Mins:Secs");
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();
        System.out.println("Enter how many seconds u want to add: ");
        int n=sc.nextInt();
            int p[] = addSecond(hour,min,sec,n);
        System.out.println("New time is:");
        for(int i=0;i<3;i++) {
            System.out.print(p[i]+" ");
    }}

    public static int[] addSecond(int hour,int min,int sec,int n) {
        int addedSec = sec + n;
        int remMin=0,remHour=0;
        int count=0,remSec=0;
        while(addedSec>60) {
            addedSec=addedSec-60;
            remSec=addedSec;
            count=count+1;
            if(remSec==60){
                min=min+1;
            }
        }
          remMin=min+count;
         int flag=0;
             while(remMin>60){
                 remMin=remMin-60;
                 flag=flag+1;
                 if(remMin==60){
                   hour=hour+1;
                 }
             }
              remHour=hour+flag;
                if(remHour>12) {
                    remHour=01;
                }
                if(remSec==60){
                    remSec=00;
                    remMin=remMin+1;
                }
                if(remMin==60){
                    remMin=00;
                    remHour=remHour+1;
                }

        int k[] = new int[3];
        k[0] = remHour;
        k[1] = remMin;
        k[2] = remSec;
        return k;
    }

}