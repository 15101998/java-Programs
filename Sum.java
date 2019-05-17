import java.util.*;
public class Sum {
public static void main(String[] args) {
int temp,sum=0,rem;
Scanner in = new Scanner(System.in);
int n = in.nextInt();
temp = n;
while(temp!=0) {
rem = temp%10;
sum = sum +rem;
temp = temp/10;
}
System.out.println(sum);
}
}
