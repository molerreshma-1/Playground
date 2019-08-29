import java.util.Scanner;
public class Main
{
public static void main(String[] args) 

{
int i,j,r,c;
Scanner sc = new Scanner(System.in);
r = sc.nextInt();
c = sc.nextInt();

 for(i = r;i>0;i--)
 {
     for(j = c;j>0;j--)
     {
         if(i<=j)
         {
             System.out.print(j);
         }
         else
         System.out.print(i);
     }
     System.out.println();
     
 }
 }}