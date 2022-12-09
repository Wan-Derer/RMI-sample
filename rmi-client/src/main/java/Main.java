import model.Car;
import model.Person;
import rmi.RmiInterface;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

  public static final String UNIC_BINDING_NAME = "server.rmi";

  public static void main(String[] args) throws RemoteException, NotBoundException {

    //создание реестра расшареных объетов
    final Registry registry = LocateRegistry.getRegistry(50051);

    //получаем объект (на самом деле это proxy-объект)
    RmiInterface service = (RmiInterface) registry.lookup(UNIC_BINDING_NAME);

    //Вызываем удаленный метод
    System.out.println(service.hello());

    Car car = service.getCarById(11);
    System.out.println(car);

    Person person = service.getPersonByIdAndCar(111, car);
    System.out.println(person);


  }


}
