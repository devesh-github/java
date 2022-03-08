package Hello;
import java.rmi.RemoteException;
import javax.ejb.EJBObject;
public interface HelloInterFace extends javax.ejb.EJBObject
{ 
	public String hello() throws java.rmi.RemoteException;
} 

