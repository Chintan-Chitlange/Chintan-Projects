import java.util.Scanner;
public class LeapYear
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of years to check leap years");
        System.out.println("Enter smaller limit");
        int upplim=sc.nextInt();
        System.out.println("Enter larger limit");
        int lowlim=sc.nextInt();
        System.out.println("All the leap years are : ");
        for(int i=upplim;i<=lowlim;i++)
        {
            if(i%4==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}