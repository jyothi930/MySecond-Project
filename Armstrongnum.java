import java.util.*;
class Armstrongnum
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
       int n,i=0;
      System.out.println("enter the value of n");
       n=sc.nextInt();
      
      int temp1=i;
      int  temp2=i;
      int count=0;
      for(i=100;i<=2000;i++)
     {
       for(;temp1>0;)

      temp1=temp1/10;
      count++;
      }
       double sum=0;
      for(;temp2>0;)

     {
        int rem=temp2%10;
       sum=sum+Math.pow(rem,count);
        temp2=temp2/10;
     }
      if(sum==i)
       System.out.println(i+" ");
     

}
}


     
     