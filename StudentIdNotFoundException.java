/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling_Examples;

public class StudentIdNotFoundException extends Exception {

    int sid;

    StudentIdNotFoundException() {
    }

    public StudentIdNotFoundException(int sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Exception :: Student id not found!!";
    }

    @Override
    public String getMessage() {
        return "Student with id " + sid + " Not found!!";
    }
}
