import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int b,e,power = 1;
      Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        e = sc.nextInt();
        while(e != 0)
        {
          power = power * b;
          e--;
        }
       System.out.println(power);
        
    }
}