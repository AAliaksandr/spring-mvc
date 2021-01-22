package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Car1", "red", "V6"));
        cars.add(new Car("Car2", "white", "V8"));
        cars.add(new Car("Car3", "yellow", "V12"));
        cars.add(new Car("Car4", "black", "V6"));
        cars.add(new Car("Car5", "blue", "V12"));

        if(count != null) {
            if(count >= cars.size()) {
                count = cars.size();
            }
            cars = cars.subList(0, count);
        }
        return cars;
    }

}
