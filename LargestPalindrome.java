import java.util.*;
public class LargestPalindrome {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
String str = in.nextLine();
String str1 = "";
String[] str2 = str.split(" ");
String m="";
for(int i=0;i<str2.length;i++) {
String rev="";
for(int j=str2[i].length()-1;j>=0;j--) {
rev = rev+str2[i].charAt(j);
}
if(rev.length()>m.length())
m=rev;
}
System.out.println(m);
}
}
