import java.util.Scanner;
//WAOP to input a number and display the new number after reversing.It also displays the difference between the two numbers
public class ReversalSc
{
  int a,rem,rev=0,temp,diff1,diff2;
  void init()
  {
      Scanner sc= new Scanner(System.in);
      a =sc.nextInt();
      temp=a;
  }
  void calc()
  {
      while(temp!=0)
      {
          rem=temp%10;
          rev=rev*10+rem;
          temp=temp/10;
      }
      diff1=rev-a;
      diff2=a-rev;
  }
  void display()
  {
      if (diff1>0)
      {
          System.out.println("Reverse = "+rev+"\n "+"Absolute difference = "+diff1);
      }
      else
      {
          System.out.println("Reverse = "+rev+"\n"+"Absolute difference = "+diff2);
      }
  }
  public static void main()
  {
      ReversalSc obj=new ReversalSc();
      obj.init();
      obj.calc();
      obj.display();
  }
}