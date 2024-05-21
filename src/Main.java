import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your Principle Amount: ");
        int p = sc.nextInt();
        System.out.print("\nPlease enter your Interest Rate: ");
        int r = sc.nextInt();
        System.out.print("\nPlease enter your Time in years: ");
        int t = sc.nextInt();

        System.out.print("\nYour Simple interest is: " + simpleInterest(p,r,t));
    }

    static int simpleInterest(int p, int r, int t)
    {
        return (p * t * r)/100;
    };
}