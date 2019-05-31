import java.util.*;
public class Divi {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int n1 = in.nextInt();
int n2 = in.nextInt();
int count=0;
for(int i=n;i<=n1;i++) {
if(i%n2 == 0)
count++;
}
System.out.println(count);
}
}