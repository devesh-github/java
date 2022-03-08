package Hello;
    
import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;
    

public class HelloClient { 
    
     public static void main(String[] args) throws Exception { 
          
    	 Properties properties = new Properties();		
    	 properties.put("java.naming.factory.initial","org.jnp.interfaces.NamingContextFactory");		
    	 properties.put("java.naming.factory.url.pkgs","=org.jboss.naming:org.jnp.interfaces");		
    	 properties.put("java.naming.provider.url","localhost:1099");		
          Context ctx = new InitialContext(properties);
          
          System.out.println("Got context");
          Object obj = ctx.lookup("hello/Hello");
          
          System.out.println("Got reference");
          HelloHome home = (HelloHome) javax.rmi.PortableRemoteObject.narrow(obj, HelloHome.class);
          
          HelloInterFace hello = home.create();
          System.out.println("Created Home object");
          
          System.out.println(hello.hello());
          System.out.println("Called the actual method");
          
          hello.remove();
          System.out.println("Removed the object from the container");
     } 
} 

