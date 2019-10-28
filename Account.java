import java.util.*;
class Account
{
public static void main()
{
Scanner in=new Scanner(System.in);
System.out.println("Press 1 for Term Deposit");
System.out.println("Press 2 for Recurring Deposit");
System.out.println("Enter your choice");
int n=in.nextInt();
switch(n)
{
case 1:
System.out.println("Enter Principal"); 
double a=in.nextInt();
System.out.println("Enter Rate");
double b=in.nextInt();
System.out.println("Enter Time in year");
double c=in.nextInt();
double am=a*(Math.pow(1+b/100,c));
System.out.println(am);
break;
case 2:
System.out.println("Enter Monthly Installment"); 
double m=in.nextInt();
System.out.println("Enter Rate");
double r=in.nextInt();
System.out.println("Enter Time in month");
double t=in.nextInt();
double z=m*(t+m)*((t*(t+1))/2)*(t/100)*(1/12);
System.out.println(z);
break;
default:
System.out.println("Wrong Choice");
}
}
}