import java.util.*;
 
public class clsExampleClone implements Cloneable 
{
  int myNum;
  // Array aggregated inside the object
  Integer [] myArray;
  // Constructor loads array of iteger values
  clsExampleClone (int nElements) 
  {
    myNum = nElements;
    myArray = new Integer[myNum];
    Random ran = new Random ();
    for (int i=0; i < myNum; i++)
    {myArray[i] = new Integer (ran.nextInt (10000));}
  } 
  // Override the clone object with Implementation
  public Object clone () 
  {
    try  
    {
    return super.clone ();
    }
    catch (CloneNotSupportedException e) 
    {throw new Error ("Clone Error");}
  } 
  

}