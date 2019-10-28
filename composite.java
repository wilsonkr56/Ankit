class composite
{
public static void main(int n)
{
int a,c=0;
for(a=2;a<n;a++)
if(n%a==0)
c=c+1;
if(c>=1)
System.out.println("Number is composite");
else
System.out.println("Number is not composite");
}
}