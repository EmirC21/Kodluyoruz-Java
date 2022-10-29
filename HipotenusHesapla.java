import java.util.Scanner;

public class HipotenusHesapla {

	public static void main(String[] args) {
		int kenar1,kenar2,kenar3;
		double alan,u,a,b,c;
	Scanner girdi=new Scanner(System.in);	
	System.out.println("kenar uzunluk girin...");
	kenar1=girdi.nextInt();
	kenar2=girdi.nextInt();
	kenar3=girdi.nextInt();
    u=(kenar1+kenar2+kenar3)/2;
    a=u-kenar1;
    b=u-kenar2;
    c=u-kenar3;
	alan=u * a* b * c;
    System.out.println("alan: "+ alan);
	}

}
