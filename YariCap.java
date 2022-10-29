import java.util.Scanner;

public class YariCap {

	public static void main(String[] args) {
		int yaricap;
		double alan,cevre;
		Scanner girdi=new Scanner(System.in);
		yaricap=girdi.nextInt();
		alan=3.14*yaricap*yaricap;
		cevre=2*3.14*yaricap;
		System.out.println("Cevre: "+alan);
		System.out.println("Alan: "+cevre);
		

	}

}
