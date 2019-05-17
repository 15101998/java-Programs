import java.util.*;
public class Grade {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int a = in.nextInt();
if(a<=0 && a<=40)
System.out.println("U");
if(a>40 && a<=50)
System.out.println("D");
if(a>50 && a<=60)
System.out.println("C");
if(a>60 && a<=70)
System.out.println("B+");
if(a>70 && a<=80)
System.out.println("B");
if(a>80 && a<=90)
System.out.println("A");
if(a>90 && a<=100)
System.out.println("S");
if(a>100)
System.out.println("Invalid Mark");
}
}