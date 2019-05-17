import java.util.*;
public class Prime {
public static void main(String[] args) {
int i,j,k=0,flag=0;
Scanner in = new Scanner(System.in);
int a = in.nextInt();
int b = in.nextInt();
for(i=a;i<=b;i++) {
if(i==2)
flag=1;
for(j=2;j<i;j++) {
if(i%j==0) {
flag=0;
break;
}
else {
flag=1;
}
}
if(flag==1) {
System.out.println(i);
k=i;
}
}
System.out.println(k);
}
}
