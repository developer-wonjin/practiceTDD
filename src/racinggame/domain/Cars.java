package racinggame.domain;

import racinggame.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cars {
    private static final int MAX_BOUND = 10;

    private List<Car> cars;

    public Cars(String carNames) {
        this(createCars(carNames));
    }


    public Cars(List<Car> cars){
        this.cars = cars;
    }

    private static List<Car> createCars(String carNames) {
        if(StringUtils.isBlank(carNames))throw new IllegalArgumentException("자동차 이름은 값이 존재해야합니다.");

        String[] splitCarNames = carNames.split(",");

        List<Car> cars = new ArrayList<>();
        for (String splitCarName : splitCarNames) {
            cars.add(new Car(splitCarName));
        }
        return cars;
    }

    public void race() {
    }

    private int getRandomNo() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }

    public Winners findWinners() {
    }
}
