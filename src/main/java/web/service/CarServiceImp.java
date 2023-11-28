package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService{

    @Override
    public List<Car> getCars(List<Car> cars,int count) {
        if (count > cars.size()){
            return cars;
        }
        return cars.subList(0 , count);
    }
}
