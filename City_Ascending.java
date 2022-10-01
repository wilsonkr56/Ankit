import java.io.*;
class City_Ascending
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int i,j;
String a[]=new String[10];
String x=" ";
for(i=0;i<10;i++)
{
System.out.println("Enter the names of ten States : ");
a[i]=in.readLine();
}
for(i=0;i<9;i++)
{
for(j=i+1;j<10;j++)
{
if(a[i].compareTo(a[j])>0)
{
x=a[i];
a[i]=a[j];
a[j]=x;
}
}
}
System.out.println("The city names in ascending order are :");
for(i=0;i<10;i++)
System.out.println(a[i]);
}
}
