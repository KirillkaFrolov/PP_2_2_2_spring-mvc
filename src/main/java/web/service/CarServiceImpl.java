package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Car1", 111, "Color1"));
        cars.add(new Car("Car2", 222, "Color2"));
        cars.add(new Car("Car3", 333, "Color3"));
        cars.add(new Car("Car4", 444, "Color4"));
        cars.add(new Car("Car5", 555, "Color5"));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(Math.max(count, 0)).toList();
    }
}
