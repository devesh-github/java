class clsMaths {
  double PI;

   
  // This is the constructor for the maths constant class.
  clsMaths() 
  {
  PI = 3.14;
  }
   
 
  void MakeMyCircle(int intRadius) 
  {
	double dblCircle = 0;
    dblCircle =  PI * intRadius * intRadius;
    System.out.println(" Circle radius is " + dblCircle);
  }
}