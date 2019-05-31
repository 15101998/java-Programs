import java.util.*;
public class Domi {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int[] a = new int[n];
int[] b = new int[n];
for(int i=0;i<n;i++) {
a[i] = in.nextInt();
}
int max=-1;
for(int i=0;i<n;i++) {
int count=0;
for(int j=0;j<n;j++) {
if(a[i] == a[j])
count++;
}
if(count>n/2)
b[i] = a[i];
}
for(int i=0;i<n;i++) {
if(max<b[i]) {
if(b[i] != 0)
max = b[i];
}
}
System.out.println(max);
}
}