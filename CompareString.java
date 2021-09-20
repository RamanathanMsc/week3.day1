package week3.day1;

public class CompareString {
	
	//Need to use equals or ignore case equals for string

	public static void test1()
	{
	String str3 = new String("Kutty");
	 String str4 = new String("Kutty");
	 
	 if(str3==(str4)) {
		 System.out.println(" Same text");
	 }
	 else
		 System.out.println("Diff text");
	 
	 System.out.println("***");
	}
	 
	public static void main(String[] args) {
		
		test1();

	}

}
