package rmi;

import model.Car;
import model.Person;

import java.rmi.RemoteException;

public class RmiImpl implements RmiInterface {

  @Override
  public String hello() throws RemoteException {
    return "Привет!";
  }

  @Override
  public Car getCarById(int carId) throws RemoteException {
    return Car.builder().id(carId).brandName("Tesla").model("Model 3").build();
  }

  @Override
  public Person getPersonByIdAndCar(int personId, Car car) throws RemoteException {
    return Person.builder().id(personId).name("Василий").age(25).car(car).build();
  }

}
