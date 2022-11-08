import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double boy;
		double kilo;
		double endeks;
		Scanner girdi = new Scanner(System.in);
		System.out.println("Boyunuzu giriniz: ");
		boy=girdi.nextDouble();
		System.out.println("kilonuzu giriniz: ");
		kilo=girdi.nextDouble();
		endeks = kilo/(boy*boy);
		System.out.println("vucut kitle endeksi: "+endeks);
		
		

	}

}
