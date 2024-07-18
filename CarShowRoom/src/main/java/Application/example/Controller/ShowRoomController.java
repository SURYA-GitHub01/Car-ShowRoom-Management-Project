package Application.example.Controller;

import Application.example.Entity.ShowRoomEntity;
import Application.example.Service.ShowRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/car")
public class ShowRoomController {

    @Autowired
    private ShowRoomService showRoomService;

    @PostMapping("/addCars")
    public String CarPostMethod(@RequestBody ShowRoomEntity carDetails) {
        showRoomService.CarPostMethod(carDetails);
        return "Saved Successfully";
    }

    @GetMapping("/getAllCars")
    public List<ShowRoomEntity> CarGetAllMethod() {
        return showRoomService.CarGetAllMethod();
    }

    @GetMapping("/getByCarNumber/{carNumber}")
    public Optional<ShowRoomEntity> CarGetMethod(@RequestBody int carNumber) {
        return showRoomService.CarGetMethod(carNumber);

    }

    @PutMapping("/updateByCarNumber/{carNumber}")
    public String CarPutMethod(@PathVariable int carNumber, @RequestBody ShowRoomEntity showRoomEntity) {
        return showRoomService.CarPutMethod(showRoomEntity,carNumber);
    }

    @DeleteMapping("/deleteByCarNumber/{carNumber}")
    public String CarDeleteMapping(@PathVariable int carNumber) {
        showRoomService.CarDeleteMapping(carNumber);
        return "Deleted Successfully";

    }


}
