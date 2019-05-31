import java.util.*;
public class Up {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
String a = in.nextLine();
String[] c = a.split(" ");
String[] b = new String[a.length()];
for(int i=0;i<c.length;i++) {
for(int j=0;j<c[i].length();j++) {
b[i] = c[i].toUpperCase();
if(j==0)
System.out.print(b[i].charAt(j));
for( j=1;j<c[i].length();j++) {
System.out.print(c[i].charAt(j));
}
break;
}
System.out.print(" ");
}
}
}