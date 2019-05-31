import java.util.*;
public class Tim {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
String s1 = in.nextLine();
int h=0,m=0,s=0;
String j = "",p="",k="";
for(int i=0;i<s1.length();i++) {
h = Integer.parseInt(s1.substring(0,2));
m = Integer.parseInt(s1.substring(3,5));
s = Integer.parseInt(s1.substring(6,8));
}
if(s1.contains("PM") && (h<12)) {
h = h+12;
if(m<10)
j = "0" +m;
if(s<10)
p = "0"+s;
else
p+=s;
System.out.println(h+":"+j+":"+p);
}
if(s1.contains("PM") && (h==12)) {
h = 12;
if(m<10)
j = "0" +m;
if(s<10)
p = "0"+s;
else
p+=s;
System.out.println(h+":"+j+":"+p);
}
if(s1.contains("AM") && (h>=12)) {
h = h-12;
if(h==0)
k = "0"+h;
j = "0" +m;
if(m<10)
j = "0" +m;
if(s<10)
p = "0"+s;
else
p+=s;
System.out.println(k+":"+j+":"+p);
}
}
}
