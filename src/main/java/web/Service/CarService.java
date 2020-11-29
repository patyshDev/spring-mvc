package web.Service;


import web.Dao.CarsDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private final CarsDao carsDao = new CarsDao();

    public List<Car> getCarsByCount(Integer count) {
        List<Car> cars = carsDao.carList();
        int toIndex = count != null && count < cars.size() ? count : cars.size();
        return  cars.subList(0, toIndex);
    }

    public List<Car> getCarsList() {
        return carsDao.carList();
    }
}
