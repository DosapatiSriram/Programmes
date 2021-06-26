

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {
	
	 public void method(){
		 final int val;
		 val=10;
		 System.out.println(val);
	 }
	
	public static void main(String arg[]) {
	
		Sample obj=new Sample();
		obj.method();
		
		String a="meow";
		String ab=a+"deal";
		String abc="meowdeal";
		String[] arr={"meow","deal","sdfghj"};
		System.out.println(arr[0]==a);
		System.out.println(ab==abc);
		System.out.println(ab.hashCode());
		System.out.println(abc.hashCode());
		System.out.println(arr[0].hashCode());
		System.out.println(a.hashCode());
		
		//System.out.println(isAuthorized());
	}

	
	private static boolean isAuthorized() {
		boolean isAuthorized = false;
		
		List<String> authorizedGroups = new ArrayList<String>(); 
		
		authorizedGroups.add("DA_CIPFACETS_ALL");
		
		
		authorizedGroups.add("unx_ach_apsrs5582");
		
		authorizedGroups.add("DA_DENTALSIEBEL_ALL");
		
		Map<String,List<String>> groupUrisMap = new HashMap<String,List<String>>();
		String[] urls = {"*"};
		groupUrisMap.put("DA_CIPFACETS_ALL", Arrays.asList(urls));
		

		

		String requestUri = "/CIPFacets/loginUser";
		String contextPath = "/CIPFacets";
		
		System.out.println("Request URI---"+requestUri);
		System.out.println("CONTEXT PATH---"+contextPath);
		
		if(requestUri.equals(contextPath+"/")) {
			//Going to home page
			String accessGroups = "DA_CIPFACETS_ALL";
			for (String accessGroup : authorizedGroups) {
				if(accessGroups.contains(accessGroup)) {
					if (!isAuthorized)
						isAuthorized = true;
				}
			}
		} else {
			for (String accessGroup : authorizedGroups) {
				if (groupUrisMap.containsKey(accessGroup)) {
					for (String mappedUri : groupUrisMap.get(accessGroup)) {
						System.out.println(mappedUri);
						if (mappedUri.equals("*")) {
							if (!isAuthorized)
								isAuthorized = true;
						} else if (requestUri.matches(contextPath+"/"+mappedUri)) {
							if (!isAuthorized)
								isAuthorized = true;
						}
					}
				} else {
					isAuthorized = false;
				}
			}
		}

		return isAuthorized;
	}
}
