import java.util.Scanner;
public class SelectionSort
{
    static void sort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            // Assuming minimum index is at 'i' index.
            int minIdx=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minIdx])
                {
                    minIdx=j;
                }
            }
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
        SelectionSort.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}