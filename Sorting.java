import java.util.*;
public class Sorting {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
String str1 = in.nextLine();
String str2 = in.nextLine();
char[] a = str1.toCharArray();
char[] b = str2.toCharArray();
Arrays.sort(a);
Arrays.sort(b);
int count=0;
for(int i = 0;i<a.length;i++) {
if(a[i]!=b[i]) {
count =1;
break;
}
}
if(count==0)
System.out.println("Anagram");
else
System.out.println("Not an Anagram");
}
}