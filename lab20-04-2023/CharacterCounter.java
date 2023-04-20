import java.util.Scanner;

public class CharacterCounter {
    public static int countOccurrences(String input, char c) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) 
        {
            if (input.charAt(i) == c)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter a character to count: ");
        char c = scanner.next().charAt(0);
        int count = countOccurrences(input, c);
        System.out.println("The character '" + c + "' occurs " + count + " times in the input string.");
        scanner.close();
    }
}
