package TranQuanLam;

import java.nio.channels.GatheringByteChannel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HaNoi extends Thread {
	private int gio=1;
	private int phut=2;
	private int giay=3;
	//interface đ^^ể đi^^ều khi^^ển giao di^^^^ênj
    private IWatch ui;
    

	public IWatch getUi() {
		return ui;
	}

	public void setUi(IWatch ui) {
		this.ui = ui;
	}

	public int getGio() {
		return gio;
	}

	public void setGio(int gio) {
		this.gio = gio;
	}

	public int getPhut() {
		return phut;
	}

	public void setPhut(int phut) {
		this.phut = phut;
	}
	
	public int getGiay() {
		return giay;
	}

	public void setGiay(int giay) {
		this.giay = giay;
	}

	public HaNoi name() {
		Calendar cal= Calendar.getInstance();
	    
	    HaNoi a = new HaNoi();
	    int g=cal.get(Calendar.HOUR);
	    int p=cal.get(Calendar.MINUTE);
	    int gi=cal.get(Calendar.SECOND);
	    a.setGio(g);
	    a.setPhut(p);
	    a.setGiay(gi);
	    return a; 
	}
	
	public void RunSeccon() {
	giay++;
	if(giay==59){
		giay=0;
	}
}


	public String getTime() {
		return    gio + ":" + phut + ":" + giay;
	}

	//thread HaNoi, minh chạy bằng gọi h``am start. ko c^^ần bỏ hảm main.
	/*public static void main(String[] args) {
		HaNoi n=new HaNoi();
		System.out.println(n.name());
		while (true) {
			n.RunSeccon();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(n.name());
		}
	}*/
	public HaNoi(){
		
	}
	
	@Override
	public void run() {
		while(true){
			giay++;
			Calendar cal= Calendar.getInstance();
		    gio =cal.get(Calendar.HOUR);
		    phut =cal.get(Calendar.MINUTE);
		    giay =cal.get(Calendar.SECOND);
		    ui.updateUI(gio, phut, giay);
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
