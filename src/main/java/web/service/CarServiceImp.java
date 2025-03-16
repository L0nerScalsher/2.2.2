package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final CarDao carDao;

    @Autowired
    public CarServiceImp(CarDaoImp carDao) {

        this.carDao = carDao;
    }


    @Override
    public List<Car> allCars() {
        return carDao.allCars();
    }

    @Override
    public List<Car> croppedList(int count) {
        return carDao.croppedList(count);
    }
}
