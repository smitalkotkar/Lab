public class  {
    public static void main(String[] args) {
        String originalString = "Welcome to Java World";

        // Returns the character at 5th position and display it
        char characterAt5thPosition = originalString.charAt(4);
        System.out.println("Character at 5th position: " + characterAt5thPosition);
        
        System.out.println("---------------------------------------");

        // Compares the above String with "Welcome" lexicographically ignoring case differences and display the result
        boolean isEqualIgnoreCase = originalString.equalsIgnoreCase("Welcome");
        System.out.println("Comparison result (ignore case): " + isEqualIgnoreCase);
        
        System.out.println("---------------------------------------");

        // Concatenates "- Let us learn" to the above string and display it
        String concatenatedString = originalString.concat("- Let us learn");
        System.out.println("Concatenated String: " + concatenatedString);
        
        System.out.println("---------------------------------------");


        // Returns the position of the first occurrence of character 'a' and display it
        int firstOccurrenceOfA = originalString.indexOf('a');
        System.out.println("Position of first occurrence of 'a': " + firstOccurrenceOfA);
        
        System.out.println("---------------------------------------");


        // Replaces all the occurrences of 'a' character with the new 'e' and display it
        String replacedString = originalString.replace('a', 'e');
        System.out.println("Replaced String: " + replacedString);
        
       System.out.println("---------------------------------------");
//Returns string between 4th position and 10th position and display it
        String substring = originalString.substring(3, 10);
        System.out.println("Substring between 4th and 10th position: " + substring);
        
        System.out.println("---------------------------------------");


        // Returns the lowercase of the string and display it
        String lowercaseString = originalString.toLowerCase();
        System.out.println("Lowercase String: " + lowercaseString);
    }
}
