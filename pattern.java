import java.util.*;
class pattern
{
public static void main()
{
Scanner in=new Scanner(System.in);
int a,b;
String n;
System.out.println("Enter the word to print pattern");
n=in.nextLine();
b=n.length();
for(a=0;a<b;a++)
{
System.out.println(n.charAt(a));
}
}
}