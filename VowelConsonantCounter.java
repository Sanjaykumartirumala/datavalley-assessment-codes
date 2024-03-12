import java.util.Scanner;
public class VowelConsonantCounter
  {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = sc.nextLine(); 
        sc.close();
        int vowelCount = 0;
        int consonantCount = 0;
        // Convert the string to lowercase to make the program case-insensitive
        inputString = inputString.toLowerCase();
        for (int i = 0; i < inputString.length(); i++) 
        {
            char currentChar = inputString.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||currentChar == 'o' || currentChar == 'u')
            {
                vowelCount++;
            }
            else if (currentChar >= 'a' && currentChar <= 'z') 
            {
                consonantCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
