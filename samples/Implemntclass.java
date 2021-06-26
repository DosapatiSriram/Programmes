

class Implemntclass implements Interface_demo{
	
    public String method(String str){
    	return "sahchs";
    }
	
	public static void main(String[] args){
		//Interface_demo obj= ((str) -> str);
		//obj.method("sfs");
		System.out.println(new Interface_demo(){
			public String method(String str){
		    	return "sahchs";
		    }
		}.method("sjc"));
		
	}
}
