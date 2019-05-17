import java.util.*;
public class Lcm {
public static void main(String[] args) {
int lcm,gcd;
Scanner in = new Scanner(System.in) 
int a = in.nextInt();
int b = in.nextInt();
for(i=1;i<=n1 && i<=n2;++i) {
if(a%i==0 && b%i==0) {
gcd=i;
}
}
System.out.println(gcd);
lcm=a*b/gcd;
System.out.println(lcm);
}
}

