

import java.util.*;

class Buying2{
   public static void main(String[] args){
      Scanner scan=new Scanner(System.in);
      int t=scan.nextInt();
      while(t-- > 0){
         int N=scan.nextInt();
         int X=scan.nextInt();
         int[] curnvalues=new int[N];
         int sum=0;
         for(int i=0;i<N;i++){
            curnvalues[i]=scan.nextInt();
            sum+=curnvalues[i];
         }
         int sol=sum/X;
         int rem=sum%X;
         int flag=0;
          for(int temp:curnvalues){
             if(temp<=rem){
               System.out.println("-1");
               flag=1;
               break;
             }
          }
          if(flag==0){
            System.out.println(sol);
          }
      }
      scan.close();
   }
} 