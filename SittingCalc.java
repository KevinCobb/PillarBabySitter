
public class SittingCalc {
	
	static double startTime;
	static double endTime;

	public SittingCalc(double startTime, double endTime) {
		this.startTime = Math.round(startTime);
		this.endTime = Math.round(endTime);
	}

	public static boolean timeValid() {
		return startTime >= 17 && endTime <= 28;
	}

	

	
	
}
