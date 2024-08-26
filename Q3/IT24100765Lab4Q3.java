import java.util.Scanner;

public class IT24100765Lab4Q3 {

  public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);

             System.out.print("Enter Number:");
                 int number=scanner.nextInt();
                


             String result = (number > 0) ? "The number is Positive":
                              (number < 0) ? "The Number is Negative":
                               "The Number is Zero";



System.out.println(result);


scanner.close();
            









}


}
