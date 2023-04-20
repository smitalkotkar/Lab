package lab;

public class StringBufferDemo{
    public static void main(String[] args) {
    	
        // Create a StringBuffer with the initial string
        StringBuffer sb = new StringBuffer("This is String Buffer");

        // 1. Append a string to the existing string
        sb.append(": Anudip Foundation");
        System.out.println("1. Appended string: " + sb.toString());
        
        System.out.println(".......................................... ");

        // 2. Insert a string at a specific position
        sb.insert(21, "Object ");
        System.out.println("2. Inserted string: " + sb.toString());
        
        System.out.println(".......................................... ");


        // 3. Reverse the entire string
        sb.reverse();
        System.out.println("3. Reversed string: " + sb.toString());
        
        System.out.println(".......................................... ");


        // 4. Replace a word in the string
        StringBuffer sb1 = new StringBuffer("This is String Buffer ");
		sb1.replace(11, 20, "Builder");
		System.out.println("4. Replaced string : " + sb1);

    }
}
