package com.langfunda.constructors;

public class CopyConstructor1 {
    int id;
    String name;
    String brand;


CopyConstructor1(int id,String name,String brand){
	
	this.id=id;
	this.name=name;
	this.brand=brand;
	
}

CopyConstructor1(CopyConstructor1 c){
   this(c.id,c.name,c.brand);
   //this.id=c.id;
   //this.name=c.name;
   //this.brand=brand;
}

void disp() {
	System.out.println(id);
	System.out.println(name);
	
}
	public static void main(String[] args) {
		CopyConstructor1 c1=new CopyConstructor1(1,"venkata reddy","mol");
		c1.disp();
		CopyConstructor1 c2=new CopyConstructor1(c1);
		c2.disp();

	}

}
