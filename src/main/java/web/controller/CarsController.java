package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("bmw","X", 5));
        carList.add(new Car("mercedes","W", 140));
        carList.add(new Car("audi","Q", 7));
        carList.add(new Car("mazda","RX", 8));
        carList.add(new Car("nissan","Z", 350));
        Service service = new Service();
        if (count == null || count >= carList.size()) {
            model.addAttribute("cars", carList);
        } else {
            List<Car> result = service.getCarsByCount(carList,count);
            model.addAttribute("cars", result);
        }
        return "car";
    }
}
