package org.system;

public class Desktop extends Computer {
	
	public void DesktopModel()
	{
		System.out.println("Destop size");
		
		String size= "16'";
		
		System.out.println("computer size:  " + size);
	}

	public static void main(String[] args) {
		
		Desktop de=new Desktop();
		de.computerModel();
		de.DesktopModel();
		
	}

}
