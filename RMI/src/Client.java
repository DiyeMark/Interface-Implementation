import java.net.*;
import java.rmi.Naming;
import java.util.Objects;

public class Client {
    public static void main(String args[]){
        try {
            Object obj = Naming.lookup("xyz");
            Convertor c = (Convertor)obj;
            System.out.println(c.con(120));
        }
        catch (Exception e){
            e.getMessage();
        }
    }
}
