import java.io.*;
import java.util.*;
import java.awt.*;
public class clsDeepCloning
{
   // returns a deep copy of an object
   static public Object GetDeepCopy(Object myOldObj) throws Exception
   {
      ObjectOutputStream objoutstream = null;
      ObjectInputStream objinstream = null;
      try
      {
    	  // Create a output stream
         ByteArrayOutputStream bos = new ByteArrayOutputStream(); 
         objoutstream = new ObjectOutputStream(bos); 
         
         // Serialize you original object in to the output stream
         objoutstream.writeObject(myOldObj);   
         objoutstream.flush();
	
         // To read the object create a inputstream
         ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
         objinstream = new ObjectInputStream(bin);
         
         // and read the complete object
         return objinstream.readObject();}
      
      catch(Exception e)
      {throw(e);}
      finally
      {
         objoutstream.close();
         objinstream.close();
      }
   }
   
}

