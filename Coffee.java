import java.util.*;
public class Coffee {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int a = in.nextInt();
for(int i=1;i<a;i++) {
n=n/2;
}
System.out.println(n);
}
}