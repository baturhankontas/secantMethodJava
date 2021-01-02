import java.util.*;

public class SecantMethod {
	public static void main(String argv[]) {
		Scanner scan=new Scanner(System.in);
	    double t_criteria = Math.pow(10, -16); 
	    double dx = 1;
	    System.out.println("Please enter first value");     //first value for range
	    double x0=scan.nextDouble();						//scan first value
	    System.out.println("Please enter second value");	//second value for range
	    double x1=scan.nextDouble();						//scan second value
	    System.out.println("Termination criteria will be taken as 10^-16 \n ");		//showing termination criteria
	    x0 = secant(t_criteria, x0,x1, dx);					//calling secant method with variables
	    System.out.println("\n\nRequired root is " + x0);	//after calculation giving roots for given equation 
	  }
	public static double secant(double t_criteria, double x0,double x1, double x) {
	    int n=1;
	    double x2=0;
	    while ((Math.abs(x)>t_criteria) && f(x2)!=0) {		// while loop check did we reach tc or not yet
	      double d = f(x1)-f(x0);							// looking between ranges
	       x2 = x1-f(x1)*(x1-x0)/d;							// calculating
	      x0  = x1;											//replacing range 					
	      x1 = x2;											//replacing range
	      x = x1-x0;				
	      System.out.println("Iteration no: " + n + "\t x = "+ x1 );	//giving the value of after every iteration
	      n++;															//increasing iteration time
	    }
	    return x1;
	  }
	  public static double f(double x) {
		  return Math.exp(2*x)-(3*Math.sin(x))-(6*Math.pow(x,3))-0.432506; //gives equation to us
	  }
}
