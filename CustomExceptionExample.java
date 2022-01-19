/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling_Examples;

import java.util.Scanner;

public class CustomExceptionExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student id: ");
        int id = sc.nextInt();

        if (id > 100) {
            System.out.println("Student found");
        } else {
            try {
                throw new StudentIdNotFoundException(id);
            } catch (StudentIdNotFoundException se) {
                System.out.println(se);
                System.out.println(se.getMessage());
            }
        }

    }
}
