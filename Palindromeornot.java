import java.util.*;
class Palindromeornot
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n,rem,rev=0,temp;
   System.out.println("enter the value of n");
   n=sc.nextInt();
    temp=n;
   while(n!=0)
    {
     rem=n%10;
     rev=rev*10+rem;
     n=n/10;
    }
     if(temp==rev)
      System.out.println("palindrome");
    else
      System.out.println("not a palindrome");

 }
}