import java.util.Scanner;
public class Trendy {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int a = in.nextInt();
int b,c;
if(a>=100 && a<=999) {
b=a/10;
c=b%10;
}
if(c%3==0)
System.out.println("Trendy");
else
System.out.println("Not Trendy");
}
}

