import java.util.Scanner;
public class IT24102684Lab7Q1B {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int student;
        for (student = 1; student <= 3; student++ ) {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            String input = value.nextLine();
            String[] marksStr = input.split(" ");


            int marks[] = new int[4];
            int sum = 0;
            int i;
            for (i = 0; i < marks.length; i++) {
                marks[i] = Integer.parseInt(marksStr[i]) ;
                sum += marks[i];

            }

            //Calculation
            double average = sum / 4.0;
            System.out.print("Average is : " + average);

            String grade = "Unknown";

            if (average >= 75 && average <= 100) {
                grade = "Distinction";
            }

            if (average >= 50 && average <= 74) {
                grade = "Credit";
            }

            if (average >= 0 && average <= 49) {
                grade = "Fail";
            }

            System.out.println("\nOverall Grade is : " + grade);
            System.out.println();

        }




    }
}