import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
	
		int km;
		double odenecek;
	 Scanner girdi=new Scanner(System.in);
	 System.out.println("kac km gidildi: ");
	 km=girdi.nextInt();
	 odenecek=km*2.20+10;
	 if(odenecek<20) 
	 {
		odenecek=20;
	 }

	 System.out.println("odenecek tutar: "+odenecek+"TL");
	 
	}

}
