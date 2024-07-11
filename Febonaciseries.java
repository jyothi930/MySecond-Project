import java.util.*;
class Primeornot
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n,i,count=0;
    i=1;
    do
    {
      if(n%i==0)
       count++;
       i++;
    }while(i<=n);
    if(count==2)
      System.out.println(n+"is a prime number");
    else
      System.out.println(n+"is not a prime number");
  }
}