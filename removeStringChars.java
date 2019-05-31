import java.util.*;
public class removeStringChars {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int count = in.nextInt();
String[] s3 = new String[count];
String s1,s2;
Testcase[] test = new Testcase[count];
for(int i=0;i<count;i++) {
test[i] = new Testcase();
test[i].str1 = in.next();
test[i].str2 = in.next();
}
for(int i=0;i<count;i++) {
s1 = test[i].str1;
s2 = test[i].str2;

s3[i] = "";
for(int j=0;j<s1.length();j++) {
int count1=0;
for(int k=0;k<s2.length();k++) {
if(s1.charAt(j) == s2.charAt(k))
count1++;
}
if(count1==0) {
s3[i] = s3[i] + s1.charAt(j);
}
}
}
for(int i=0;i<count;i++) {
System.out.println(s3[i]);
}
}
}
class Testcase {
public String str1;
public String str2;
}
