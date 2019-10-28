import java.io.*;
class Max_Min
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int i,max,min;
int a[]=new int[10];
for(i=0;i<10;i++)
{
System.out.println("Enter the number in the cells");
a[i]=Integer.parseInt(in.readLine());
}
max=a[0];min=a[0];
for(i=0;i<10;i++)
{
if(a[i]>max)
max=a[i];
if(a[i]<min)
min=a[i];
}
System.out.println("The greatest element is"+max);
System.out.println("The smallest element is"+min);
}
}