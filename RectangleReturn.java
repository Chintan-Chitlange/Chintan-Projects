public class RectangleReturn
{
    int len,breadth;
    double ans;
    void init (int length, int breadth1)
    {
        len=length;
        breadth=breadth1;
    }
    double calc()
    {
        ans=len*breadth;  
        return ans;
    }
    public static void main()
    {
        RectangleReturn obj=new RectangleReturn();
        obj.init(2,3);
        double result=obj.calc();
        System.out.println(result);
    }
}