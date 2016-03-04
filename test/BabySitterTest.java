import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BabySitterTest {

    private BabySitter sitting;

    @Test
    public void sittingStartsNoEarlierThanFive() {
        sitting = new BabySitter(17,28);
        assertEquals(false, sitting.valid());
    }


}
