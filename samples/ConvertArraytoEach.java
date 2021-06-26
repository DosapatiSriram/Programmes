

public class ConvertArraytoEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="[01:25000-Diabetes Mellitus Without Mention of Complication, Type II Or Unspecified Type, Not Stated As Uncontrolled              ^02:2449-Unspecified Acquired Hypothyroidism                                                                                     ^03:4019-Unspecified Essential Hypertension                                                                                      ^04:2724-Other and Unspecified Hyperlipidemia                                                                                    ^05:V5869-Long Term (Current) Use of Other Medications                                                                            ^06:V0481-Need for Prophylactic Vaccination and Inoculation, Influenza  ]";
		String[] strArr=new String[12];
		int[] modified=new int[12];
		if(str.contains("^")){
			strArr=str.substring(1,str.length()-1).split(",");
			
		}
		for(int i=0;i<strArr.length;i++){
			System.out.println(strArr[i]);
		}
		

	}

}
