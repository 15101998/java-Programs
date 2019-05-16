import java.util.Scanner;
public class Prime {
public static void main(String[] args) {
int c,n;
Scanner in = new Scanner(System.in);
System.out.println("Enter a number : ");
n=in.nextInt();
if (n == 2) {
System.out.println("Prime Number");
}
else {
for(c = 2;c<=n;c++) {
if(n%c == 0) 
break;
}
if (c!=n) {
System.out.println("Not a Prime Number  ");
}
else {
System.out.println("Prime Number ");
}
}
}
}
