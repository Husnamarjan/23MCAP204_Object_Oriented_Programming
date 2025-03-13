import java.util.Scanner;
public class Eligibility {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark in mathematics:");
		double maths=sc.nextDouble();
		System.out.println("Enter the mark in physics:");
		double physics=sc.nextDouble();
		System.out.println("Enter the mark in chemistry:");
		double chemistry=sc.nextDouble();
		double totalall=maths+physics+chemistry;
		double totalmathsandphysics=maths+physics;
		if ((maths>=60 && physics>=50 && chemistry>=40 && totalall>=200) || totalmathsandphysics>=150){
	            System.out.println("The candidate is eligible for admission.");
	    } 
		else{
	            System.out.println("The candidate is not eligible for admission.");
	    }
		sc.close();
	}
}