import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

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
	
	@Test
	public void whenStartTimeIsEnteredItIsNowAValidTime() {
		SittingCalc(17, 21);
		assertEquals(true, SittingCalc.timeValid());
		
	}
	
	@Test 
	public void dayPayRateForFamilyAShouldBe15() {
	    SittingCalc(17, 18);
	    assertEquals(15, time.calculatePayFamA());
	}
	
	@Test
	public void afterBedTimeRateShouldBe20() {
		SittingCalc(23, 24);
		assertEquals(20, time.calculatePayFamA());
	}
	
	@Test 
	public void dayPayRateForFamBSHouldBe12() {
		SittingCalc(17, 18);
		assertEquals(12, time.calculatePayFamB());
    }
	
	@Test
	public void afterBedTimeRateForFamShouldBe4() {
		SittingCalc(23, 24);
		assertEquals(4, time.calculatePayFamB());
	}
	
	@Test
	public void afterMidnightRateForFamBShouldBe16() {
		SittingCalc(24, 28);
		assertEquals(16, time.calculatePayFamB());
		
	}
	
	@Test 
	public void dayPayRateForFamCShouldBe21() {
		SittingCalc(17, 18);
		assertEquals(21, time.calculatePayFamC());
	}
	
}

