import java.util.Scanner;

public class Caseketiga {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input suku ke-n
            System.out.print("Masukkan nilai n untuk deret Fibonacci: ");
            int n = scanner.nextInt();

            // Menampilkan deret Fibonacci hingga suku ke-n
            System.out.println("Deret Fibonacci hingga suku ke-" + n + ":");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }

    // Fungsi untuk menghitung suku ke-n dalam deret Fibonacci
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
