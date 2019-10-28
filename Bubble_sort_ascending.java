import java.io.*;
class Bubble_sort_ascending
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int i,j,x;
int a[]=new int[5];
for(i=0;i<5;i++) 
{
System.out.println("Enter the number in the cells");
a[i]=Integer.parseInt(in.readLine());
}
for(i=0;i<4;i++)
{
for(j=0;j<(4-i);j++)
{
if(a[j]>a[j+1])
{
x=a[j];
a[j]=a[j+1];
a[j+1]=x;
}
}
}
System.out.println("The number in ascending order are");
for(i=0;i<5;i++)
System.out.println(a[i]);
}
}