/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional_statements;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class SwitchStatement {
    public static void main(String[] args) {
		//switch case take int,short,char,byte,enum,string as test case
		//make sure you break each case otherwise once case get execute all the following cases will also get execute.
		System.out.println("Enter number between 1 to 5:");
		Scanner out=new Scanner(System.in);
		int ch=out.nextInt();
		out.close();
		
		switch(ch) {
		case 1:
			System.out.println("This is case 1");
			break;
		case 2:
			System.out.println("This is case 2");
			break;
		case 3:
			System.out.println("This is case 3");
			break;
		case 4:
			System.out.println("This is case 4");
			break;
		case 5:
			System.out.println("This is case 5");
			break;
		default:
			System.out.println("Errrr Human.");
		}

	} 
}
