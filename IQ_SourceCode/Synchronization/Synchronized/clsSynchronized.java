class clsSynchronized
{
    double intCount;

    synchronized void Safe()
    {   
    	intCount++;
    }

    public void UnSafe()    
    {        
    	intCount++;        
    }                       
}

