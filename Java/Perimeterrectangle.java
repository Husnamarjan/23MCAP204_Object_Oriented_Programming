import java.util.Scanner;
public class Perimeterrectangle {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		int l=sc.nextInt();
		System.out.println("Enter breadth:");
		int b=sc.nextInt();
		double perimeter=2*(l+b);
		System.out.println("Perimeter:"+perimeter);
        sc.close();
	}
}
