import java.util.Scanner;
public class hitungTotalHarga11 {
    public static int hitungTotalHarga11 (int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
    
        if (kodePromo.equals("DISKON50")) {
            hargaTotal = hargaTotal / 2;
            System.out.println("Kode promo valid: Anda mendapatkan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100); 
            System.out.println("Kode promo valid: Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo tidak valid. Tidak ada diskon yang diberikan.");
        }

        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0;
        String lanjutkan = "ya";

        while (lanjutkan.equals("ya")) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (1-6): ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            System.out.print("Masukkan kode promo (jika ada): ");
            sc.nextLine(); 
            String kodePromo = sc.nextLine();

            int totalHarga = hitungTotalHarga11(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;

            System.out.print("Apakah Anda ingin memesan menu lagi? (ya/tidak): ");
            lanjutkan = sc.nextLine();
        }

        System.out.println("\nTotal keseluruhan harga pesanan Anda: Rp " + totalKeseluruhan);
    }
}