import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BabySitterTest {

    private BabySitter sitting;

    @Test
    public void sittingEarlierThanFiveReturnsFalse() {
        sitting = new BabySitter(16,28);
        assertEquals(false, sitting.valid());
    }

    @Test
    public void sittingLaterThanFiveReturnsTrue() {
        sitting = new BabySitter(17,28);
        assertEquals(true, sitting.valid());
    }


}
