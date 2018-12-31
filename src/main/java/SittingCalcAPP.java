import java.util.Scanner;

public class SittingCalcAPP {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Pillar Baby Sitting Calculator\n");
		System.out.println("Please enter your starting hour in military time - for example 5pm would be 17\n");
		double enteredStartTime = input.nextDouble();
		// loop to check start time
		while (enteredStartTime < 17 || enteredStartTime > 27) {
			System.out.println("You entered a time to start before possible work. Try again.");
			enteredStartTime = input.nextDouble();
		}

		System.out.println(
				"\nNow enter your ending 2 digit hour. -- note if after midnight please add the time to 24. For example 4am would be 28\n");
		double enteredEndTime = input.nextDouble();
		// loop to check end time
		while (enteredEndTime < 17 || enteredEndTime > 28) {
			System.out.println("You entered a time to end after work. Try again.");
			enteredEndTime = input.nextDouble();
		}
		
		// create object to store time worked
		SittingCalc timeWorked = new SittingCalc(enteredStartTime, enteredEndTime);
		
		// validate time entered
		if (timeWorked.timeValid()) {
			System.out.println("\nShift to work is valid. Going to calculating pay from family \n");
		} else {
			System.out.println("Start time should be before end time");
			System.exit(0);
		}

		System.out.println("Now please choose which family you babysat for: 1 for Family A\n");

		int userInput = input.nextInt();
		// loop to check userinput is a valid family to choose from
		while (userInput > 3 || userInput <= 0) {
			System.out.println("You entered a wrong number, try again.");
			userInput = input.nextInt();
		}

		switch (userInput) {

		case 1:
			System.out.println("\nFamily A.... ");
			System.out.println("\nYou got paid: $" + timeWorked.calculatePayFamA(enteredStartTime, enteredEndTime) + "\n");
			System.out.println("\n Ok ! \n");
			break;
		case 2:
			System.out.println("\nFamily B....");
			System.out.println("\nYou got paid: $" + timeWorked.calculatePayFamB(enteredStartTime, enteredEndTime) + "\n");
			System.out.println("\nOk ! \n");
			break;

		case 3:
			System.out.println("\nFamily C...");
			System.out.println("\nYou got paid: $" + timeWorked.calculatePayFamC(enteredStartTime, enteredEndTime) + "\n");
			System.out.println("\nOk ! \n");
		}
	}
}