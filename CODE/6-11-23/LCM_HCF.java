import java.util.Scanner;

public class LCM_HCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2, gcd);

        System.out.println("GCD (HCF) of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }

    // Find the greatest common divisor (GCD) using the Euclidean algorithm.
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    // Calculate the LCM using the formula: LCM = (a * b) / GCD(a, b)
    public static int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
