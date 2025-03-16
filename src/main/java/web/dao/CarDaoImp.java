package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao{

    private List<Car> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car("model1", "series1", "red"));
        carsList.add(new Car("model2", "series2", "green"));
        carsList.add(new Car("model3", "series3", "blue"));
        carsList.add(new Car("model4", "series4", "black"));
        carsList.add(new Car("model5", "series5", "white"));
    }

    @Override
    public List<Car> allCars() {
        return carsList;
    }

    @Override
    public List<Car> croppedList(int count) {
        return carsList.stream().limit(count).collect(Collectors.toList());
    }

}
