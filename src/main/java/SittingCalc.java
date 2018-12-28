
public class SittingCalc {
	
	static double startTime;
	static double endTime;
	private final static int dayTimeRateFamA = 15;
	private final static int afterBedTimeRateFamA = 20;
	private final static int bedTimeA = 23;

	public SittingCalc(double startTime, double endTime) {
		this.startTime = Math.round(startTime);
		this.endTime = Math.round(endTime);
	}

	public static boolean timeValid() {
		return startTime >= 17 && endTime <= 28;
	}

	public int calculatePayFamA() {
		int totalPayA = 0;
		for (double currentHour = startTime; currentHour < endTime; currentHour ++) {
			if (beforeBedTimeA(currentHour)) {
				totalPayA += dayTimeRateFamA;
			} else if (afterBedTimeFamA(currentHour)) {
				totalPayA += afterBedTimeRateFamA ;
			}
		}
		return totalPayA;
	}

	private static boolean afterBedTimeFamA(double currentHour) {
		return currentHour > bedTimeA;
	}

	private static boolean beforeBedTimeA(double currentHour) {
		return currentHour < bedTimeA;
	}
	
	
}