package web.service;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getListCars(String count) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Ferrary", 1352, 5034350));
        carList.add(new Car("Ford", 2042, 34350));
        carList.add(new Car("Mazda", 1014, 45350));
        carList.add(new Car("Gaz", 1344, 34350));
        carList.add(new Car("Vaz", 13314, 45450));

        if (count != null && Integer.parseInt(count) < 5) {
            for (int i = 4; i >= Integer.parseInt(count); i--) {
                carList.remove(i);
            }
        }
        return carList;
    }
}
