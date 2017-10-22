package TranQuanLam;

public class main {

	public static void main(String[] args) throws InterruptedException {
		
		HELLO hi=new HELLO();
		KUDO_TRAN toi=new KUDO_TRAN();
		
		Thread chao =new Thread(hi);
		Thread me =new Thread(toi);
		
	    chao.start();
	    chao.join();
	    me.start();
	    

	}

}
