import java.util.Scanner;


public class DecimaltoHexadecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nInDecimal = input.nextInt();
		
		String nInHexadecimal= Integer.toHexString(nInDecimal).toUpperCase();
		System.out.println(nInHexadecimal);

	}

}
