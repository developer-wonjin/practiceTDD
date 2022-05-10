package racinggame.domain;

public class RacingGame {

    private final Cars cars;//final인 이유
    private final TryNo tryNo;


    public RacingGame(String carNames, int tryNo) {
        this.cars = new Cars(carNames);
        this.tryNo = new TryNo(tryNo);
    }

    public boolean racing() {
        return tryNo.isPositive();
    }

    public void race() {
        tryNo.minus();
        cars.race();
    }

    public Cars getCars() {
        return cars;
    }

    public Winners getWinners(){
        return cars.findWinners();
    }
}
