import java.util.Scanner;
public class Factor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number.");
        int i,N;
        if(sc.hasNextInt())
        {
            N=sc.nextInt();
            System.out.println("THE FACTOR OF "+N+" ARE : ");
            for(i=1;i<=N;i++)
            {
                if (N%i==0)
                {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
        else
        {
            System.out.println("A NON-INTEGER VALUE ENTERED");
        }
    }
}