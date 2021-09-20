package week3.day1;

public class StringAssignmentASS7 {

	public static void ASS1()

	{

		String text = "Java Exercise";

		System.out.println("index of e:  " + text.indexOf('E') );
		System.out.println("index of s  :" + text.indexOf('s'));
	}

	public static void Ass2() {
		String str1 = "I am Learning Java";
		String str2 = "I am learning java?";
		
		if (str1==str2)
		{
			System.out.println("strings are match with == statement");
		}
		else if(str1.equals(str2))
		{
			System.out.println("strings are match with equals statement");
		}
		
		else if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("strings are match with equalsIgnoreCase statement");
		}
		else
		{
			System.out.println("strings are not match ");
		}

	}
	
	public static void Ass3()
	{
		
		String str3="I am working with Java8";
		
		String str4=str3.replace("rkin", " ");
		System.out.println(str4.substring(5, 15));
	}

	public static void main(String[] args) {

		ASS1();
		Ass2() ;
		Ass3();
	}

}
