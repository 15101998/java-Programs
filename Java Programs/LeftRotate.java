import java.util.*;
public class LeftRotate {
public static void main(String[] args) {
int n,i,b;
Scanner in = new Scanner(System.in);
n = in.nextInt();
int a[] = new int[n];
b = in.nextInt();
for(i=0;i<a.length;i++) {
a[i] = in.nextInt();
}
for(i=0;i<b;i++) {
int j,first;
first=a[0];
for(j=0;j<a.length-1;j++) {
a[j] = a[j+1];
}
a[j] = first;
}
for(i=0;i<a.length;i++) {
System.out.println(a[i]);
}
}
}
