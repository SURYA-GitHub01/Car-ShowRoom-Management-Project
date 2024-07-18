package Application.example.Service;

import Application.example.Entity.ShowRoomEntity;
import Application.example.Exception.ResourceNotFoundException;
import Application.example.Repo.CarShowRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShowRoomService {

    @Autowired
    private CarShowRoomRepo carShowRoomRepo;

    public void CarPostMethod(ShowRoomEntity carDetails) {
        carShowRoomRepo.save(carDetails);
    }

    public List<ShowRoomEntity> CarGetAllMethod() {
        return (List<ShowRoomEntity>) carShowRoomRepo.findAll();
    }

    public Optional<ShowRoomEntity> CarGetMethod(int carNumber) {
        return (Optional<ShowRoomEntity>) carShowRoomRepo.findById(carNumber);
    }

    public String CarPutMethod(ShowRoomEntity showRoomEntity, int carNumber) {

        ShowRoomEntity newCar = carShowRoomRepo.findById(carNumber).orElse(null);
        if (newCar != null) {
            newCar.setCarNumber(showRoomEntity.getCarNumber());
            newCar.setMake(showRoomEntity.getMake());
            newCar.setModel(showRoomEntity.getModel());
            newCar.setYearOfManufacture(showRoomEntity.getYearOfManufacture());
            newCar.setMileage(showRoomEntity.getMileage());
            newCar.setFuelType(showRoomEntity.getFuelType());
            newCar.setTransmission(showRoomEntity.getTransmission());
            newCar.setColor(showRoomEntity.getColor());
            newCar.setSeatCount(showRoomEntity.getSeatCount());
            newCar.setAirBag(showRoomEntity.getAirBag());
            carShowRoomRepo.save(newCar);
            return "Updated successfully";
        }

        return "Give Proper CarNumber";
    }


    public void CarDeleteMapping(int carNumber) {
        carShowRoomRepo.deleteById(carNumber);
    }


}
