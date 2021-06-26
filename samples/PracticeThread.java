

import org.apache.poi.util.SystemOutLogger;



import java.io.*;
import java.util.*;
import java.util.concurrent.*;

class Producer implements Runnable{
	
	public void run(){
		try {
			Thread.sleep(1);
			System.out.println("producer");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Consumer implements Runnable{
	public void run(){
		System.out.println("consumer");
		
	}
}

class CallableSample implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		synchronized(this){
		wait();
		return "Hello World !!";
		}
	}
	
}

public class PracticeThread {
    static List<Integer> list=new ArrayList<Integer>();
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		// TODO Auto-generated method stub
          Runnable p=new Producer();
          Thread t1=new Thread(p);
          t1.start();
          
          ExecutorService exec=Executors.newFixedThreadPool(4);
         /* exec.submit(new Runnable(){
        	  public void run(){
        		  System.out.println("using anonymous function");
        	  }
          });*/
          
          Callable<String> obj=new CallableSample();
          
          //Thread t1=new Thread();
          
          //Future<String> result=exec.submit(obj);
          Future<String> result=exec.submit(new Callable<String>(){public String call(){return "Hi Callable anonymous";}});
          try{
          System.out.println(result.get(1000,TimeUnit.MILLISECONDS));
          }catch(TimeoutException e){
        	  System.out.println("Timed out !!");
          }
          
          /*new Thread(new Runnable(){
        	  public void run(){
        		  System.out.println("using anonymous function");
        	  }
          }).start();
          
          new Thread(() -> System.out.println("hvhvh")).start();*/
          Consumer c=new Consumer();
          Thread t2=new Thread(c);
          
          t2.start();
          
	}

}
