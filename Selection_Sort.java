import java.util.*;
class Selection_Sort
{
public static void main()
{
Scanner in=new Scanner(System.in);
int i,j,x,min;
int a[]=new int[10];
for(i=0;i<10;i++)
{
System.out.println("Enter the number");
a[i]=in.nextInt();
}
for(i=0;i<9;i++)
{
min=i;
for(j=0;j<10;j++)
{
if(a[j]<a[min])
min=j;
}
x=a[i];
a[i]=a[min];
a[min]=x;
}
System.out.println("The number in ascending order are");
for(i=0;i<10;i++)
System.out.println(a[i]);
}
}