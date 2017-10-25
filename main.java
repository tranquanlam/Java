package TranQuanLam;

import org.omg.CORBA.PUBLIC_MEMBER;

public class main {

	public static void main(String[] args)  {
		
		 HELLO hi=new HELLO();
		new Thread (){
			public void run() {
				hi.run2();
			}
		}.start();
		
		new Thread (){
			public void run() {
				
				hi.run1();
			}
		}.start();
		
		    
		    
			
	    

	}

}
