import java.util.Scanner;

public class SittingCalcAPP {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		System.out.println("Welcome to the Pillar Baby Sitting Calculator\n");
		System.out.println("Please enter your starting hour in military time - for example 5pm would be 17\n");
		double enteredStartTime = input.nextDouble();
		
		System.out.println("\nNow enter your ending hour. -- note if after midnight please add the time to 24. for example 4am would be 28\n");
		double enteredEndTime = input.nextDouble();
		
		if (enteredStartTime < enteredEndTime) {
			System.out.println("\n ok \n");
		} else {
		System.out.println("Start time should be before end time");
		}
	}

}
