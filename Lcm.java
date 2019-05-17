import java.util.*;
public class Lcm {
	    public static void main(String[] args) {
	    int a=0,lcm,b=0,gcd;
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		if(n1>n2) {		
	    a=n1;
		b=n2;
		}
		if(n2>n1) {
		a=n2;
		b=n1;
		}
		gcd = a%b;
		if(b%gcd==0)
	    System.out.println(gcd);
	    lcm=(n1*n2)/gcd;
	    System.out.println(lcm);
	    }
}


