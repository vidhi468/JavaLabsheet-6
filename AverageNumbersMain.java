// Q11: Read ten numbers, compute average and count values above it.
import java.util.Scanner;

class NumberAnalyzer {
    private double[] numbers;

    NumberAnalyzer(double[] numbers) {
        this.numbers = numbers;
    }

    double calculateAverage() {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

    int countAboveAverage() {
        double average = calculateAverage();
        int count = 0; // Local variable
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }
        return count;
    }

    void displayResult() {
        double average = calculateAverage();
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Numbers above average: " + countAboveAverage());
    }
}

public class AverageNumbersMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        NumberAnalyzer analyzer = new NumberAnalyzer(numbers);
        analyzer.displayResult();
        scanner.close();
    }
}
