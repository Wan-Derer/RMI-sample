import rmi.RmiImpl;
import rmi.RmiInterface;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {

  public static final String UNIC_BINDING_NAME = "server.rmi";

  public static void main(String[] args) throws RemoteException, AlreadyBoundException, InterruptedException {

    final RmiInterface rmiService = new RmiImpl();

    //создание реестра расшареных объектов
    final Registry registry = LocateRegistry.createRegistry(50051);

    //создание "заглушки" – приемника удаленных вызовов
    Remote stub = UnicastRemoteObject.exportObject(rmiService, 0);

    //регистрация "заглушки" в реестре
    registry.bind(UNIC_BINDING_NAME, stub);

    //усыпляем главный поток, иначе программа завершится
    Thread.sleep(Integer.MAX_VALUE);

  }
}
