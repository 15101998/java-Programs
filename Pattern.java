import java.util.*;
public class Pattern {
public static void main(String[] args) {
int i,j;
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int k=1;
for(i=1;i<=n;i++) {
for(j=1;j<=i;j++) {
System.out.print(k+" ");
k++;
}
System.out.println();
}
}
}