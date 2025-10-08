import java.util.Scanner;
public class SmallestFactor {

    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);

        System.out.print("Enter an integer: ");
        int number= scanner.nextInt();

        int factor= 2;
        System.out.println("Output: ");
        while(factor<= Math.sqrt(number)){
            if(number % factor == 0) {System.out.println(factor);
            number /= factor;}
            else {factor++;}
        }
        if(number > 1) System.out.println(number);
    }
}
