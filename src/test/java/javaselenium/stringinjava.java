package javaselenium;

public class stringinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Anjila Katuwal";
		String s1 = "Anjila Katuwal"; //instead of creating only one string is created with the same text
		//1- literal string -if the value are same it wont create another object
		
		String s3 = new String ("welcome");
		String s4 = new String ("welcome");//if both values are same only one will display
		
		// Using new memory allector - no matter the value is same it will create new space
		
//string is an object that represents the sequence of Character
		
		String a = "Sampada Pant";
String [] a2 =a.split(" ");
		
		System.out.println(a2[0]);
		
//		for(int i = 0; i< a.length(); i++) {
//			System.out.println(a.charAt(i));
//		}
		
		for(int j = a.length()-1; j<=0;  j--) {
			System.out.println(a.charAt(j));
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
