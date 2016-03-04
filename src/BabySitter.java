
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
            if(beforeBedTime(currentHour)) {
                totalPay += DAY_RATE;
            }
            else if(betweenBedtimeAndMidnight(currentHour)){
                totalPay += AFTER_BEDTIME_RATE;
            } else {
                totalPay += AFTER_MIDNIGHT_RATE;
            }
        }
        return totalPay;
    }

    private boolean betweenBedtimeAndMidnight(int currentHour) {
        return currentHour < MIDNIGHT && currentHour >= BEDTIME;
    }

    private boolean beforeBedTime(int currentHour) {
        return currentHour < BEDTIME;
    }
}
