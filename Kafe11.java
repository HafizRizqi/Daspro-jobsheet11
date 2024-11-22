public class Kafe11 {
    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.err.println("Selamat datang. " + namaPelanggan + "! ");

        if (isMember) {
            System.err.println("Anda adalah Member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid: Anda mendapatkan diskon 50% untuk pembelian!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid: Anda mendapatkan diskon 30% untuk pembelian!");
        } else {
            System.out.println("Kode promo tidak valid.");
        }
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("Latte - Rp 22,000");
        System.out.println("Teh Tarik - Rp 12,000");
        System.out.println("Roti Bakar - Rp 10,000");
        System.out.println("Mie Goreng - Rp 18,000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }
    public static void main(String[] args) {
        menu("Andi", true, "DISKON50");
        System.out.println("");
        menu("Khesa", false, "DISKON30");
        System.out.println("");
        menu("Angga", false, "SALAHKODE");
        System.out.println("");
    }
}