import java.util.Scanner;
public class Foobar {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter the integer : ");
int a = in.nextInt();
if(a%7==0 && a%3==0)
System.out.println("foobar");
else if(a%7==0)
System.out.println("bar");
else if(a%3==0)
System.out.println("foo");
else
System.out.println("none");
}
}
