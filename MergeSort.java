import java.util.Scanner;
public class MergeSort
{
    static void sort_merge(int arr[],int l,int m,int r)
    {
        int s1=m-l+1;
        int s2=r-m;
        int lArr[]= new int[s1];
        int rArr[]=new int [s2];
        for(int i=0;i<s1;++i)
        {
            lArr[i]=arr[l+i];
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        int l=sc.nextInt();
        int m=sc.nextInt();
        int r=sc.nextInt();
        MergeSort.sort_merge(arr,l,m,r);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}