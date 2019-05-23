import java.util.*;
public class Pattern8 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int a = 65;
for(int i=1;i<=n;i++) {
for(int j=1;j<=i;j++) {
System.out.print((char)a+" ");
}
a++;
System.out.println();
}
}
}