package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService {

    private List<Car> ListCar;
    //блок инициализации
    {
        ListCar = new ArrayList<>();
        ListCar.add(new Car("Mercedes", "red", "w210"));
        ListCar.add(new Car("Chevrolet", "black", "w8"));
        ListCar.add(new Car("BMW", "Grey", "w90"));
        ListCar.add(new Car("Peugeot", "White", "w6"));
        ListCar.add(new Car("Toyota", "Blue", "w8"));
    }


    @Override
    public List<Car> readCar(int a) {
        List<Car> newListCar = new ArrayList<>();
        for (int i = 0; i < a; i++){
            newListCar.add(ListCar.get(i));
        }
        return newListCar;
    }
}
