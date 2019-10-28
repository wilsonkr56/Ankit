import java.util.*;
class Pattern9
{
public static void main()
{
Scanner in=new Scanner(System.in);
int a,b,p,k=1;
String st;
System.out.println("Enter the word for pattern");
st=in.next();
b=st.length();
for(a=b;a>=0;a--)
{
for(p=1;p<=k;p++)
{
System.out.println(st.substring(0,a));
k++;
}
}
}
}