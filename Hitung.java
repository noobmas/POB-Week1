public class Hitung {
    public static void main(String[] args) {
        double sisi = 4;
        double alas = 3, tinggi = 4, sisi1 = 3, sisi2 = 4, sisi3 = 5;
        double jariJari = 5;
        double sisiKubus = 3;

        double luasPersegi = sisi * sisi;
        double kelilingPersegi = 4 * sisi;
        System.out.println("Luas Persegi: " + luasPersegi);
        System.out.println("Keliling Persegi: " + kelilingPersegi);

        double luasSegitiga = 0.5 * alas * tinggi;
        double kelilingSegitiga = sisi1 + sisi2 + sisi3;
        System.out.println("Luas Segitiga: " + luasSegitiga);
        System.out.println("Keliling Segitiga: " + kelilingSegitiga);

        double luasLingkaran = Math.PI * jariJari * jariJari;
        double kelilingLingkaran = 2 * Math.PI * jariJari;
        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);

        double luasPermukaanKubus = 6 * sisiKubus * sisiKubus;
        double volumeKubus = sisiKubus * sisiKubus * sisiKubus;
        System.out.println("Luas Permukaan Kubus: " + luasPermukaanKubus);
        System.out.println("Volume Kubus: " + volumeKubus);
    }
}
