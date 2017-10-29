package TranQuanLam;

import java.nio.channels.GatheringByteChannel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HaNoi  {
	private int gio=1;
	private int phut=2;
	private int giay=3;
      

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

	@Override
	public String toString() {
		return    gio + ":" + phut + ":" + giay;
	}

	public static void main(String[] args) {
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
	}
}
