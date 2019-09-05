import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int numGrade;
        String letterGrade;
        String continueProgram;

        continueProgram = "Y";

        Scanner input = new Scanner(System.in);

        //begin while condition
        //begin program with "Y" as the initialized value of continueProgram variable

        while (continueProgram.equalsIgnoreCase("y")){

            System.out.println();
            System.out.println();
            System.out.println("Please enter exam score:  ");
            numGrade = input.nextInt();
            System.out.println();

            //begin nested if(s)




            if (numGrade >= 97 && numGrade <= 100){
                letterGrade = "A+!!! Super job!!!";
                System.out.println();
                System.out.println();
                System.out.println(letterGrade);

            }

            else if (numGrade >= 94 && numGrade <= 100){
                letterGrade = "A!!! Great job!!!";
                System.out.println();
                System.out.println();
                System.out.println(letterGrade);
            }

            else if (numGrade >= 90 && numGrade <= 100){
                letterGrade = "A-!!! Very good job!!!";
                System.out.println();
                System.out.println();
                System.out.println(letterGrade);
            }

            else if (numGrade >= 87 && numGrade <= 100){
                letterGrade = "B+!!! Almost there!!";
                System.out.println();
                System.out.println();
                System.out.println(letterGrade);
            }

            else if (numGrade >= 84 && numGrade <= 100){
                letterGrade = "B!! Good job!! Getting closer...";
                System.out.println();
                System.out.println();
                System.out.println(letterGrade);
            }

            else if (numGrade >= 80 && numGrade <= 100){
                letterGrade = "B-! Definitely not average...";
                System.out.println();
                System.out.println();
                System.out.println(letterGrade);
            }

            else if (numGrade >= 77 && numGrade <= 100){
                letterGrade = "C+...Slightly better than average...";
                System.out.println();
                System.out.println();
                System.out.println(letterGrade);
            }

            else if (numGrade >= 74 && numGrade <= 100){
                letterGrade = "C...Not bad...";
                System.out.println();
                System.out.println();
                System.out.println(letterGrade);
            }

            else if (numGrade >= 70 && numGrade <= 100){
                letterGrade = "C-...Better than the alternative...";
                System.out.println();
                System.out.println();
                System.out.println(letterGrade);
            }

            else if (numGrade >= 60 && numGrade <= 100){
                letterGrade = "D...Might have to study a bit harder...";
                System.out.println();
                System.out.println();
                System.out.println(letterGrade);
            }

            else if (numGrade < 60){
                letterGrade = "F!!! Go back to school!!!";
                System.out.println();
                System.out.println();
                System.out.println(letterGrade);
            }

            else {
                System.out.println("You did not give a valid number...");
            }

            System.out.println();
            System.out.println();
            System.out.println("Do you want to continue? Enter 'Y' to continue:  ");
            continueProgram = input.next();

        } //end nested if(s)






    }
}
