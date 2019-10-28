//A program to replace 'e' with '*'
import java.io.*;
class replace
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int a,b;
String n;
char ch;
System.out.println("Enter the string");
n=in.readLine();
b=n.length();
for(a=0;a<b;a++)
{
ch=n.charAt(a);
{
if(ch=='e')
ch='*';
}
System.out.print(ch);
}
System.out.println();
}
}