import java.util.Scanner;


public class TheSmallestOf3Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		
		float tempResult = Math.min(a, b);
		float result = Math.min(tempResult, c);
		
		System.out.println(result);

	}

}
