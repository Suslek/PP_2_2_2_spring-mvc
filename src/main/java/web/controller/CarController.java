package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final CarServiceImp carServiceImp = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model, @RequestParam(required = false) Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1921,1,"Brand1"));
        cars.add(new Car(2003,2,"Brand2"));
        cars.add(new Car(3072,3,"Brand3"));
        cars.add(new Car(4056,4,"Brand4"));
        cars.add(new Car(5612,5,"Brand5"));

        if (count == null){
            model.addAttribute("cars", cars);
            return "cars";
        }

        model.addAttribute("cars", carServiceImp.getCars(cars,count));
        return "cars";
    }
}
