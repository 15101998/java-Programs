import java.util.*;
public class Armstrong {
public static void main(String[] args) {
int a=0,temp,sum=0,b,i;
Scanner in = new Scanner(System.in);
int n = in.nextInt();
temp = n;
while(n!=0) {
n = n/10;
a++;
}
n = temp;
while(n>0) {
b = n%10;
int m=1;
for(i=1;i<=a;i++) {
m = m*b;
}
sum = sum+m;
n = n/10;
}
if(sum==temp)
System.out.println("Armstrong Number");
else
System.out.println("Not a Armstrong Number");
}
}

