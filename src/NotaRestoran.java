/**
 * Aplikasi Nota Pemesanan Makanan
 * Dibuat oleh: nabila
 * Deskripsi: Program ini menampilkan daftar menu, menerima pesanan, menghitung total harga, dan menampilkan nota pemesanan.
 */

import java.util.Scanner;

public class NotaRestoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Daftar menu
        String[] menu = {"Nasi Goreng", "Mie Ayam", "Ayam Geprek", "Soto Ayam"};
        double[] harga = {10000, 9000, 15000, 15000};

        System.out.println("=== SELAMAT DATANG DI RESTORAN LEZAT ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        System.out.print("Masukkan nomor menu yang ingin dipesan: ");
        int pilihan = input.nextInt();
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = input.nextInt();

        double total = hitungTotal(harga[pilihan - 1], jumlah);

        System.out.println("\n===== NOTA PEMESANAN =====");
        System.out.println("Menu     : " + menu[pilihan - 1]);
        System.out.println("Jumlah   : " + jumlah);
        System.out.println("Total    : Rp " + total);
        System.out.println("==========================");
    }

    /**
     * Custom Live Template: menghitung total harga pesanan.
     * Template:
     * totcalc -> total = harga * jumlah;
     */
    public static double hitungTotal(double harga, int jumlah) {
        return harga * jumlah;
}

}
