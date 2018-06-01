import java.rmi.Remote;

public interface Convertor extends java.rmi.Remote {
    public float con(float rup) throws java.rmi.RemoteException;
}
