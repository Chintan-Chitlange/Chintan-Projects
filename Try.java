import java.util.Scanner;
public class Try
{
    void one()
    {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        int n= str.length();
        int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0;
        for(int x=0;x<n;x++)
        {
            if (str.charAt(x)=='a')
            {
                a++;
            }
            else if (str.charAt(x)=='e')
            {
                e++;
            }
            else if (str.charAt(x)=='i')
            {
                i++;
            }
            else if (str.charAt(x)=='o')
            {
                o++;
            }
            else if (str.charAt(x)=='u')
            {
                u++;
            }
            else
            {
                int count;
            }
        }
        System.out.println("a : "+a);
        System.out.println("e : "+e);
        System.out.println("i : "+i);
        System.out.println("o : "+o);
        System.out.println("u : "+u);
    }
    public static void main()
    {
        Try obj=new Try();
        obj.one();
    }
}