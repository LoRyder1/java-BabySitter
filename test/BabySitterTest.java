import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BabySitterTest {

    private BabySitter sitting;

    public void sittingSchedule(double startTime, double endTime) {
        sitting = new BabySitter(startTime, endTime);
    }

    @Test
    public void sittingStartsEarlierThanFiveReturnsFalse() {
        sittingSchedule(16, 28);
        assertEquals(false, sitting.valid());
    }

    @Test
    public void sittingStartsLaterThanFiveReturnsTrue() {
        sittingSchedule(17, 28);
        assertEquals(true, sitting.valid());
    }

    @Test
    public void sittingEndsLaterThanFourReturnsFalse() {
        sittingSchedule(17, 29);
        assertEquals(false, sitting.valid());
    }

    @Test
    public void sittingEndsEarlierThanFourReturnsTrue() {
        sittingSchedule(17, 28);
        assertEquals(true, sitting.valid());
    }

    @Test
    public void calculatePayShouldReturn12PerHourBeforeBedtime() {
        sittingSchedule(17, 18);
        assertEquals(12, sitting.calculatePay());
    }

    @Test
    public void calculatePayShouldReturn8PerHourAfterBedtime() {
        sittingSchedule(22, 23);
        assertEquals(8, sitting.calculatePay());
    }

    @Test
    public void calculatePayShouldReturn16PerHourAfterMidnight() {
        sittingSchedule(24, 25);
        assertEquals(16, sitting.calculatePay());
    }

    @Test
    public void calculatePayForFullNight() {
        sittingSchedule(17, 28);
        assertEquals(140, sitting.calculatePay());
    }

    @Test
    public void calculatePayForFullHoursNotFractional() {
        sittingSchedule(17.6, 27.4);
        assertEquals(112, sitting.calculatePay());
    }
}
