import java.util.Scanner;
public class bankAccount
{
    int[] one()
    {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        int n= str.length();
        int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0;
        str.toLowerCase();
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
        int arr[]=new int[5];
        arr[0]=a;
        arr[1]=e;
        arr[2]=i;
        arr[3]=o;
        arr[4]=u;
        return arr;
    }
    public static void main()
    {
        bankAccount obj=new bankAccount();
        int arr[]=obj.one();
        System.out.println("a : "+arr[0]);
        System.out.println("e : "+arr[1]);
        System.out.println("i : "+arr[2]);
        System.out.println("o : "+arr[3]);
        System.out.println("u : "+arr[4]);
    }
}