/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading.Synchronization;

/**
 *
 * @author ADMIN
 */
public class AClass {
    int bal;
synchronized void deposit(int amt)
{
	System.out.println("Getting balance...");
	int newbal=getBalance();
	bal=newbal+amt;
	setBalance(bal);
}
int getBalance()
{
	return Account.Balance;
}
void setBalance(int amt)
{
	try
	{
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		
	}
	Account.Balance=amt;
}
}
