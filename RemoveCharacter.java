import java.util.*;
public class RemoveCharacter {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
String s = in.nextLine();
String s1 = in.nextLine();
char[] a = s.toCharArray();
char[] b = s1.toCharArray();
String s3 = "";
for(int i=0;i<a.length;i++) {
int count=0;
for(int j=0;j<b.length;j++) {
if(a[i]==b[j]) {
count++;
break;
}
}
if(count==0)  {
s3 = s3 + a[i];
}
}
System.out.println(s3);
}
}
