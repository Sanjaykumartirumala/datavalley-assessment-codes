import java.util.Scanner;
public class DivisionCalculator
  {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int numerator = sc.nextInt();
        System.out.println("Enter the denominator:");
        int denominator = sc.nextInt();
        sc.close();
        try
          {
            double result = divideNumbers(numerator, denominator);
            System.out.println("Result: " + result);
          }
        catch (ArithmeticException e)
          {
            System.out.println("Error: " + e.getMessage());
          }
    }
    public static double divideNumbers(int numerator, int denominator) throws ArithmeticException
    {
        if (denominator == 0)
        {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) numerator / denominator;
    }
}
