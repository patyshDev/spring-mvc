package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @GetMapping
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        CarService service = new CarService();
        model.addAttribute("cars",service.getCarsByCount(count));
        return "car";
    }
}
