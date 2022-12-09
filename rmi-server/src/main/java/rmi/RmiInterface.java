package rmi;

import model.Car;
import model.Person;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiInterface extends Remote {

  String hello() throws RemoteException;

  Car getCarById(int carId) throws RemoteException;

  Person getPersonByIdAndCar(int personId, Car car) throws RemoteException;

}
