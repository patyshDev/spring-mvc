package web.Service;


import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public List<Car> getCarsByCount(List<Car> cars, int count) {
        List<Car> carsByCount = new ArrayList<>();
        if (count < cars.size()) {
            carsByCount = cars.subList(0, count);
        }
        return carsByCount;
    }
}
