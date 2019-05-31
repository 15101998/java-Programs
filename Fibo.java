import java.util.*;
public class Fibo {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int i,first=0,second=1,next=0,count = 0;
for(i=0;i<=n;i++) {
if(i<=1)
next=i;
else {
next = first + second;
first = second;
second = next;
}
if(next == n) {
count=1;
break;
}
else {
count =0;
}
}
if(count==1)
System.out.println("True");
else
System.out.println("False");
}
}
