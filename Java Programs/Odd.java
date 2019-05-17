import java.util.*;
public class Odd {
public static void main(String[] args) {
int count=0,a,i;
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int m = in.nextInt();
for(i=0;i<=n;i++) {
if(i%2!=0) 
count++;
}
a = count*m;
System.out.println(a);
}
}
