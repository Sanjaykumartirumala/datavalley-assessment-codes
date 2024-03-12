import java.util.Scanner;
class CustomValidationException extends Exception
  {
    public CustomValidationException(String message) 
    {
        super(message);
    }
}
public class Main 
{
    public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for validation:");
        int number = sc.nextInt();
        sc.close();
        try 
          {
            validateNumber(number);
          } 
        catch (CustomValidationException e)
          {
            System.out.println(e.getMessage());
          }
    }
    public static void validateNumber(int number) throws CustomValidationException  
   {
        if (number < 0)
        {
            throw new CustomValidationException("The number is negative: " + number);
        } 
        else 
        {
            System.out.println("The number is positive: " + number);
        }
    }
}
