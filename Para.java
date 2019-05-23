import java.util.*;
public class Para {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
String str = in.nextLine();
int a,b,c,d;
a = b = c = d = 0;
for(int i =0; i<str.length();i++) {

if(str.charAt(i) == '(')
a++;
else if(str.charAt(i) == ')')
a--;
else if(str.charAt(i) == '{')
b++;
else if(str.charAt(i) == '}')
b--;
else if(str.charAt(i) == '[')
c++;
else if(str.charAt(i) == ']')
c--;
else if(str.charAt(i) == '*')
d++;
}
int x,y,z = 0;
int count = a+b+c;
if(count == 0 && d%2 ==0)
System.out.println("balanced");
if(count > 0 && d ==0)
System.out.println("unbalanced");
else if(d>0){
x = d - Math.abs(a);
y = x - Math.abs(b);
z = y - Math.abs(c);
if( z >= 0 && z % 2 == 0)
System.out.println("balanced");
else
System.out.println("unbalanced");
}
}
}


