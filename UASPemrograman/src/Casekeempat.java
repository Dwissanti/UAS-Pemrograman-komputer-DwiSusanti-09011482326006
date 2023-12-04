import java.util.Scanner;

public class Casekeempat {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input bilangan bulat positif
            System.out.print("Masukkan bilangan bulat positif: ");
            int bilangan = scanner.nextInt();

            // Memfaktorisasi dan menampilkan hasilnya
            faktorisasiDanTampilkan(bilangan);
        }
    }

    private static void faktorisasiDanTampilkan(int bilangan) {
        System.out.print("Faktorisasi " + bilangan + ": ");

        for (int faktor = 2; faktor <= bilangan; faktor++) {
            while (bilangan % faktor == 0) {
                System.out.print(faktor);
                bilangan /= faktor;

                if (bilangan > 1) {
                    System.out.print(" * ");
                }
            }
        }

        System.out.println();
    }
}
