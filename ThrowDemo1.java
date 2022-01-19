/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling_Examples;

import java.util.Scanner;

public class ThrowDemo1 {

    static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("not valid");
        } else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please eneter the age");
        int age = sc.nextInt();
        try {
            validate(age);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        }
        System.out.println("rest of the code...");

    }
}
