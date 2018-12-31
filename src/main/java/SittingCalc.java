
public class SittingCalc {

	private double startTime;
	private double endTime;
	private final static int midNight = 24;
	private final static int dayTimeRateFamA = 15;
	private final static int afterBedTimeRateFamA = 20;
	private final static int bedTimeA = 23;
	private final static int dayTimeRateFamB = 12;
	private final static int afterBedTimeRateFamB = 8;
	private final static int bedTimeB = 22;
	private final static int afterMidnightRateB = 16;
	private final static int dayTimeRateC = 21;
	private final static int bedTimeC = 21;
	private final static int afterBedTimeRateC = 15;

	public SittingCalc(double startTime, double endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public double getStartTime() {
		return startTime;
	}

	public void setStartTime(double startTime) {
		this.startTime = startTime;
	}

	public double getEndTime() {
		return endTime;
	}

	public void setEndTime(double endTime) {
		this.endTime = endTime;
	}

	public boolean timeValid() {
		return startTime < endTime && (startTime >=17 && endTime <=28);
	}

	public int calculatePayFamA(double enteredStart, double enteredEnd) {
		startTime = enteredStart;
		endTime = enteredEnd;
		int totalPayA = 0;
		for (double currentHour = startTime; currentHour < endTime; currentHour++) {
			if (beforeBedTimeA(currentHour)) {
				totalPayA += dayTimeRateFamA;
			} else if (afterBedTimeFamA(currentHour)) {
				totalPayA += afterBedTimeRateFamA;
			}
		}
		return totalPayA;
	}

	private static boolean afterBedTimeFamA(double currentHour) {
		return currentHour >= bedTimeA;
	}

	private static boolean beforeBedTimeA(double currentHour) {
		return currentHour < bedTimeA;
	}

	public int calculatePayFamB(double enteredStart, double enteredEnd) {
		startTime = enteredStart;
		endTime = enteredEnd;
		int totalPayB = 0;
		for (double currentHour = startTime; currentHour < endTime; currentHour++) {
			if (beforeBedTimeB(currentHour)) {
				totalPayB += dayTimeRateFamB;
			} else if (betweenBedTimeAndMidnightB(currentHour)) {
				totalPayB += afterBedTimeRateFamB;
			} else {
				totalPayB += afterMidnightRateB;
			}
			
		}
		return totalPayB;
	}

	private static boolean betweenBedTimeAndMidnightB(double currentHour) {
		return currentHour >= bedTimeB && currentHour < midNight;
	}

	private static boolean beforeBedTimeB(double currentHour) {
		return currentHour < bedTimeB;
	}

	public int calculatePayFamC(double enteredStart, double enteredEnd) {
		startTime = enteredStart;
		endTime = enteredEnd;
		int totalPayC = 0;
		for (double currentHour = startTime; currentHour < endTime; currentHour++) {
			if (beforeBedTimeC(currentHour)) {
				totalPayC += dayTimeRateC;
			} else if (afterBedTimeC(currentHour)) {
				totalPayC += afterBedTimeRateC;
			}
		}
		return totalPayC;

	}

	private static boolean afterBedTimeC(double currentHour) {
		return currentHour >= bedTimeC;
	}

	private static boolean beforeBedTimeC(double currentHour) {
		return currentHour < bedTimeC;
	}
}
