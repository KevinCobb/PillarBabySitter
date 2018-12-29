
public class SittingCalc {

	private static double startTime;
	private static double endTime;
	private final int midNight = 24;
	private final int dayTimeRateFamA = 15;
	private final int afterBedTimeRateFamA = 20;
	private final int bedTimeA = 23;
	private final int dayTimeRateFamB = 12;
	private final int afterBedTimeRateFamB = 4;
	private final int bedTimeB = 22;
	private final int afterMidnightRateB = 16;
	private final int dayTimeRateC = 21;
	private final int bedTimeC = 21;
	private final int afterBedTimeRateC = 15;

	public SittingCalc(double startTime, double endTime) {
		SittingCalc.startTime = Math.round(startTime);
		SittingCalc.endTime = Math.round(endTime);
	}

	public static boolean timeValid() {
		return startTime >= 17 && endTime <= 28;
	}

	public int calculatePayFamA() {
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

	private boolean afterBedTimeFamA(double currentHour) {
		return currentHour >= bedTimeA;
	}

	private boolean beforeBedTimeA(double currentHour) {
		return currentHour < bedTimeA;
	}

	public int calculatePayFamB() {
		int totalPayB = 0;
		for (double currentHour = startTime; currentHour < endTime; currentHour++) {
			if (beforeBedTimeB(currentHour)) {
				totalPayB += dayTimeRateFamB;
			} else if (betweenBedTimeAndMidnightB(currentHour)) {
				totalPayB += afterBedTimeRateFamB;
			} else {
				totalPayB = afterMidnightRateB;
			}
		}
		return totalPayB;
	}

	private boolean betweenBedTimeAndMidnightB(double currentHour) {
		return currentHour > bedTimeB && currentHour <= midNight;
	}

	private boolean beforeBedTimeB(double currentHour) {
		return currentHour <= bedTimeB;
	}

	public int calculatePayFamC() {
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

	private boolean afterBedTimeC(double currentHour) {
		return currentHour >= 22;
	}

	private boolean beforeBedTimeC(double currentHour) {
		return currentHour <= bedTimeC;
	}
}
