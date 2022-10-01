import java.io.*;
class Alphabet_Ascending
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int i,j,p;
char a[]=new char[5];
char x;
String n,s=" ";
System.out.println("Enter the word : ");
n=in.readLine();
p=n.length();
for(i=0;i<p;i++)
a[i]=n.charAt(i);
{
for(i=0;i<(p-1);p++)
{
for(j=i+1;j<p;j++)
{
if(a[i]>(a[j]))
{
x=a[i];
a[i]=a[j];
a[j]=x;
}
}
}
System.out.println("The alphabets in the ascending order are");
for(i=0;i<p;i++)
s=s+a[i];
System.out.println(s);
}
}
}
