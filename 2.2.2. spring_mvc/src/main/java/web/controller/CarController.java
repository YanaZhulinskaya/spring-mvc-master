package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printCar(@RequestParam(value = "count", defaultValue = "5")int count, ModelMap model){
        model.addAttribute("printCar", carService.readCar(count));
        return "cars";
    }
}
