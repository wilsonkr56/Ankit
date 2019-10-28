import java.io.*;
class pattern1
{
public static void main()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int a,b;
String n;
System.out.println("Enter the word to print the pattern");
n=in.readLine();
b=n.length();
for(a=0;a<=b;a++)
{
System.out.println(n.substring(0,a));
}
}
} 