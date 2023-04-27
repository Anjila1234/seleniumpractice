package javaselenium;

import java.util.Arrays;
import java.util.List;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] b1 = {1, 2, 3, 4, 5};	
//		
//		
//		for(int i = 0; i< b1.length; i ++) {
//			
//			if(b1[i] % 2 == 0) { //multiplication of 2
//			System.out.println(b1[i]);
//			break;
//		}
//			else {
//				System.out.println(b1[i]+ "is not multiplication of 2");
//			}
//		
//		}
//		
//	ArrayList <String> aa = new ArrayList <String>();	//creating object of the class-object.method
//		
//		aa.add("Anjila");
//		aa.add("Sampada");
//		aa.add("Bhagwati");
//		
//		aa.remove(2);
//		
//		System.out.println(aa);
//		
//		System.out.println(aa.get(1));
//		
//		
//		
//		//arraylist = size();
//		//array = length();
//		
//		for(int i = 0; i<aa.size(); i++) {
//			System.out.println(aa.get(i));
//		}
//		
//		
//		for (String b2 :aa){
//			System.out.println(b2);
//		}
//		
//		//item is present in ArrayList
//		System.out.println(aa.contains("Bhagwati"));
		
		String [] c1 = {"AK","BK", "CK", "DK"};
		
	List<String> namelist =	Arrays.asList(c1);
		
		
		System.out.println(namelist.contains("AK"));
		
		
		
		
	}

}
