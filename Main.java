import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	double alinanPara;
    double kdv=0;
	double kdvFiyat;
	Scanner girdi=new Scanner(System.in);
	System.out.println("Fiyat giriniz");
	alinanPara=girdi.nextDouble();
	if(alinanPara >0&&alinanPara<1000) 
	{
		kdv=18;	
	}
	else if(alinanPara>1000) 
	{
		kdv = 8;
	}
	else 
	{
	 System.out.println("gecerli deger giriniz");
    }
	System.out.println("kdvsiz fiyat : "+alinanPara);
	kdvFiyat=kdv*0.1+alinanPara;
	System.out.println("kdv'li fiyat : "+kdvFiyat);
	System.out.println("kdv tutari : "+kdv*0.1);
	
	

	}

}
