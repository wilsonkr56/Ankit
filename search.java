import java.io.*;
class search
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);

int i,k=0,n;
int a[]=new int[10];
for(i=0;i<10;i++)
{
System.out.println("Enter the number in the cell");
a[i]=Integer.parseInt(in.readLine());
}
System.out.println("Enter the number to be searched : ");
  Sysyem.out.println();
n=Integer.parseInt(in.readLine());
for(i=0;i<10;i++)
{
if(a[i]==n)
k=1;
}
if(k==1)
System.out.println("The number is present");
else
System.out.println("The number is not present");
}
}

