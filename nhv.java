import java.util.Scanner;

public class Primenumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên dương n
        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();

        // Kiểm tra n có phải là số nguyên tố hay không
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // In kết quả
        System.out.println(n + " " + (isPrime ? "là số nguyên tố" : "không phải là số nguyên tố"));

        // In các số nguyên tố từ 1 đến n
        System.out.println("Các số nguyên tố từ 1 đến " + n + ":");
        for (int i = 2; i <= n; i++) {
            boolean isPrimeInner = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimeInner = false;
                    break;
                }
            }
            if (isPrimeInner) {
                System.out.print(i + " ");
            }
        }
    }
}
