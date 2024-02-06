package SystemDesign.LLD.CarRentalSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

/*
Design Car Rental System-
 1. create a method to get all cars which matched the filter criteria.
 2. create a method to get all cars which are available for booking b/w 2 given dates.
 3. create a method to book a car and it should handle concurrency.
  ie 2 users shouldn't be able to book same car for same dates if they try to book at same time.
 */


class Car {
    private int id;
    private String brand;
    private String model;
    private boolean available;

    public Car(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Booking {
    private int userId;
    private int carId;
    private Date startDate;
    private Date endDate;

    public Booking(int userId, int carId, Date startDate, Date endDate) {
        this.userId = userId;
        this.carId = carId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getUserId() {
        return userId;
    }

    public int getCarId() {
        return carId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}

public class CarRentalSystem {
    private List<Car> cars;
    private List<Booking> bookings;
    private ReentrantLock lock;

    public CarRentalSystem() {
        cars = new ArrayList<>();
        bookings = new ArrayList<>();
        lock = new ReentrantLock();
    }

    // Method to add a new car to the system
    public void addCar(int id, String brand, String model) {
        cars.add(new Car(id, brand, model));
    }

    // Method to get cars that match the filter criteria
    public List<Car> getCarsMatchingCriteria(String brand, String model) {
        List<Car> matchingCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equals(brand) && car.getModel().equals(model)) {
                matchingCars.add(car);
            }
        }
        return matchingCars;
    }

    // Method to get available cars between two given dates
    public List<Car> getAvailableCars(Date startDate, Date endDate) {
        List<Car> availableCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.isAvailable() && isCarAvailableForDates(car.getId(), startDate, endDate)) {
                availableCars.add(car);
            }
        }
        return availableCars;
    }

    // Helper method to check if a car is available for the specified dates
    private boolean isCarAvailableForDates(int carId, Date startDate, Date endDate) {
        for (Booking booking : bookings) {
            if (booking.getCarId() == carId &&
                    (startDate.before(booking.getEndDate()) && endDate.after(booking.getStartDate()))) {
                return false; // Car is booked for some part of the requested period
            }
        }
        return true; // Car is available for the entire period
    }

    // Method to book a car with concurrency handling
    public boolean bookCar(int userId, int carId, Date startDate, Date endDate) {
        lock.lock();
        try {
            if (isCarAvailableForDates(carId, startDate, endDate)) {
                bookings.add(new Booking(userId, carId, startDate, endDate));
                for (Car car : cars) {
                    if (car.getId() == carId) {
                        car.setAvailable(false);
                        return true; // Booking successful
                    }
                }
            }
            return false; // Car is not available for the specified dates
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws ParseException {
        CarRentalSystem rentalSystem = new CarRentalSystem();
        rentalSystem.addCar(1, "Toyota", "Camry");
        rentalSystem.addCar(2, "Honda", "Civic");
        rentalSystem.addCar(3, "Ford", "Mustang");

        // Example usage:
        List<Car> matchingCars = rentalSystem.getCarsMatchingCriteria("Toyota", "Camry");
        System.out.println("Matching Cars: " + matchingCars);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = simpleDateFormat.parse("2020-01-01");
        Date endDate = simpleDateFormat.parse("2020-01-05");
        List<Car> availableCars = rentalSystem.getAvailableCars(startDate, endDate);
        System.out.println("Available Cars: " + availableCars);

        boolean bookingResult = rentalSystem.bookCar(1, 1, startDate, endDate);
        System.out.println("Booking Result: " + bookingResult);
    }
}

