import java.util.Scanner;

public class ReplaceIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the original string:");
        String originalString = sc.nextLine();
        
        System.out.println("Enter the index at which you want to replace the character:");
        int index = sc.nextInt();
        
        System.out.println("Enter the new character:");
        char newChar = sc.next().charAt(0);
        
        sc.close();

        String modifiedString = replaceCharAtIndex(originalString, index, newChar);
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }

    public static String replaceCharAtIndex(String str, int index, char ch) {
        if (index < 0 || index >= str.length()) {
            System.out.println("Index out of bounds");
            return str;
        }
        char[] chars = str.toCharArray();
        chars[index] = ch;
        return String.valueOf(chars);
    }
}
