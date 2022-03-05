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
public class DepositThread extends Thread{
    AClass obj;
	int amt;
	
	public DepositThread(AClass obj, int amt) {	
		this.obj = obj;
		this.amt = amt;
	}

	@Override
	public void run() {
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		obj.deposit(amt);
	}
}
