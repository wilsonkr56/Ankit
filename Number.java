import java.util.*;
class Number
{
public static void main()
{
Scanner in=new Scanner(System.in);
int n,s,p,m,a,b;
System.out.println("Enter the number");
n=in.nextInt();
a=n/10;
b=n%10;
s=a+b; //Sum of two digit
p=a*b; //Product of two digit
m=s+p;
if(m==n)
System.out.println("The no. is special");
else
System.out.println("The no. is not special");
}
}
