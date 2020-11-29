package web.Service;


import web.Dao.CarsDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private CarsDao carsDao = new CarsDao();
    public List<Car> getCarsByCount(int count) {
        List<Car> carsByCount = new ArrayList<>();
        if (count < carsDao.carList().size()) {
            carsByCount = carsDao.carList().subList(0, count);
        }
        return carsByCount;
    }

    public List<Car> getCarsList() {
        return carsDao.carList();
    }
}
