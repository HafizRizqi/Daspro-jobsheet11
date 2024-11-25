import java.util.Scanner;

public class MarianaCafe11 {

    static int[][] penjualan = new int[5][7];

    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    
 // 1. Fungsi untuk menginputkan data penjualan
    public static void inputPenjualan() {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("Masukkan penjualan untuk menu " + menu[i] + ":");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }
    // 2. Fungsi untuk menampilkan seluruh data penjualan dari hari pertama hingga hari terakhir
    public static void tampilkanPenjualan() {
        System.out.println("\nData Penjualan Selama 7 Hari:");
        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }
    // 3. Fungsi untuk menampilkan Menu yang memiliki penjualan tertinggi
    public static void menuPenjualanTertinggi() {
        int maxPenjualan = 0;
        String menuTertinggi = "";
        
        for (int i = 0; i < penjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }
        
        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTertinggi);
    }
    //4. Fungsi untuk menampilkan rata-rata penjualan untuk setiap menu
    public static void rataRataPenjualan() {
        for (int i = 0; i < penjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = totalPenjualan / 7.0;
            System.out.println("\nRata-rata penjualan untuk " + menu[i] + ": " + rataRata);
        }
    }

    public static void main(String[] args) {
        inputPenjualan();
        tampilkanPenjualan();
        menuPenjualanTertinggi();
        rataRataPenjualan();
    }
}
