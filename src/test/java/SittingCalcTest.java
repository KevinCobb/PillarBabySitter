import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;

public class SittingCalcTest {
	
	private SittingCalc timeWorked = new SittingCalc(17, 28);

	@Test
	public void whenStartTimeIsEnteredIsItAValidTime() {
		timeWorked.setStartTime(16);
		timeWorked.setEndTime(29);
		assertEquals(false, timeWorked.timeValid());
	}

	@Test
	public void whenStartTimeIsEnteredItIsNowAValidTime() {
		assertEquals(true, timeWorked.timeValid());
	}

	@Test
	public void dayPayRateForFamilyAShouldBe15() {
		assertEquals(15, timeWorked.calculatePayFamA(17, 18));
	}

	@Test
	public void afterBedTimeRateShouldBe20() {
		assertEquals(20, timeWorked.calculatePayFamA(23, 24));
	}

	@Test
	public void dayPayRateForFamBSHouldBe12() {
		assertEquals(12, timeWorked.calculatePayFamB(19, 20));
	}

	@Test
	public void afterBedTimeRateForFamShouldBe8() {
		assertEquals(8, timeWorked.calculatePayFamB(22, 23));
	}

	@Test
	public void afterMidnightRateForFamBShouldBe16() {
		assertEquals(16, timeWorked.calculatePayFamB(24, 25));

	}

	@Test
	public void dayPayRateForFamCShouldBe21() {
		assertEquals(21, timeWorked.calculatePayFamC(20, 21));
	}

	@Test
	public void afterBedTimeRateForFamCSHouldBe15() {
		assertEquals(15, timeWorked.calculatePayFamC(22, 23));

	}

}
