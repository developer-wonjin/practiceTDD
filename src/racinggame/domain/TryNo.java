package racinggame.domain;

public class TryNo {

    private int tryNo;

    public TryNo(int tryNo) {
        if(tryNo < 1)throw new IllegalArgumentException("시도횟수는 양수");
        this.tryNo = tryNo;
    }

    public boolean isPositive() {
        return tryNo > 0;
    }

    public void minus() {
        tryNo--;
    }
}
