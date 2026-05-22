package com.langfunda;
//no of identifers in this program is: 12
public class TestIdentifiers {
	int $studentid$=16;
	String _name="Venkata Reddy";
	
	void display() {
		System.out.println($studentid$);
		System.out.println(_name);
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		
	 TestIdentifiers t1=new TestIdentifiers();  //object creation
	 
	 t1.display();
	 
	 
	}

}
