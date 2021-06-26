

import java.io.Serializable;

public class Singleton implements Serializable{
   private static Singleton instance;
   
   private Singleton(String name){this.name=name;}
   
   public String getName() {
	return name;
   }
   
   public Object readResolve(){
	   return getInstance(); 
   }

private transient String name;
   
   public static Singleton getInstance(){
	   
	   if(instance==null){
		   instance=new Singleton("abcd");
	   }
	   return instance;
   }

   /*public static void main(String[] args){

	   SingletonHold obj=SingletonHold.getInstance();
	   SingletonHold obj2=SingletonHold.getInstance();
	   
	   System.out.println(obj==obj2);
   }*/
}

class SingletonHold{
	
	private SingletonHold(){
		
	}
	
	private static class SingletonHolder{
	     private static SingletonHold instance=new SingletonHold();
	}
	
	public static SingletonHold getInstance(){
		return SingletonHolder.instance;
	}
}