import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		double armut;
		double elma;
		double domates;
		double muz;
		double patlican;
		double toplam;
		System.out.println("Armut kac kilo: ");
		armut=girdi.nextDouble();
		System.out.println("elma kac kilo: ");
		elma=girdi.nextDouble();
		System.out.println("domates kac kilo: ");
		domates=girdi.nextDouble();
		System.out.println("muz kac kilo: ");
		muz=girdi.nextDouble();
		System.out.println("patlican kac kilo: ");
		patlican=girdi.nextDouble();
	    toplam=armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5;
	    System.out.println("toplam tutar: "+ toplam+" TL");
	}

}
