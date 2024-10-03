import java.util.Scanner;
public class IT24102684Lab7Q1A {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int marks[] = new int[4];
        System.out.println("Enter marks for four subjects: ");

        int sum = 0;
        int i;
        for (i=0; i < marks.length; i++) {
            System.out.print("Enter Subject Marks " + (i + 1) + ": ");
            marks[i] = value.nextInt();
            sum += marks[i];
        }
        System.out.println();
         //Calculation
        double average = sum / 4.0;
        System.out.print("\nAverage is : " + average);

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




    }
}