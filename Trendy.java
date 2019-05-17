import java.util.*;
public class Trendy {
public static void main(String[] args) {
int a,b;
Scanner in = new Scanner(System.in);
int n = in.nextInt();
a = n%100;
b = a/10;
if(b%3==0)
System.out.println("Trendy Number");
else
System.out.println("Not a Trendy Number");
}
}