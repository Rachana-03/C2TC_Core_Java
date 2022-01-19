/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tns;

//if you put final keyword to class it will not allow to extend the class
//if you put final keyword to function it will not all to overrid the function.
class Bank
{
	float getRateOfInterest()
	{
		return 6.7f;
	}
}
class SBI extends Bank
{

	@Override
	float getRateOfInterest() {
		return 7.0f;
	}
}
class HDFC extends Bank
{
	@Override
	float getRateOfInterest()
	{
		return 6.8f;
	}
}
class ICICI extends Bank{

	@Override
	float getRateOfInterest() {
		return 6.9f;
	}
	
}
public class MethodOverridingDemo {
    public static void main(String[] args) {
		SBI obj=new SBI();
		System.out.println(obj.getRateOfInterest());
		
//		Dynamic binding assigning child class object to parent class reference variable.
		Bank obj1=new SBI();
		System.out.println(obj1.getRateOfInterest());

	}
}
