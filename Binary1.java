import java.util.*;
public class Binary1 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
String x = "";
int a=0;
for(int i=1;i<=n;i++) {
int b = i,count=0;
while(b!=0) {
a = b%2;
x = x + a;
b = b / 2;
}
System.out.println(x);
}
}
}