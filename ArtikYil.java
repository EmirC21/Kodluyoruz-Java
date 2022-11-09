import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    int yil;
	    double kalan;
	    
		System.out.println("yil giriniz");
		yil=scan.nextInt();
		kalan=yil%4;
		if(yil%100==0) {kalan=yil%400;}
		if(kalan==0) {System.out.println(yil+" bir artik yildir!");}
		else {System.out.println(yil+ " bir artik yil degildir");}
      
	}

}
