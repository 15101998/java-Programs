import java.util.*;
public class Tym {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
String a = in.nextLine();
String[] b = a.split(":");
int h=0,m=0,s=0;
for(int i=0;i<b.length;i++) {
h = Integer.parseInt(a.substring(0,2));
m = Integer.parseInt(a.substring(3,5));
s = Integer.parseInt(a.substring(6,8));
}
if(a.contains("PM") && h<12 && m>9 && s>9) {
h = h + 12;
System.out.println(h+":"+m+":"+s);
}
if(a.contains("PM") && m<=9 && s>9 && h<12){
h = h+12;
System.out.println(h+":"+"0"+m+":"+s);
}
if(a.contains("PM") && s<=9 && m>9 && h<12) {
h = h+12;
System.out.println(h+":"+m+":"+"0"+s);
}
if(a.contains("PM") && m<9 && s<9 && h<12) {
h = h+12;
System.out.println(h+":"+"0"+m+":"+"0"+s);
}
if(a.contains("AM") && h==12){
System.out.println("00"+":"+m+":"+s);
}
if(a.contains("PM") && h==12){
System.out.println(h+":"+m+":"+s);
}
if(a.contains("PM") && h>12 && m>9 && s>9) {
h = h + 0;
System.out.println(h+":"+m+":"+s);
}
if(a.contains("PM") && m<=9 && s>9 && h>12){
h = h+0;
System.out.println(h+":"+"0"+m+":"+s);
}
if(a.contains("PM") && s<=9 && m>9 && h>12) {
h = h+0;
System.out.println(h+":"+m+":"+"0"+s);
}
if(a.contains("PM") && m<9 && s<9 && h>12) {
h = h+0;
System.out.println(h+":"+"0"+m+":"+"0"+s);
} 
}
}