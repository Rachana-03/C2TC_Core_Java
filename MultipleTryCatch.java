/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling_Examples;

public class MultipleTryCatch {

    public static void main(String[] args) {
        try {
            int x = 10 / 10;
            try {
                int y = 10 / 0;
            } catch (Exception e) {
                System.out.println(e);
            }
        } finally {
            System.out.println("finally block");
            try {
                int y = 10 / 0;
            } catch (Exception e) {
                try {
                    int z = 30 / 30;
                } finally {
                    System.out.println("In finally under catch");
                }
                System.out.println(e);
            }
        }

    }
}
