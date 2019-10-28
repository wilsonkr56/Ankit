import java.io.*;
class pattern2
{
public static void main()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int a,b,k=1,p;
String n;
System.out.println("Enter the word to print the pattern");
n=in.readLine();
b=n.length();
for(a=b;a>=0;a--)
{
for(p=1;p<=k;p++)
{
System.out.print(" ");
}
System.out.println(n.substring(0,a));
k++;
}
}
}