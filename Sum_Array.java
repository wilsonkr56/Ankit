import java.io.*;
class Sum_Array
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int i,s=0;
int a[]=new int[10];
for(i=0;i<10;i++)
{
System.out.println("Enter the number in the cell");
a[i]=Integer.parseInt(in.readLine());
}
for(i=0;i<10;i++)
{
if(a[i]%3==0||a[i]%5==0)
s=s+a[i];
}
System.out.println("The sum of the number is"+s);
}
}
