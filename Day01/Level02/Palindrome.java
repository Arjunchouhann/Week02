import java.util.Scanner;
  public class Palindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the text to check
        System.out.print("Enter text to check if it's a palindrome: ");
        String text = input.nextLine();

        // Create a PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(text);

        // Display the result
        checker.displayResult();
    }
}

 class PalindromeChecker {
    String text;

    // Constructor 
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }
 }
//