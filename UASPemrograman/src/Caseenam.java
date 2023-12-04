import java.util.Scanner;

public class Caseenam{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input kata atau frase
            System.out.print("Masukkan kata atau frase: ");
            String input = scanner.nextLine();

            // Cek apakah kata atau frase adalah palindrom
            if (isPalindrom(input)) {
                System.out.println("Kata atau frase tersebut adalah palindrom.");
            } else {
                System.out.println("Kata atau frase tersebut bukan palindrom.");
            }
        }
    }

    // Metode untuk melakukan pengecekan palindrom
    private static boolean isPalindrom(String str) {
        // Hapus spasi dan ubah menjadi huruf kecil
        String cleanStr = str.replaceAll("\\s", "").toLowerCase();

        int length = cleanStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
