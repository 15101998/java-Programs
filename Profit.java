import java.util.*;
public class Profit {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int[] a = new int[n];
for(int i=0;i<n;i++) {
a[i] = in.nextInt();
}
for(int i=0;i<n;i++) {
Arrays.sort(a);
}
int b;
b = a[n-1] - a[0];
System.out.println(b);
}
}