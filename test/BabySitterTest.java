import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BabySitterTest {

    private BabySitter sitting;

    public void sittingSchedule(int startTime, int endTime) {
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

}
