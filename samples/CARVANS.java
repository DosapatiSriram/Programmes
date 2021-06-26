

import java.util.*;
class CARVANS{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    
    while(t-- > 0){
      int n=scan.nextInt();
      int[] cars=new int[n];
      int count=1;
      for(int i=0;i<n;i++){
        cars[i]=scan.nextInt();
      }
      for(int i=1;i<n;i++){
        if(cars[i]< cars[i-1]){
          count++;
        }else{
          cars[i]=cars[i-1];
        }
      }
       System.out.println(count);
  
    }
    scan.close();
  }
} 