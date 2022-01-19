/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tns;

/**
 *
 * @author ADMIN
 */
public class WrapperClassDemo {
    public static void main(String[] args) {
		//unboxing
		Integer i=new Integer(10);
		System.out.println(i);
		int b=i;
		System.out.println(b);
		
		//autoboxing
		int a=100;
		Integer i1=a;
		System.out.println(i1);
		Character ch='a';
		char c=ch;
		System.out.println(c);
	}
}
