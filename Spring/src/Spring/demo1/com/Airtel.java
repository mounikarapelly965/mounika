package Spring.demo1.com;

public class Airtel implements Sim
{
	 public Airtel()
	 {
		System.out.println("airtel constructor calleds"); 
		
	 }
  public void calling() {
	  System.out.println("calling with airtel mobile");
  }
  public void data() {
	  System.out.println("browsing data with airtel");
  }
}
