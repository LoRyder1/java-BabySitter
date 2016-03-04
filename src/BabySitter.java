
public class BabySitter {

    private int startTime;
    private int endTime;
    private static final int DAY_RATE = 12;


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
            totalPay += DAY_RATE;
        }
        return totalPay;
    }
}
