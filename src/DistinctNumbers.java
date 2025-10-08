import java.util.Scanner;
public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[1000];
        int count = 0;

        System.out.println("Enter a number: ");

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }

            boolean exists = false;
            for (int i = 0; i < count; i++) {
                if (numbers[i] == num) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                numbers[count] = num;
                count++;
            }
        }

        if (count > 0) {
            System.out.print("Distinct numbers: ");
            for (int i = 0; i < count; i++) {
                System.out.print(numbers[i]);
                if (i < count - 1) {
                    System.out.print(", ");
                }
            }
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}
