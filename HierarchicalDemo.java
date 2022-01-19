/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tns;
class Base{
	static int i;
	static void m1() {
		i=10;
		System.out.println("Hi im a base class");
	}
}
class Derived1 extends Base
{
	int j;
	void m2()
	{
		System.out.println("Hi in a derived class");
	}
}

class Derived2 extends Base{
	int j;
	void m3()
	{
		System.out.println("Hi in a derived2 Class");
	}
}

class Derived3 extends Base{
	int l;
	void m4()
	{
		System.out.println("Hi in a derived3 class");
	}
}

class Derived4 extends Derived1
{
	int m;
	void m5()
	{
		System.out.println("Hi in a derived4 class");
	}
}
public class HierarchicalDemo {
    public static void main(String[] args) {
		Derived1 obj=new Derived1();
		Base.m1();
		obj.m2();
		
		Derived2 obj1=new Derived2();
		obj1.m1();
		obj1.m3();
		
		Derived4 obj2=new Derived4();
		obj2.m1();
		obj2.m2();
		obj2.m5();

	}
}
