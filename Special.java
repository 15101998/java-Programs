import java.util.*;
public class Special {
public static void main(String[] args) {
int a,b,c;
Scanner in = new Scanner(System.in);
int n = in.nextInt();
a = (n/10) + (n%10);
b = (n/10) * (n%10);
c = a + b;
if(c==n)
System.out.println("Special Number");
else
System.out.println("Not a Special Number");
}
}
