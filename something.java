import java .util.Scanner;
// replaces the word red from the statement and places green instead.
public class something
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            String str=sc.next();
            if(str.equals("red"))
            {
                str = "green" ;
                System.out.print(str+" ");
                continue;
            }
            System.out.print(str+" ");
            if(str.equals("."))
            break;
        }
    }
}