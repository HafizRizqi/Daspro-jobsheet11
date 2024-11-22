public class PengunjungCafe11 {
    public static void daftarPengunjung (String... namaPengunjung) {
        System.out.println("Daftar nama Pengunjung: ");
        for (String pengunjung : namaPengunjung) {
            System.out.println("- " + pengunjung);
        }
    }
    public static void hargaJual (Integer... bayar) {
        System.out.println("Daftar Budak: ");
        for (int harga : bayar) {
            System.out.println("Rp " + harga);
        }

    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        hargaJual(15000, 20000, 22000);
    }
}