package Hello;
import javax.ejb.EJBHome;
import javax.ejb.CreateException;
import java.rmi.RemoteException;

public interface HelloHome extends javax.ejb.EJBHome
{ 
    Hello.HelloInterFace create() throws 
    				java.rmi.RemoteException,
    				javax.ejb.CreateException;
} 