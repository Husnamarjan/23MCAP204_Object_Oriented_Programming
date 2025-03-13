import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		if(isPalindrome(number)){
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
		sc.close();
	}
	public static boolean isPalindrome(int number){
        int originalNumber=number;
        int reverse=0;
        while(number!=0){
            int digit=number%10;
            reverse=reverse*10+digit;
            number=number/10;
        }
        return originalNumber==reverse;
    }
}