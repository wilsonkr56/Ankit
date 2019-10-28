class Employee
{
public static void main(double ba)   //Enter the basic salary
{
double da,hra,pf,np,gp;
da=(25/100)*ba;
hra=(15/100)*ba;
pf=(8.33/100)*ba;
np=ba+da+hra;
gp=np-pf;
System.out.println("Gross pay of the employee is "+gp);
}
}