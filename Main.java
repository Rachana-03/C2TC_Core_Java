/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tns;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Sum is "+(a+b));
		Main obj=new Main();
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
	}
}
