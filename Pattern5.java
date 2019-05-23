import java.util.Scanner ;
public class Pattern5 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int k=0;
for(int i=1;i<=n;i++) {
for(int j=1;j<=i;j++) {
k++;
System.out.print(k+" ");
}
System.out.println();
}
}
}