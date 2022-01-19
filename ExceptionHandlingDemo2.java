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
public class ExceptionHandlingDemo2 {

    public static void main(String[] args) {
        int[] arr = new int[4];
        int a = 45;
        int b = 0;

        try {
            arr[3] = 35;
            int c = a / b;
            System.out.println("In try Block");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Exception in try block");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Exception in try block");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("In Finally Block");
        }
        System.out.println("In the class");

    }
}
