import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int largest= 0;
        int secondLargest= 0;
        System.out.println("Enter a number: ");
        for(;;){
            int num= scanner.nextInt();

            if(num < 0){break;}

            if(num>largest){
                secondLargest= largest;
                largest= num;
            } else if (num > secondLargest && num != largest){
                secondLargest= num;
            }
            }
        System.out.println("Second largest number: " + secondLargest);
    }
}
