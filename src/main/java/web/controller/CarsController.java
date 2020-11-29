package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.Service;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @GetMapping("/")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        Service service = new Service();
        if (count == null || count >= service.getCarsList().size()) {
            model.addAttribute("cars", service.getCarsList());
        } else {
            model.addAttribute("cars", service.getCarsByCount(count));
        }
        return "car";
    }
}
