 class Human{
   public void eat()
   {
      System.out.println("Human is eating");
   }
   public void drink()
   {
      System.out.println("Human is drinking");
   }
}
public class Boy extends Human{
   public void eat(){
      System.out.println("Boy is eating");
   }
   public static void main( String args[]) {
      Human obj = new Boy();
      obj.drink();
	  obj=(Boy)obj;
	  obj.drink();
	  obj=(Human)obj;
	  obj.drink();
	  
	  Boy b = (Boy) obj;
	  b.drink();
	  
      obj.eat();
   }
}