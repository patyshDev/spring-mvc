package web.Dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsDao {
    public List<Car> carList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("bmw","X", 5));
        carList.add(new Car("mercedes","W", 140));
        carList.add(new Car("audi","Q", 7));
        carList.add(new Car("mazda","RX", 8));
        carList.add(new Car("nissan","Z", 350));
        return carList;
    }
}
