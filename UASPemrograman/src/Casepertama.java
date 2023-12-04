import java.util.Scanner;

public class Casepertama {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan harga barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Masukkan jumlah pembelian: ");
            int jumlahPembelian = scanner.nextInt();

            double totalHarga = hitungTotalHarga(hargaBarang, jumlahPembelian);

            System.out.println("Total harga setelah diskon: " + totalHarga);
        }
    }

    private static double hitungTotalHarga(double hargaBarang, int jumlahPembelian) {
        double diskon = 0.0;

        if (jumlahPembelian >= 5 && jumlahPembelian <= 10) {
            diskon = 0.05; // 5% diskon
        } else if (jumlahPembelian >= 11 && jumlahPembelian <= 20) {
            diskon = 0.1; // 10% diskon
        } else if (jumlahPembelian > 20) {
            diskon = 0.2; // 20% diskon
        }

        double totalHarga = hargaBarang * jumlahPembelian;
        double potonganHarga = totalHarga * diskon;

        return totalHarga - potonganHarga;
    }
}
