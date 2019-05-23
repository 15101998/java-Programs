import java.util.*;
public class Suffix {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
String str = in.nextLine();
int n = str.length();
System.out.println(n);
int i = n/2,length = 0;
if(n < 2) {
System.out.println("");
}
while(i < n) {
if(str.charAt(i)==(str.charAt(length))) {
++i;
++length;
}
else {
if(length == 0) {
++i;
}
else
--length;
}
}
System.out.println(str.substring(0,length));
}
}