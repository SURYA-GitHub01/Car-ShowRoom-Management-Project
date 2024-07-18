package Application.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data


public class ShowRoomEntity {
    @Id
    private int carNumber;
    private String make;
    private String model;
    private int yearOfManufacture;
    private int mileage;
    private String fuelType;
    private String transmission;
    private String color;
    private int seatCount;
    private String airBag;

}
