import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자 입력: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자 입력: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("두 수의 합: " + sum);

        scanner.close();
    }
}