import java.util.Scanner;
public class Floyd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of rows of floyd triangle:");
		int row=sc.nextInt();
		int num=1;
        System.out.println("Floyd's Triangle:");
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+ " ");
                num++; 
            }
            System.out.println();
        }
        sc.close();
	}
}