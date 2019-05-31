import java.util.*;
public class Decode {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
for(int i=2;i<=n+1;i++) {
int num=1;
for(int j=1;j<=i;j++)  {
System.out.print(num+" ");
num = num*(i-j)/j;
}
System.out.println();
}
}
}