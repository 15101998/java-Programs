import java.util.*;
public class Number {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
String a = in.nextLine();
char[] c = a.toCharArray();
int[] count = new int[a.length()];
for(int i=0;i<a.length();i++) {
count[i]=1;
for(int j=i+1;j<a.length();j++) {
if(c[i] == c[j]) {
count[i]++;
c[j] = '0';
}
}
}
for(int i=0;i<count.length;i++) {
if(c[i]!=' ' && c[i]!='0') 
System.out.println(c[i]+" = "+""+count[i]+" ");
}
}
}
