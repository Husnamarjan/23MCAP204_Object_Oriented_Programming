import java.util.Scanner;
public class Perimetercircle {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		int r=sc.nextInt();
		double perimeter=2*3.14*r;
		System.out.println("Perimeter:"+perimeter);
        sc.close();
	}
    
}

