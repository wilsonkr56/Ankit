import java.io.*;
class Selection_Sort_descending
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int i,j,x,min;
int a[]=new int[5];
for(i=0;i<5;i++)
{
System.out.println("Enter the number in the cell");
a[i]=Integer.parseInt(in.readLine());
}
for(i=0;i<4;i++)
{
min=i;
for(j=i+1;j<5;j++)
{
if(a[j]>a[min])
min=j;
}
x=a[i];
a[i]=a[min];
a[min]=x;
}
System.out.println("The number arranged in descending order are");
for(i=0;i<5;i++)
System.out.println(a[i]);
}
}