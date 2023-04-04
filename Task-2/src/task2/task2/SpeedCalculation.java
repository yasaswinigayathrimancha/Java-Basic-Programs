package task2.task2;
import java.util.Scanner;
public class SpeedCalculation {
	public static float speedMeasuremps(float distance, float hour, float min, float sec) {
		float timesec;
		float mps;
		timesec = (hour * 3600) + (min * 60) + sec;
		mps = distance / timesec;
		return mps;
	}

	public static float speedMeasurekph(float distance, float hour, float min, float sec) {
		float timesec;
		float kph;
		timesec = (hour * 3600) + (min * 60) + sec;
		kph = (distance / 1000.0f) / (timesec / 3600.0f);
		return kph;
	}

	public static float speedMeasuremph(float distance, float hour, float min, float sec) {
		float mph;
		mph = speedMeasurekph(distance, hour, min, sec) / 1.609f;
		return mph;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Distance :");
		float distance = sc.nextFloat();
		System.out.println("Enter the time in hours :");
		float hour = sc.nextFloat();
		System.out.println("Enter the time in minutes :");
		float min = sc.nextFloat();
		System.out.println("Enter the time in seconds :");
		float sec = sc.nextFloat();
		System.out.println("speed in meters per second : " + speedMeasuremps(distance, hour, min, sec));
		System.out.println("speed in kilometers per hour : " + speedMeasurekph(distance, hour, min, sec));
		System.out.println("speed in miles per hour are : " + speedMeasuremph(distance, hour, min, sec));
	}
}