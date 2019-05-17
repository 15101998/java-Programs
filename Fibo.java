import java.util.*;
public class Fibo{
public static void main(String[] args) {
int i,first=0,second=1,next;
Scanner in = new Scanner(System.in);
int n = in.nextInt();
for(i=0;i<n;i++) {
if(i<=1) {
next=i;
}
else {
next = first+second;
first = second;
second = next;
}
System.out.println(next);
}
}
}
