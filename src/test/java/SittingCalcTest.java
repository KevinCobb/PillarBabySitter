import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SittingCalcTest {
	
	private SittingCalc time;
	
	public void SittingCalc(double startTime, double endTime) {
		time = new SittingCalc(startTime, endTime);
	}

	@Test
	public void whenStartTimeIsEnteredIsItAValidTime() {
		SittingCalc(5, 10);
		assertEquals(false, SittingCalc.timeValid());
			}
}
