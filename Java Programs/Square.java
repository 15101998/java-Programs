import java.util.*;
public class Square {
public static void main(String[] args) {
double b;
Scanner in = new Scanner(System.in);
int n = in.nextInt();
b = (int)Math.sqrt(n);
if(n==(b*b))
System.out.println("Perfect Square");
else
System.out.println("Not a Perfect Square");
}
}