import java.util.Scanner;
public class Amstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		if(isAmstrong(number)) {
			System.out.println("It is Amstrong");
		}
		else {
			System.out.println("It is not Amstrong");
		}
		sc.close();
	}
	public static boolean isAmstrong(int number){
		int original=number;
	    int sum=0;
	    int numberOfDigits=String.valueOf(number).length();
	    while(number>0){
	    	int digit=number%10;
	        sum+=Math.pow(digit,numberOfDigits);
	        number /= 10;
	   }
	   return original == sum;
	}
}
