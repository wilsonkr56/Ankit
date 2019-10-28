import java.util.*;
class movieMagic
{
int year;
String title;
float rating;
public movieMagic()
{
year=0;
title="";
rating=0.0f;
}
void accept()
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the year");
year=in.nextInt();
System.out.println("Enter the title");
title=in.readLine();
System.out.println("Enter the rating");
rating=in.nextDouble();
}
void display()
{
System.out.println("Title is "+title);
{
if(rating>=0.0&&rating<=2.0)
{
System.out.println("Flop");
}
else if(rating>=2.1&&rating<=3.4)
{
System.out.println("Semi-hit");
}
else if(rating>=3.5&&rating<=4.5)
{
System.out.println("Hit");
}
else if(rating>=4.6&&rating<=5.0)
{
System.out.println("Super hit");
}
}
}
public static void main()
{
movieMagic a=new novieMagic();
a.accept();
a.display();
}
}