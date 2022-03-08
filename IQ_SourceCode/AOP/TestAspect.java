public aspect TestAspect 
{

  pointcut outputLog() : call(public void helloWorld());

  before() : outputLog() 
  {
    System.out.println("Calling Aspect.....");
  }
}






