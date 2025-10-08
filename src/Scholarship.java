import java.util.Scanner;
public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);

        System.out.print("Enter your average: ");
        double average= scanner.nextDouble();
        System.out.print("Number of extracurricular activities: ");
        int extracurricular= scanner.nextInt();
        System.out.print("Number of service activities: ");
        int service= scanner.nextInt();

        boolean isCandidate= false;

        if(average >= 3.8 && (extracurricular + service) >= 1 ) isCandidate= true;
        else if(average > 3.4 && average < 3.8 && (extracurricular + service) >= 3 ) isCandidate= true;
        else if(average <= 3.4 && average > 3.0 && extracurricular >= 2 && service >= 3 ) isCandidate= true;

        if (isCandidate) System.out.println("Scholarship candidate.");
        else System.out.println("Not a candidate");
    }
}
