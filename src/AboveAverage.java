import java.util.Scanner;
public class AboveAverage {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("Enter 10 integer numbers: ");
        int[] num= new int[10];
        int sum= 0;

        for(int i= 0; i<num.length; i++){
            num[i]= scanner.nextInt();
            sum += num[i];
        }
        int average= sum / num.length;
        System.out.println("Average: " + average);

        System.out.println("Numbers above the average: ");
        for(int i= 0; i< num.length; i++){
            if (num[i] > average) System.out.print(num[i] + " ");
        }
    }
}
