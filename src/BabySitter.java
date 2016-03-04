
public class BabySitter {

    private static final int DAY_RATE = 12;
    private static final int BEDTIME = 22;
    private static final int AFTER_BEDTIME_RATE = 8;
    private static final int MIDNIGHT = 24;
    private static final int AFTER_MIDNIGHT_RATE = 16;
    private int startTime;
    private int endTime;


    public BabySitter(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public boolean valid() {
        if(startTime < 17 || endTime > 28) {
            return false;
        } else {
            return true;
        }
    }

    public int calculatePay() {
        int totalPay = 0;
        for(int currentHour = startTime; currentHour < endTime; currentHour++) {
            if(currentHour >= MIDNIGHT) {
                totalPay += AFTER_MIDNIGHT_RATE;
            }
            else if(currentHour =< BEDTIME) {
                totalPay += DAY_RATE;
            } else {
                totalPay += AFTER_BEDTIME_RATE;
            }
        }
        return totalPay;
    }
}
