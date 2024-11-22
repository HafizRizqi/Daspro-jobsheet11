import java.util.Scanner;
public class Kubus11 {
    public static int hitungVolume (int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }
    public static int hitungLuasPermukaan (int sisi) {
        int LuasPermukaan = 6 * sisi * sisi;
        return LuasPermukaan;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan sisi: ");
        int sisi = input.nextInt();

        int LP = hitungLuasPermukaan(sisi);
        System.out.println("Luas Permukaan kubus adalah: "+ LP );
        int vol = hitungVolume(sisi);
        System.out.println("Volume kubus adalah: " + vol);
    }
}