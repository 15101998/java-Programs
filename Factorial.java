import java.util.*;
public class Factorial {
public static void main(String[] args) {
int fact=1,i;
Scanner in = new Scanner(System.in);
int n = in.nextInt();
for(i=1;i<=n;i++) {
fact = fact*i;
}
System.out.println(fact);
}
}
