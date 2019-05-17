import java.util.*;
public class Count {
public static void main(String[] args) {
int count =0,i,j;
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int m = in.nextInt();
int a = in.nextInt();
for(i=n+1;i<m;i++) {
for(j=i;j>0;j=j/10) {
if(j%10==a)
count++;
}
}
System.out.println(count);
}
}
