import java.io.*;
class Even_cell_Array
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int a[]=new int[8];
int i;
System.out.println("Enter the number in the cell");
for(i=0 ;i<8 ;i++)
a[i] = Integer.parseInt(in.readLine());
for(i=0;i<8;i++)
if(i%2==0)
System.out.println(a[i]);
}
} 
