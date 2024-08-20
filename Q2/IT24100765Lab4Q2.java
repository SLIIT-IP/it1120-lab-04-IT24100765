import java.util.Scanner;

public class IT24100765Lab4Q2  {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);


 System.out.print("Please enter exam marks (out of 100): ");
int exammarks = scanner.nextInt();

if (exammarks > 100)
{System.out.println("Invalid input for exam marks. terminating program:");
 
return; 

}



System.out.print("Please enter lab submission marks (out of 100): ");
int labmarks  = scanner.nextInt();

if ( labmarks > 100)
{System.out.println("Invalid input for Lab marks. terminating program:");


 return;

}


System.out.print("Please enter the percentage given for the exam : ");
int percentexam = scanner.nextInt();

if (percentexam >= 100){
System.out.println("The percentage must add up to 100. Terminating program:");


return;
}


System.out.print("Please enter the  percentage given for the lab submission: ");
int percentlab = scanner.nextInt();

if (percentexam + percentlab != 100){
System.out.println("The percentage must add up to 100. Terminating program:");


return;
}



double Fexammarks = (exammarks/100.0)* percentexam;
double Flabmarks = (labmarks/100.0)* percentlab;
 double allmarks= Fexammarks + Flabmarks;



System.out.printf("Final Exam Mark is: %.2f%n", allmarks);


scanner.close();


    }


}
