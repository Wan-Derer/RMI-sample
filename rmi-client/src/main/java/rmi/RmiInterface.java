package rmi;

import model.Car;
import model.Person;

import java.rmi.Remote;

public interface RmiInterface extends Remote {

  String hello();

  Car getCarById(int carId);

  Person getPersonByIdAndCar(int personId, Car car);

}
