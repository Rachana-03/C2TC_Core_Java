/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tns;

abstract class Bank1 {

    abstract float getRateOfInterest();

    void display() {
        System.out.println("Abstract Class");
    }
}

class SBI1 extends Bank1 {

    @Override
    float getRateOfInterest() {
        return 7.0f;
    }
}

class HDFC1 extends Bank1 {

    @Override
    float getRateOfInterest() {
        return 6.8f;
    }
}

class ICICI1 extends Bank1 {

    @Override
    float getRateOfInterest() {
        return 6.9f;
    }

}

public class AbstractionDemo {

    public static void main(String[] args) {
        HDFC1 h1 = new HDFC1();
        System.out.println("Rate of Interest of HDFC is" + h1.getRateOfInterest());
        h1.display();

        Bank1 s = new ICICI1();
        s.display();
        System.out.println("Rate of Interest ICICI is" + s.getRateOfInterest());

    }
}
