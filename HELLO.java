package TranQuanLam;

public class HELLO  {
     private int rahieu=1;

	   synchronized void run2() {
	   
			for (int i = 1; i <=1000; i++) {
				if(i<=500)
				System.out.println(i+" HELLO");
				
			if(rahieu==1&&i>500){
				System.out.print(i+" HELLO");
				rahieu=2;
				notifyAll();
			}
			if(rahieu!=1){
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		 }
     }
	 
	 
	 
		 synchronized void run1() {
		
				  for (int i = 1; i <= 500; i++) {
					  if(rahieu==2){
						System.out.print("  KuDo Tran \n");
						rahieu=1;
						 notifyAll();}
					  if(rahieu==1) {
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
			}
				 
	}
     
}
	  
  
