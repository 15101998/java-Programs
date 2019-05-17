import java.util.*;
public class Palindrome {
public static void main(String[] args) {
String str=" ",rev="";
int i;
Scanner in = new Scanner(System.in);
str = in.nextLine();
int n=str.length();
for(i=n-1;i>=0;i--) {
rev = rev + str.charAt(i);
}
System.out.println(rev);
if(str.equals(rev))
System.out.println("Palindrome");
else
System.out.println("Not a Palindrome");
}
}