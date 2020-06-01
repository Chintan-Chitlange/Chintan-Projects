public class nested1
{
    public static void main()
    {
        int x1=1;
        for (int i=5;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                int x = x1;
                System.out.print(x);
            }
            System.out.println("");
            x1++;
        }
    }
}