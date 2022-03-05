/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

/**
 *
 * @author ADMIN
 */
public class B implements Runnable{
    
    String msg;

    public B(String msg) {
        this.msg = msg;
    }
    
    
     @Override
     public void run(){
         for(int i=0;i<msg.length();i++)
		{
			try
			{
			Thread.sleep(2000);
		}
			catch(Exception e)
			{
				
			}
		System.out.println(msg.charAt(i));
	}
     }
}
