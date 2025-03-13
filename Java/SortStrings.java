import java.util.Arrays;
public class SortStrings {
    public static void main(String[] args) {
        String[] words = {"banana", "apple", "cherry", "mango", "grape"};
        Arrays.sort(words);
        System.out.println("Sorted Array: " + Arrays.toString(words));
    }
}
