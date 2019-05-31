import java.util.*;
public class GreatOnRight {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int[] a = new int[n];
for(int i=0;i<=n;i++) {
for(int j=i+1;j<=n;j++) {
a[i] = in.nextInt();
System.out.println(a[i]);
//Arrays.sort(a[j]);
System.out.println(a[j]);
}
}
}
}
