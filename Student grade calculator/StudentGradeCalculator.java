import java.util.Scanner;

public class StudentCalculatorGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined subject names
        String[] subjectNames = {"Math", "Science", "English", "History", "Computer"};
        int numSubjects = subjectNames.length;
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Input marks for predefined subjects
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for " + subjectNames[i] + " (out of 100): ");
            marks[i] = scanner.nextInt();

            // Optional validation
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks. Please enter between 0 and 100.");
                i--; // Repeat this subject
                continue;
            }

            totalMarks += marks[i];
        }

        // Calculate average
        double average = (double) totalMarks / numSubjects;

        // Determine grade
        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("\n--- Subject-wise Marks ---");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subjectNames[i] + ": " + marks[i]);
        }

        System.out.println("\n--- Result Summary ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

output:

Enter marks for Math (out of 100): 95
Enter marks for Science (out of 100): 85
Enter marks for English (out of 100): 67
Enter marks for History (out of 100): 74
Enter marks for Computer (out of 100): 86

--- Subject-wise Marks ---
Math: 95
Science: 85
English: 67
History: 74
Computer: 86

--- Result Summary ---
Total Marks: 407
Average Percentage: 81.40%
Grade: A