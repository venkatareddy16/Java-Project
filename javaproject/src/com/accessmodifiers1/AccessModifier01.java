package com.accessmodifiers1;

public class AccessModifier01 {
	// static block
	static {
		System.out.println("static block called from AccessModifier01");
	}
	// instance block
	{
		System.out.println("instance block called from AccessModifier01");
	}

	// ***********private*************
	// private inner class
	private class InnerPrivate {
		private int stno1 = 18;
		private String name1 = "virat";
	}

	// private data members
	private int stno = 49;
	private String name = "smith";

	// private scope method
	private void display() {
		System.out.println("display method called");
	}
	// private scope constructor
//	private AccessModifier01() {
//    	System.out.println("No-arg private constructor called");

	// ***********default*************
	// default inner class
	class InnerPrivate1 {
		int stno3 = 45;
		String name3 = "Rohit";
	}

	// default data members
	int stno1 = 30;
	String name1 = "pat cummins";

	// private scope method
	void display1() {
		System.out.println("display1 method called");
	}
	// default scope constructor
//	AccessModifier01() {
//		System.out.println("No-arg default scope constructor called");
//	}

	// ***********public*************
	// public inner class
	public class InnerPrivate2 {
		public int stno4 = 77;
		public String name4 = "Shuman Gill";
	}

	// public data members
	public int stno5 = 56;
	public String name5 = "Micthel Starc";

	// public scope method
	public void display2() {
		System.out.println("display2 method called");
	}

	// public scope constructor
//	public AccessModifier01() {
//		System.out.println("No-arg public scope constructor called");
//	}

	// ***********protected*************
	// protected inner class
	protected class InnerPrivate3 {
		protected int stno6 = 1;
		protected String name6 = "KL Rahul";
	}

	// protected data members
	protected int stno7 = 9;
	protected String name7 = "Sanju Samson";

	// protected scope method
	protected void display3() {
		System.out.println("display3 method called");
	}

	// protected scope constructor
	protected AccessModifier01() {
		System.out.println("No-arg protected scope constructor called");
	}

	static void main(String[] args) {
		System.out.println("main method started");
		AccessModifier01 p = new AccessModifier01();
		System.out.println("*****************************");
		System.out.println("Acessing the private inner class within the class");
		InnerPrivate ip = p.new InnerPrivate();
		System.out.println(ip.stno1);
		System.out.println(ip.name1);
		System.out.println("Acessing the private data within the class");
		System.out.println(p.stno);
		System.out.println(p.name);
		p.display();
		System.out.println("******************************");
		System.out.println("Acessing the default inner class within the class");
		InnerPrivate1 ip1 = p.new InnerPrivate1();
		System.out.println(ip1.stno3);
		System.out.println(ip1.name3);
		System.out.println("Acessing the default data within the class");
		System.out.println(p.stno1);
		System.out.println(p.name1);
		p.display1();
		System.out.println("******************************");
		System.out.println("Acessing the public inner class within the class");
		InnerPrivate2 ip2 = p.new InnerPrivate2();
		System.out.println(ip2.stno4);
		System.out.println(ip2.name4);
		System.out.println("Acessing the public data within the class");
		System.out.println(p.stno5);
		System.out.println(p.name5);
		p.display2();
		System.out.println("******************************");
		System.out.println("Acessing the protected inner class within the class");
		InnerPrivate3 ip3 = p.new InnerPrivate3();
		System.out.println(ip3.stno6);
		System.out.println(ip3.name6);
		System.out.println("Acessing the protected data within the class");
		System.out.println(p.stno7);
		System.out.println(p.name7);
		p.display3();
	}

}
