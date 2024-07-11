import java.util.*;
class Firstandlastdigit
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n,first_digit=0,last_digit=0,sum=0;
    System.out.println("enter the value of n");
    n=sc.nextInt();
    while(n>=10)
    {
     first_digit=n/10;
     }
     last_digit=n%10;
      sum=first_digit+last_digit;
      System.out.println("sum of first and last digits of a given number="+sum);
  }
}
       