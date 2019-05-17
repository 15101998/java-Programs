import java.util.*;
public class Compare {
public static void main(String[] args) {
String str1=" ",str2=" ";
int flag=0;
Scanner in = new Scanner(System.in);
str1 = in.nextLine();
str2 = in.nextLine();
int l;
if(str1.length()==str2.length()) {
for(int i = 1;i<=str1.length()-1;i++) {
if(str1.charAt(i)==str2.charAt(i)) 
flag = 1;
else
flag = 0;
}
}
if(flag==1)
System.out.println("Strings are equal");
if(flag==0 || (str1.length()!=str2.length()))
System.out.println("Strings are not equal");
}
}
