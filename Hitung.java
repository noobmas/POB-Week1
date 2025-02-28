public class Hitung {

    public static void main(String[] args) {
        double sisi = 4;
        double alas = 3, tinggi = 4, sisi1 = 3, sisi2 = 4, sisi3 = 5;
        double jariJari = 5;
        double sisiKubus = 3;

        // Persegi
        double luasPersegi = hitungLuasPersegi(sisi);
        double kelilingPersegi = hitungKelilingPersegi(sisi);
        printHasil("Persegi", luasPersegi, kelilingPersegi);

        // Segitiga
        double luasSegitiga = hitungLuasSegitiga(alas, tinggi);
        double kelilingSegitiga = hitungKelilingSegitiga(sisi1, sisi2, sisi3);
        printHasil("Segitiga", luasSegitiga, kelilingSegitiga);

        // Lingkaran
        double luasLingkaran = hitungLuasLingkaran(jariJari);
        double kelilingLingkaran = hitungKelilingLingkaran(jariJari);
        printHasil("Lingkaran", luasLingkaran, kelilingLingkaran);

        // Kubus
        double luasPermukaanKubus = hitungLuasPermukaanKubus(sisiKubus);
        double volumeKubus = hitungVolumeKubus(sisiKubus);
        printHasilKubus("Kubus", luasPermukaanKubus, volumeKubus);
    }

    // Metode untuk menghitung luas dan keliling persegi
    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    public static double hitungKelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    // Metode untuk menghitung luas dan keliling segitiga
    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static double hitungKelilingSegitiga(double sisi1, double sisi2, double sisi3) {
        return sisi1 + sisi2 + sisi3;
    }

    // Metode untuk menghitung luas dan keliling lingkaran
    public static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static double hitungKelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;
    }

    // Metode untuk menghitung luas permukaan dan volume kubus
    public static double hitungLuasPermukaanKubus(double sisi) {
        return 6 * sisi * sisi;
    }

    public static double hitungVolumeKubus(double sisi) {
        return sisi * sisi * sisi;
    }

    // Metode untuk mencetak hasil persegi, segitiga, dan lingkaran
    public static void printHasil(String bentuk, double luas, double keliling) {
        System.out.printf("%s:\n", bentuk);
        System.out.printf("  Luas: %.2f\n", luas);
        System.out.printf("  Keliling: %.2f\n\n", keliling);
    }

    // Metode untuk mencetak hasil kubus
    public static void printHasilKubus(String bentuk, double luasPermukaan, double volume) {
        System.out.printf("%s:\n", bentuk);
        System.out.printf("  Luas Permukaan: %.2f\n", luasPermukaan);
        System.out.printf("  Volume: %.2f\n", volume);
    }
}
