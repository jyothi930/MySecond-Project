import java.util.*;
class Equalornot
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
     int i,n,s=0,p=1,rem;
     System.out.println("enter the value of n");
      n=sc.nextInt();
     while(n>0)
     {
      rem=n%10;
       s=s+rem;
      p=p*rem;
      n=n/10;
    }
    if(s==p)
     {
     System.out.println("sum of digits and products are equal");
     }
    else
    {
     System.out.println("sum of digits and products are not");

    }
    
  }
}
    
   