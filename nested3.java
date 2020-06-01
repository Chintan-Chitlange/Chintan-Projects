public class nested3
{
    /**
       program to print theseries 5,10,17............*/
    public static void main()
    {
        int x=3;
        int s=2;
        for (int j=1;j<=50;j++)
        {
            s=s+x;
            System.out.print(s+",");
            x=x+2;
        }
    }
}