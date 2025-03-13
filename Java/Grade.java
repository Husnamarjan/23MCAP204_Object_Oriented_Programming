import java.util.Scanner;
public class Grade{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mark:");
        double mark=sc.nextDouble();
        String grade;
        if(mark>=90){
            grade = "A";
        }
        else if(mark>=80&&mark<90){
            grade = "B";
        }
        else if(mark>=70&&mark<80){
            grade = "C";
        }
        else if(mark>=60&&mark<70){
            grade = "D";
        }
        else{
            grade = "F";
        }
        System.out.println("Grade:"+grade);
        switch(grade){
            case "A":
                System.out.println("Excellent work!");
                break;
            case "B":
                System.out.println("Good job!");
                break;
            case "C":
                System.out.println("You can do better.");
                break;
            case "D":
                System.out.println("Work harder.");
                break;
            case "F":
                System.out.println("Failed.Try again.");
                break;
            default:
                System.out.println("Invalid grade.");
        }
        sc.close();
    }
}