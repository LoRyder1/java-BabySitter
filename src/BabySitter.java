
public class BabySitter {

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
}
