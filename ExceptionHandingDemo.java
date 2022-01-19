/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling_Examples;

/**
 *
 * @author ADMIN
 */
public class ExceptionHandingDemo {
    public static void main(String[] args) {
		try
		{
			int data=100/0;
		}
		catch(ArithmeticException ar)
		{
			ar.printStackTrace();
//			System.out.println("Error:"+ar.getMessage());
		}
		System.out.println("Exception Handling Demo");
	}
}
