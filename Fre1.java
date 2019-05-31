import java.util.*;
public class Fre1 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int[] a = new int[n];
int[] count = new int[n];
for(int i=0;i<n;i++) {
a[i] = in.nextInt();
}
for(int i=0;i<n;i++) {
int count1=0;
for(int j=0;j<n;j++) {
if(a[i] == a[j])
count1++;
}
count[i] = count1;
}
for(int i=0;i<n;i++) {
int temp=0,temp1=0;
for(int j=0;j<n;j++) {
if(count[i]>count[j]) {
temp = count[i];
count[i] = count[j];
count[j] = temp;
temp1 = a[i];
a[i] = a[j];
a[j] = temp1;
}
if(count[i] == count[j]) {
int temp2=0;
if(a[i] < a[j]) {
temp2 = a[i];
a[i] = a[j];
a[j] = temp2;
}
}
}
}
System.out.println(a[0]);
}
}