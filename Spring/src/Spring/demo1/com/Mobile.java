package Spring.demo1.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ClassPathXmlApplicationContext;
//support.ClassPathXmlApplicationContext;


public class Mobile 
{
    public static  void main(String[] args) 
    {
		
    	ApplicationContext context =new org.springframework.context.support.ClassPathXmlApplicationContext("beans.xml");
    	System.out.println("config loaded");
    	Airtel air =(Airtel)context.getbean("airtel");
    	air.calling();
    	air.data();
	}
}
