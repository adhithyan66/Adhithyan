import java.util.Scanner;

public class Vowel{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            }
        }
        System.out.println("The number of vowels in the given string is: " + vowelCount);
         scanner.close();
    }
}