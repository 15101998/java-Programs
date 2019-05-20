import java.util.*;
public class Split {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
String str = in.nextLine();
String str1 = in.nextLine();
String[] str2 = str.split(" ");
String str3 = "";
for(int i=0;i<str2.length;i++) {
if(!str2[i].equals(str1)) {
str3 = str3+str2[i]+" ";
} 
}
System.out.println(str3);
}
}
