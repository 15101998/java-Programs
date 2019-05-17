import java.util.*;
public class Minimum {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int a[] = new int[n];
int b[] = new int[n];
int i,temp,j,min;
for(i=0;i<n;i++) {
a[i] = in.nextInt();
}
for(i=0;i<n;i++) {
for(j=i+1;j<n;j++) {
if(a[i]>a[j]) {
temp = a[i];
a[i] = a[j];
a[j]=temp;
}
}
}
min = a[1]-a[0];
for(i=0;i<n-2;i++) {
if(min>a[i+2]-a[i+1])
min = a[i+2]-a[i+1];
}
System.out.println(min);
}
}
