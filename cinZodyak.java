import java.util.Scanner;

public class cinZodyak {

	public static void main(String[] args) {
		int dogumYil;
		double kalan;
		System.out.println("dogum yilinizi giriniz: ");
		 Scanner scan = new Scanner(System.in);
         dogumYil=scan.nextInt();
         kalan=dogumYil%12;
         if(kalan==0) {System.out.println("Cin zodyagi burcunuz: Maymun ");}
         if(kalan==1) {System.out.println("Cin zodyagi burcunuz: Horoz");}
         if(kalan==2) {System.out.println("Cin zodyagi burcunuz: Kopek");}
         if(kalan==3) {System.out.println("Cin zodyagi burcunuz: Domuz");}
         if(kalan==4) {System.out.println("Cin zodyagi burcunuz: Fare");}
         if(kalan==5) {System.out.println("Cin zodyagi burcunuz: Okuz");}
         if(kalan==6) {System.out.println("Cin zodyagi burcunuz: Kaplan");}
         if(kalan==7) {System.out.println("Cin zodyagi burcunuz: Tavsan");}
         if(kalan==8) {System.out.println("Cin zodyagi burcunuz: Ejderha");}
         if(kalan==9) {System.out.println("Cin zodyagi burcunuz: yilan");}
         if(kalan==10) {System.out.println("Cin zodyagi burcunuz: At");}
         if(kalan==11) {System.out.println("Cin zodyagi burcunuz: koyun");}
        
	}

}
