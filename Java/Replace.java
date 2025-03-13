import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String text = sc.nextLine();

        System.out.print("Enter the pattern to search: ");
        String pattern = sc.nextLine();

        System.out.print("Enter the replacement string: ");
        String replacement = sc.nextLine();

        String result = text.replace(pattern, replacement); 

        System.out.println("Modified string: " + result);
        sc.close();
    }
}
