package Hello;

import javax.ejb.SessionContext;

public class HelloBean implements javax.ejb.SessionBean
{ 
    private SessionContext ctx;
    
    public void ejbCreate() { 
        System.out.println("You are inside ejbCreate()");
    } 
    
    public void ejbRemove() { 
        System.out.println("You are inside ejbRemove()");
    } 
    
    public void ejbActivate() { 
        System.out.println("You are inside ejbActivate()");
    } 
    
    public void ejbPassivate() { 
        System.out.println("You are inside ejbPassivate()");
    } 
    
    public void setSessionContext(javax.ejb.SessionContext ctx) { 
        this.ctx = ctx;
    } 
    
    
    public String hello() 
    { 
        return "Hello to everyone and welcome to the Interview question series";
    } 
} 
