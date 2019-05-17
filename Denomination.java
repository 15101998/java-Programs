import java.util.*;
public class Denomination {
public static void main(String[] args) {
int a,b,c,d,e,f,g,h;
a=b=c=d=e=f=g=h=0;
Scanner in = new Scanner(System.in);
int n = in.nextInt();
if(n>=500) {
a = n/500;
n = n - a * 500;
}
if(n>=100) {
b = n/100;
n = n - b * 100;
}
if(n>=50) {
c = n/50;
n = n - c * 50;
}
if(n>=20) {
d = n/20;
n = n - d * 20;
}
if(n>=10) {
e = n/10;
n = n - e * 10;
}
if(n>=5) {
f = n/5;
n = n - f * 5;
}
if(n>=2) {
g = n/2;
n = n - g * 2;
}
if(n>=1) {
h=n;
}
System.out.println("Total Number of Notes : ");
System.out.println("500 = "+a);
System.out.println("100 = "+b);
System.out.println("50 = "+c);
System.out.println("20 = "+d);
System.out.println("10 = "+e);
System.out.println("5 = "+f);
System.out.println("2 = "+g);
System.out.println("1 = "+h);
}
}


