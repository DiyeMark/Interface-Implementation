import java.net.*;
import java.rmi.Naming;

public class Server {
    public Server(){
        try {
            Convertor c = new ConvertorImpl();
            Naming.rebind("xyz", c);
            System.out.println("Server Started");
        }
        catch (Exception e){
            System.out.println(e.toString());
            e.getMessage();
        }
    }
    public static void main(String args[] ){
        new Server();
    }
}
