import java.rmi.*;

public class ConvertorImpl extends java.rmi.server.UnicastRemoteObject implements Convertor{

    public ConvertorImpl() throws java.rmi.RemoteException {

    }
    public float con(float rup) throws java.rmi.RemoteException{

        return rup / 60;
    }
}
