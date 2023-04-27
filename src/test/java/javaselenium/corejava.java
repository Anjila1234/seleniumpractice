package javaselenium;

public class corejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5; //premetive data type
		String name = "Anjila"; //non-premetive
		char letter ='A';
		
		double dec = 5.99;  //float
		boolean card = true;
		
		System.out.println(num);
		System.out.println(name);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(card);
		
		
		System.out.println(num + "I am learning Qa");
		
		
		
		//Arrays
		int [] a1 = {10,12,13,14,15};
		//OR
		int [] a2 = new int [5];
		a2[0] = 10;
		a2[1] = 12;
		a2[2] = 13;
		a2[3] = 14;
		a2[4] =15;
		
		System.out.println(a2[2]);
		System.out.println(a1[2]);
		
		for(int i = 0; i< a2.length; i++) {
			System.out.println(i);
			System.out.println(a2[i]);
		}
		
		
		
		String [] name1 = {"Anjila", "Arati", "shivani"};
		//for each loop
		for(String n : name1) {
			System.out.println(n);
		}
		
		// for loop
		for(int i = 0; i< name1.length; i++) {
			System.out.println(name1[i]);
		}
		
		
		
		//if/else
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
