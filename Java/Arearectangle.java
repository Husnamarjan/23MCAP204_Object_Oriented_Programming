import java.util.Scanner;
public class Arearectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		int l=sc.nextInt();
		System.out.println("Enter breadth:");
		int b=sc.nextInt();
		double area=l*b;
		System.out.println("Area:"+area);
		sc.close();
	}
}