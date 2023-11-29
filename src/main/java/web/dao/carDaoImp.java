package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class carDaoImp implements CarDao {
    private final List<Car> cars = new ArrayList<>(Arrays.asList(new Car(1921,1,"Brand1"),
        new Car(2003,2,"Brand2"),
        new Car(3072,3,"Brand3"),
        new Car(4056,4,"Brand4"),
        new Car(5612,5,"Brand5")));

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count > cars.size()) {
            return cars;
        }
        return cars.subList(0 , count);
    }
}
